/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J5026_DsGiangVienTheoBoMon {

    public static void main(String[] args) {
        ArrayList<DsGV> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            ds.add(new DsGV(i + 1, sc.nextLine(), sc.nextLine()));
        }
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s = sc.nextLine();
            String[] ms = s.split(" ");
            String yc = "";
            for (String m : ms) {
                yc = yc + m.substring(0, 1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+yc+":");
            for (DsGV d : ds) {
                if(d.getBoMon().equals(yc)){
                    d.show();
                }
            }
        }
    }

    private static class DsGV {

        private String ma, ten, boMon="";

        public DsGV(int ma, String ten, String boMon) {
            this.ma = "GV" + String.format("%02d", ma);
            this.ten = ten;
            String[] mon = boMon.split(" ");
            for (String s : mon) {
                this.boMon = this.boMon + s.substring(0, 1).toUpperCase();
            }
        }

        public void show() {
            System.out.println(this.ma + " " + this.ten + " " + this.boMon);
        }

        public String getBoMon() {
            return boMon;
        }

    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//Cong nghe phan mem
