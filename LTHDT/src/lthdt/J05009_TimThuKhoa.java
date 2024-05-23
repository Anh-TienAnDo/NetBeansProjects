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
public class J05009_TimThuKhoa {
    static class DsSV{
        private int ma;
        private String ten;
        private Date sinh;
        public Double toan,ly,hoa,tong;

        public DsSV(int ma, String ten, String sinh, Double toan, Double ly, Double hoa) throws ParseException {
            this.ma = ma;
            this.ten = ten;
            this.sinh = new SimpleDateFormat("dd/mm/yyyy").parse(sinh);
            this.toan = toan;
            this.ly = ly;
            this.hoa = hoa;
            this.tong = toan + ly + hoa;
        }

        
        @Override
        public String toString() {
            return ma + " "
                    + ten + " "
                    + new SimpleDateFormat("dd/mm/yyyy").format(sinh) + " "
                    + tong + " ";
        }

        public Double getTong() {
            return tong;
        }

        
        
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DsSV> ds = new ArrayList<>();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            DsSV sv = new DsSV(i,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            ds.add(sv);
        }
        ds.sort(Comparator.comparing(DsSV::getTong).reversed());
        
        for (DsSV ts : ds) {
            if (ts.tong.equals(ds.get(0).tong)) {
                System.out.println(ts);
            }
//            ts.show();
        }
    }
}
