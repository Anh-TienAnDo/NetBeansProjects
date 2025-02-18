
// Chỉ hiển thị những gì cần thiết, ẩn chi tiết phức tạp đi.
// Class trừu tượng (không thể tạo object trực tiếp)

public class Truu_tuong {
    public static void main(String[] args) {
        Payment paymentCard = new CardPayment(); 
        OrderTask order1 = new OrderTask("1001", paymentCard, 100000.0);
        order1.complete();
        Payment paymentEWallet = new EWalletPayment();
        OrderTask order2 = new OrderTask("1002", paymentEWallet, 200000.0);
        order2.complete();
    }
}
