// Giúp một phương thức có thể hoạt động theo nhiều cách khác nhau, tùy thuộc vào đối tượng gọi nó.
// Class cha
class Order {
    void calculateShippingFee() {
        System.out.println("Phí giao hàng tiêu chuẩn: 30.000 VNĐ");
    }
}

// Class con 1: Đơn hàng nhanh
class ExpressOrder extends Order {
    @Override
    void calculateShippingFee() {
        System.out.println("Phí giao hàng nhanh: 50.000 VNĐ");
    }
}

// Class con 2: Đơn hàng quốc tế
class InternationalOrder extends Order {
    @Override
    void calculateShippingFee() {
        System.out.println("Phí giao hàng quốc tế: 200.000 VNĐ");
    }
}

public class Da_hinh {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new ExpressOrder();
        Order order3 = new InternationalOrder();

        order1.calculateShippingFee();
        order2.calculateShippingFee();
        order3.calculateShippingFee();
    }
}
