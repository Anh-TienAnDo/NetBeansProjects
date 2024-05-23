/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lop_PhanSo_J4003 {
    //    public static class PhanSo {
//
//        private BigInteger tu;
//        private BigInteger mau;
//
//        public PhanSo(BigInteger tu, BigInteger mau) {
//            this.tu = tu;
//            this.mau = mau;
//        }
//
//        public void show() {
//            System.out.println((tu.divide(tu.gcd(mau))) + "/" + (mau.divide(tu.gcd(mau))));
//        }
//
//    }
//    
//    public static BigInteger nhap(){
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        BigInteger bs1 = new BigInteger(s1);
//        return bs1;
//        
//    }
    
    public static void main(String[] args) {
        // TODO code application logic here

//        Operator a = new Operator();
//        System.out.println(a.add(3,4));
//        System.out.println(a.add(3, 4.0f));
//        System.out.println(a.add(3.0f,4.0f));
//        System.out.println(a.add("ab","12"));
        
//        PhanSo ps = new PhanSo(nhap(), nhap());
//        PhanSo ps1 = new PhanSo(nhap(), nhap());
//        ps.show();

        Scanner sc = new Scanner(System.in);
        long t1,m1,t2,m2;
        long t,m;
        t1=sc.nextLong();
        m1=sc.nextLong();
        t2=sc.nextLong();
        m2=sc.nextLong();
        t = (t1*m2 + t2*m1);
        m = m1*m2;
        System.out.println((t/gcd(t,m))+"/"+(m/gcd(t,m)));
    }

    private static long gcd(long t, long m) {
        if(m==0) return t;
        return gcd(m,t%m);
    }
}
