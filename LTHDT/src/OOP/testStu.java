/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Admin
 */
public class testStu {
    public static void main(String[] args) {
//        Student student = null; // giá trị student = null
        Student student = new Student(); // các giá trị thuộc tính = null
//        student.id="001";
//        System.out.println(student.id);
        student.age=10;
        System.out.println(student.age);
        System.out.println(student.getId());
        
        student.setPoint((float)7);
        System.out.println(student.Tong());
    }
}
