/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyFamily;

import java.time.chrono.ThaiBuddhistEra;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Father extends Person {

    protected boolean gioi_tinh = true;
    protected List<String> wifeIs;
    protected List<String> childIs;

    public Father() {
    }

    public Father(List<String> wifeIs, List<String> childIs, String ten, int tuoi, String fatherIs, String motherIs) {
        super("Bo " + ten, tuoi, false, fatherIs, motherIs); // tham chiếu đến các thuộc tính sau đó ghi đè
        this.wifeIs = wifeIs;
        this.childIs = childIs;
    }

    public Father(List<String> wifeIs, List<String> childIs) {
        this.wifeIs = wifeIs;
        this.childIs = childIs;
    }

    @Override
    public void Noi() {
        System.out.println("super.gioi_tinh: " + super.gioi_tinh); // tham chiếu đến giá trị lớp cha
        super.Noi(); // super là biến tham chiếu đến thuộc tính và phương thức của lớp cha
        System.out.println("talk less");
    }

    public static void main(String[] args) {
        Person p = new Person(); // tự động khởi tạo giá trị: null, 0, true ...
        System.out.println("p.gioi_tinh: " + p.gioi_tinh);

        Father f = new Father(null, null, "Canh", 58, null, null);
        System.out.println(f.ten);

        f.ten = "Canh";
        System.out.println(f.ten);

        f.childIs = Arrays.asList("Mr Phong", "Mrs Phongf");
        System.out.println("child's: " + f.childIs);

        f.Chay();
        f.Noi(); //ghi đè phương thức
        System.out.println(f.gioi_tinh); // kq = true 
    }
}
