/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coban;

import java.math.BigInteger;

/**
 *
 * @author Admin
 */
public class big_integer {

    public static void main(String[] args) {
        BigInteger n = new BigInteger("123456789123456789");
        BigInteger n1;
        n1 = new BigInteger("12345678");
        System.out.println("n+1= " + n + 1); // cong chuoi
        System.out.println("cong 2 so nguyen lon " + n.add(n1));
        System.out.println("tru 2 so nguyen lon " + n.subtract(n1));
        System.out.println("chia 2 so nguyen lon " + n.divide(n1));
        System.out.println("nhan 2 so nguyen lon " + n.multiply(n1));
        System.out.println("mod 2 so nguyen lon " + n.mod(n1));
        System.out.println("pow so nguyen lon " + n.pow(2));
        System.out.println("can so nguyen lon " + n.sqrt());
    }
}
