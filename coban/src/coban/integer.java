/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coban;

/**
 *
 * @author Admin
 */
public class integer {

    public static void main(String[] args) {
        Integer a;
        Integer b = 2234;
        String s = "1234";
        a = Integer.valueOf(s);
        System.out.println("a+1= " + a + 1);
        String s1 = a.toString();
        System.out.println("s1= " + s1);
        System.out.println("max a va b " + Integer.max(a, b));
        int c = b + a;
        System.out.println("a+b= " + c);
        System.out.println("tong= " + Integer.sum(c, a));
        System.out.println("dang nhi phan cua s: " + Integer.toBinaryString(a));

    }

}
