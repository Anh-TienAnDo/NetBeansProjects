/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07060_SapXepLichThi {
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<DS> ds = new ArrayList<>();
        ArrayList<DsMT> mt = new ArrayList<>();
        ArrayList<DsCT> ct = new ArrayList<>();
        ArrayList<DsLT> lt = new ArrayList<>();
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        int t1,t2,t3;
        t1=sc1.nextInt(); sc1.nextLine();
        while(t1-->0){
            mt.add(new DsMT(sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        t2=sc2.nextInt(); sc2.nextLine();
        for(int i=1;i<=t2;i++){
            ct.add(new DsCT(i,sc2.nextLine(),sc2.nextLine(),sc2.nextLine()));
        }
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        t3=sc3.nextInt(); sc3.nextLine();
        for(int i=1;i<=t3;i++){
            lt.add(new DsLT(sc3.nextLine()));
        }
//        for (DsMT m : mt) {
//            System.out.println(m);
//        }
//        for (DsCT c : ct) {
//            System.out.println(c);
//        }
//        for (DsLT l : lt) {
//            System.out.println(l);
//        }
        String ma,ngay="",gio="",phong="",ten="",nhom;
        Integer sv;
        for (DsLT l : lt) {
            ma=l.getMaCa();
            nhom=l.getNhom();
            sv=l.getSv();
            for (DsMT m : mt) {
                if(m.getMa().equals(l.getMaMon())){
                    ten=m.getTen();
                }
            }
            for (DsCT c : ct) {
                if(l.getMaCa().equals(c.getMa())){
                    ngay=c.getNgay();
                    gio=c.getGio();
                    phong=c.getPhong();
                }
            }
            ds.add(new DS(ma,ngay,gio,phong,ten,nhom,sv));
        }
        ds.sort(Comparator.comparing(DS::getNgay).thenComparing(DS::getGio).thenComparing(DS::getMa));
        for (DS d : ds) {
            d.show();
        }
    }

    private static class DsMT {
        private String ma,ten,ht;

        public DsMT(String ma, String ten, String ht) {
            this.ma = ma;
            this.ten = ten;
            this.ht = ht;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public String getHt() {
            return ht;
        }

        @Override
        public String toString() {
            return "DsMT{" + "ma=" + ma + ", ten=" + ten + ", ht=" + ht + '}';
        }
    }
    private static class DsCT {
        private String ma,ngay,gio,phong;

        public DsCT(int ma, String ngay, String gio, String phong) {
            this.ma = "C"+String.format("%03d", ma);
            this.ngay = ngay;
            this.gio = gio;
            this.phong = phong;
        }

        public String getMa() {
            return ma;
        }

        public String getPhong() {
            return phong;
        }

        public String getNgay() {
            return ngay;
        }

        public String getGio() {
            return gio;
        }

        @Override
        public String toString() {
            return "DsCT{" + "ma=" + ma + ", ngay=" + ngay + ", gio=" + gio + ", phong=" + phong + '}';
        }
    }
    private static class DsLT {
        private String maCa,maMon,nhom;
        private Integer sv;
        public DsLT(String s)  {
            String s1[] = s.split(" ");
            this.maCa=s1[0];
            this.maMon=s1[1];
            this.nhom=s1[2];
            this.sv= Integer.valueOf(s1[3]);
        }

        public String getMaCa() {
            return maCa;
        }

        public String getMaMon() {
            return maMon;
        }

        public String getNhom() {
            return nhom;
        }

        public Integer getSv() {
            return sv;
        }

        @Override
        public String toString() {
            return "DsLT{" + "maCa=" + maCa + ", maMon=" + maMon + ", nhom=" + nhom + ", sv=" + sv + '}';
        }
        
    }

    private static class DS {
        String ma,ngay,gio,phong,ten,nhom;
        Integer sv;

        public DS(String ma, String ngay, String gio, String phong, String ten, String nhom, Integer sv) {
            this.ma = ma;
            this.ngay = ngay;
            this.gio = gio;
            this.phong = phong;
            this.ten = ten;
            this.nhom = nhom;
            this.sv = sv;
        }

        public String getMa() {
            return ma;
        }

        public String getNgay() {
            String s[]=this.ngay.split("/");
            String s1="";
            for (int i=s.length-1;i>=0;i--) {
                s1=s1+s[i];
            }
            return s1;
        }

        public String getGio() {
            return gio;
        }

        public void show(){
            System.out.println(this.ngay+" "+this.gio+" "+this.phong+" "+this.ten+" "+this.nhom+" "+this.sv);
        }
        
    }
}
