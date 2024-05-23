/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_java;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.math.BigInteger;
public class hieu_hai_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            BigInteger a=scan.nextBigInteger();
            BigInteger b=scan.nextBigInteger();
            BigInteger x=a.subtract(b);
            x=x.abs();
            String s=x.toString();
            String m=a.toString();
            String n=b.toString();
            int maxx=Math.max(m.length(),n.length());
            while(s.length()<maxx){
                s="0"+s;
            }
            System.out.println(s);
        }
    }
}
