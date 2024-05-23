/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSachPhim {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n,m;
//        n=sc.nextInt();
//        m=sc.nextInt();
//        sc.nextLine();
//        Map<String,String> tl = new HashMap<>();
//        for (int l = 1; l <= n; l++) {
//            tl.put("TL"+String.format("%03d", l), sc.nextLine().trim());
//        }
//        ArrayList<DSphim> ds = new ArrayList<>();
//        for(int l=1;l<=m;l++){
//            ds.add(new DSphim(l,tl.get(sc.nextLine()),
//                    sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
//        }
//        ds.sort(Comparator.comparing(DSphim::getNgay).thenComparing(DSphim::getTen)
//        .thenComparing(DSphim::getTap).reversed());
//        for (DSphim d : ds) {
//            d.show();
//        }
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        Map<String, String> tl = new HashMap<>();
        for (int l = 0; l < n; l++) {
            tl.put("TL"+String.format("%03d", l+1), sc.nextLine().trim());
        }
        ArrayList<DSphim> ds = new ArrayList<>();
        for(int i=1;i<=m;i++){
            ds.add(new DSphim(i,tl.get(sc.nextLine()),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        ds.sort(Comparator.comparing(DSphim::getNgay).thenComparing(DSphim::getTen).thenComparing(DSphim::getTap).reversed());
        for (DSphim d : ds) {
            d.show();
        }
    }
    
    public static class DSphim{
        private String ma,tl,ngay,ten;
        private Integer tap;

        public DSphim(int ma, String tl, String ngay, String ten, Integer tap) {
            this.ma = "P"+String .format("%03d", ma);
            this.tl = tl;
            this.ngay = ngay;
            this.ten = ten;
            this.tap = tap;
        }

        public String getNgay() {
            String s[]=this.ngay.split("/");
            return s[2]+s[1]+s[0];
        }

        public String getTen() {
            return ten;
        }

        public Integer getTap() {
            return tap;
        }
        
        public void show(){
            System.out.println(ma + " " + tl + " " + ngay + " " + ten + " " + tap);
        }
        
    }

//    public static class DSphim {
//
//        private String ma, tl, ngay, ten;
//        private Integer tap;
//        
//        public DSphim(int ma, String tl, String ngay, String ten, int tap) {
//            this.ma = "P" + String.format("%03d", ma);
//            this.tl = tl;
//            this.ngay = ngay;
//            this.ten = ten;
//            this.tap = tap;
//        }
//
//        public void show() {
//            System.out.println(ma + " " + tl + " " + ngay + " " + ten + " " + tap);
//        }
//        
//        public String getNgay() {
//            String s[] = this.ngay.split("/");
//            return s[2] + s[1] + s[0];
//        }
//        
//        public String getTen() {
//            return ten;
//        }
//        
//        public Integer getTap() {
//            return tap;
//        }
//        
//    }
}
