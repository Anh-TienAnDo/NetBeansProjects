// Chỉ hiển thị những gì cần thiết, ẩn chi tiết phức tạp đi.
// Class trừu tượng (không thể tạo object trực tiếp)
abstract class Payment {
    abstract void pay(double amount); // Phương thức trừu tượng (chưa có code)
}

// Thanh toán bằng thẻ
class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VNĐ qua thẻ ngân hàng.");
    }
}

// Thanh toán bằng ví điện tử
class EWalletPayment extends Payment {
    void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VNĐ qua ví điện tử.");
    }
}

public class Truu_tuong {
    public static void main(String[] args) {
        Payment payment = new CardPayment();
        payment.pay(500000);
        
        payment = new EWalletPayment();
        payment.pay(200000);
    }
}
