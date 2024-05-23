/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J05006_DsNhanVien {
    static class DsNV{
        private String ma,ten,gt,dc,thue;
        private Date sinh,ngay;

        public DsNV(int ma, String ten, String gt, String sinh, String dc, String thue, String ngay) throws ParseException {
            this.ma = String.format("%05d", ma);
            this.ten = ten;
            this.gt = gt;
//            this.sinh = new SimpleDateFormat("dd/mm/yyyy").parse(sinh);
            this.sinh = new SimpleDateFormat("dd/mm/yyyy").parse(sinh);
            this.dc = dc;
            this.thue = thue;
            this.ngay = new SimpleDateFormat("dd/mm/yyyy").parse(ngay);
        }
        public void show(){
            System.out.println(ma+" "+ten+" "+gt+" "+
                    new SimpleDateFormat("dd/mm/yyyy").format(sinh)+" "+dc+" "+thue+" "
                    + new SimpleDateFormat("dd/mm/yyyy").format(ngay));
        }

        public String getNgay() {
            String s =new SimpleDateFormat("dd/mm/yyyy").format(sinh);
            return s;
        }
        
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DsNV> ds = new ArrayList<>();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            DsNV nv = new DsNV(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(nv);
        }
        Collections.sort(ds,new Comparator<DsNV>(){
            @Override
            public int compare(DsNV o1, DsNV o2) {
                String ngay1 = o1.getNgay();
                String ngay2 = o2.getNgay();
                String[] ms1 = ngay1.split("/");
                String[] ms2 = ngay2.split("/");
                String cs1="";
                String cs2="";
                for (int i = ms1.length-1; i>=0; i--) {
                    cs1=cs1+ms1[i];
                    cs2=cs2+ms2[i];
                }
                if(cs1.compareTo(cs2)>0){
                    return -1;
                }
                return 1;
            }
            
        });
        for (DsNV d : ds) {
            d.show();
        }
    }
}
