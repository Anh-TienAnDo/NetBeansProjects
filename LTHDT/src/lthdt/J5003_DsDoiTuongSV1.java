/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author Admin
 */
public class J5003_DsDoiTuongSV1 {

    static class DsSinhVien {

        private String ma, ten, lop;
        private Date sinh;
        private Double diem;

        public DsSinhVien(int i, String ten, String lop, String sinh, Double diem) throws ParseException {
            this.ma = "B20DCCN" + String.format("%03d", i);
            this.ten = XuLyTen(ten);
            this.lop = lop;
            this.sinh = new SimpleDateFormat("dd/mm/yyyy").parse(sinh);
            this.diem = diem;
        }

        public String XuLyTen(String ten) {
            String s = ten.trim();
            while (s.contains("  ") == true) {
                s = s.replace("  ", " ");
            }
            String[] s1 = s.split(" ");
            String kq="";
            for (String string : s1) {
                string = string.toLowerCase();
                kq = kq + string.substring(0, 1).toUpperCase() + string.substring(1) + " ";
            }
            return kq;
        }

        public Double getDiem() {
            return diem;
        }

        public void show() {
            DecimalFormat de = new DecimalFormat("#0.00");
            System.out.println(this.ma + " " + this.ten + this.lop + " "
                    + new SimpleDateFormat("dd/mm/yyyy").format(this.sinh) + " " + de.format(this.diem));
        }

    }

    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<DsSinhVien> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            DsSinhVien d = new DsSinhVien(i, sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), Double.parseDouble(sc.nextLine()));
            ds.add(d);
        }
        Collections.sort(ds, new Comparator<DsSinhVien>() {
            @Override
            public int compare(DsSinhVien o1, DsSinhVien o2) {
                if (o1.getDiem().compareTo(o2.getDiem()) > 0) {
                    return -1;
                }
                return 1;
            }
        });
        for (DsSinhVien d : ds) {
            d.show();
        }
    }
}
