import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Nhập số lượng sản phẩm: ");
            int quantity = scanner.nextInt(); // Có thể gây lỗi nếu nhập sai

            System.out.print("Nhập giá sản phẩm: ");
            double price = scanner.nextDouble(); // Có thể gây lỗi nếu nhập sai

            double total = quantity * price;
            System.out.println("Tổng tiền: " + total + " VNĐ");
            
        } catch (Exception e) {
            System.out.println("Lỗi: Bạn đã nhập sai! Hãy nhập số hợp lệ.");
        } finally {
            scanner.close(); // Luôn đóng Scanner để tránh rò rỉ bộ nhớ
            System.out.println("Kết thúc xử lý đơn hàng.");
        }
    }
}
