import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class OrderTask implements Runnable {
    private String orderId;

    public OrderTask(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        System.out.println("Xử lý đơn hàng: " + orderId);
        try { Thread.sleep(2000); } catch (InterruptedException e) { }
        System.out.println("Hoàn thành đơn hàng: " + orderId);
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new OrderTask("1001"));
        executor.submit(new OrderTask("1002"));
        executor.submit(new OrderTask("1003"));
        executor.shutdown();
    }
}
