/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J5023_LietKeSVtheoKhoa {
    static class Student {

        private String ID;
        private String name;
        private String lop;
        private String email;
        private String khoa;

        public Student() {
        }

        public void nhap(Scanner sc) {
            ID = sc.nextLine();
            name = sc.nextLine();
            lop = sc.nextLine();
            email = sc.nextLine();
            khoa = String.valueOf((lop.charAt(1) + lop.charAt(2)));
        }

        public String getKhoa() {
            return khoa;
        }

        @Override
        public String toString() {
            return ID + " "
                    + name + " "
                    + lop + " "
                    + email;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Student> ds = new ArrayList<>();
        while (t-- > 0) {
            Student i = new Student();
            i.nhap(sc);
            ds.add(i);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String data = sc.nextLine();
            String khoa = String.valueOf((data.charAt(2) + data.charAt(3)));
            System.out.println("DANH SACH SINH VIEN KHOA " + data + ":");
            for (Student i : ds) {
                if (i.getKhoa().equals(khoa)) {
                    System.out.println(i);
                }
            }
        }
    }
}
