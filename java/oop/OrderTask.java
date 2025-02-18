class OrderTask{
    private String orderId;
    private Payment payment;
    private double amount;

    public OrderTask(String orderId, Payment payment, double amount) {
        this.orderId = orderId;
        this.payment = payment;
        this.amount = amount;
    }

    public void complete() {
        System.out.println("Hoàn thành đơn hàng: " + orderId);
        payment.pay(amount);
    }
}