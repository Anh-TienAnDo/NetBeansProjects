abstract class Payment {
    abstract void pay(double amount); // Phương thức trừu tượng (chưa có code)
}

// Thanh toán bằng thẻ
class CardPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VNĐ qua thẻ.");
    }
}

// Thanh toán bằng ví điện tử
class EWalletPayment extends Payment {
    void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VNĐ qua ví điện tử.");
    }
}
