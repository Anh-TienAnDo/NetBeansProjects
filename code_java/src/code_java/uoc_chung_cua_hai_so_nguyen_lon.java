/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_java;

/**
 *
 * @author Admin
 */
import java.math.BigInteger;
import java.util.Scanner;
public class uoc_chung_cua_hai_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            String a= scan.next();
            String b= scan.next();
            BigInteger x=new BigInteger(a);
            BigInteger y=new BigInteger(b);
            BigInteger gcd=x.gcd(y);
            BigInteger mul=x.multiply(y);
            System.out.println(mul.divide(gcd));
        }
    }
}
