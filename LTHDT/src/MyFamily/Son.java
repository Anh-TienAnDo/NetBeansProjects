/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyFamily;

/**
 *
 * @author Admin
 */
public class Son extends Person{

    public Son(String ten, int tuoi,  String fatherIs, String motherIs) {
        super(ten, tuoi, true, fatherIs, motherIs);
    }

    public Son() {
    }
    
    
    public static void main(String[] args) {
//        Son s = null; // chưa được khởi tạo vùng nhớ
        Son s = new Son("anh", 0, "canh", "hanh");
        Person p = new Person();
        System.out.println(s.gioi_tinh);
        System.out.println(p.gioi_tinh);
    }
}
