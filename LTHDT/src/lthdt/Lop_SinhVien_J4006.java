/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lop_SinhVien_J4006 {

    public class co_ban {

        public static class sinhvien {

            private String name;
            private float diem;
            private String code, date;

            public sinhvien() {
            }

            public void nhap() {
                Scanner sc = new Scanner(System.in);
                this.name = sc.nextLine();
                this.code = sc.nextLine();
                this.date = sc.nextLine();
                this.diem = sc.nextFloat();
            }

            public void xuat() {
                String s = date;
                if (s.charAt(1) == '/') {
                    s = '0' + s;
                }
                if (s.charAt(4) == '/') {
                    s = s.substring(0, 3) + '0' + s.substring(3);
                }
                System.out.print("B20DCCN001 " + name + " " + code + " " + s + " ");
                DecimalFormat de = new DecimalFormat("#0.00");
                System.out.println(de.format(diem));
            }

        }

        public static void main(String[] args) {
            sinhvien SV = new sinhvien();
            SV.nhap();
            SV.xuat();
        }

    }
}
