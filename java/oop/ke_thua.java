// Giúp một class kế thừa thuộc tính & phương thức của class khác, tránh viết lại code.
// Class cha (Customer)
class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Khách hàng: " + name + ", Số dư: " + balance + " VNĐ");
    }
}

// Class con kế thừa từ Customer
class VIPCustomer extends Customer {
    double discountRate; // Mức giảm giá đặc biệt

    VIPCustomer(String name, double balance, double discountRate) {
        super(name, balance); // Gọi constructor của Customer
        this.discountRate = discountRate;
    }

    void showDiscount() {
        System.out.println(name + " được giảm giá " + (discountRate * 100) + "% trên mỗi đơn hàng!");
    }
}

public class Ke_thua {
    public static void main(String[] args) {
        VIPCustomer vip = new VIPCustomer("Trần B", 2000000, 0.1);
        vip.displayInfo();
        vip.showDiscount();
    }
}
