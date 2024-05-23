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
public class Lop_NhanVien_J4007 {
    public static class NhanVien {

        private String code, name, gt, bd, address, thue, wd;

        public NhanVien() {
        }
        
        public NhanVien(String name, String gt, String bd, String address, String thue, String wd) {
            this.name = name;
            this.gt = gt;
            this.bd = bd;
            this.address = address;
            this.thue = thue;
            this.wd = wd;
        }

        public void nhap(Scanner sc) {
            name = sc.nextLine();
            gt = sc.nextLine();
            bd = sc.nextLine();
            address = sc.nextLine();
            thue = sc.nextLine();
            wd = sc.nextLine();
        }

        public void Code(Integer i) {
            String s = Integer.toString(i);
            while (s.length() < 5) {
                s = '0' + s;
            }
            this.code = s;
        }

        public void xuat() {
            System.out.println(code + " " + name + " " + gt + " "
                    + bd + " " + address + " "
                    + thue + " " + wd);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        Integer i=1;
        nv.nhap(sc);
        nv.Code(i);
        nv.xuat();
    }
}
