/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07033_DsSVcoban {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<DsSV> ds = new ArrayList<>();
        while (t-- > 0) {
            ds.add(new DsSV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        ds.sort(Comparator.comparing(DsSV::getMa));
        for (DsSV d : ds) {
            d.show();
        }
    }

    private static class DsSV {

        private String ma, ten = "", lop, email;

        public DsSV(String ma, String ten, String lop, String email) {
            this.ma = ma;
            this.lop = lop;
            this.email = email;
            String s = ten.trim();
            while (s.contains("  ")==true) {
                s = s.replace("  ", " ");
            }
            String ms[] = s.split((" "));
            for (String m : ms) {
                this.ten = this.ten + m.substring(0, 1).toUpperCase() + m.substring(1).toLowerCase() + " ";
            }
        }

        public String getMa() {
            return ma;
        }
        

        public void show() {
            System.out.println(this.ma + " " + this.ten + this.lop + " " + this.email);
        }
    }
}
