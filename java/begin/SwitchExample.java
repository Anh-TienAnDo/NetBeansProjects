public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Hôm nay là Thứ Hai.");
                break;
            case 2:
                System.out.println("Hôm nay là Thứ Ba.");
                break;
            case 3:
                System.out.println("Hôm nay là Thứ Tư.");
                break;
            default:
                System.out.println("Không phải ngày hợp lệ.");
        }
    }
}

