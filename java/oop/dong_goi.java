// Giúp bảo vệ dữ liệu bên trong đối tượng, chỉ cho phép truy cập qua các phương thức đặc biệt.
class Customer {
    private String name;
    private double balance; // Số dư tài khoản (KHÔNG cho phép truy cập trực tiếp)

    // Constructor
    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Phương thức để kiểm tra số dư (đọc dữ liệu an toàn)
    public double getBalance() {
        return balance;
    }

    // Phương thức để nạp tiền vào tài khoản
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(name + " đã nạp " + amount + " VNĐ vào tài khoản.");
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }
}

public class Dong_goi {
    public static void main(String[] args) {
        Customer customer = new Customer("Nguyễn Văn A", 500000);
        
        // Gọi phương thức nạp tiền
        customer.deposit(100000);
        
        // Kiểm tra số dư
        System.out.println("Số dư hiện tại: " + customer.getBalance() + " VNĐ");
    }
}
