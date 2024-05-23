/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J05031_BangDiemThanhPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DsBD> ds = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            ds.add(new DsBD(sc.nextLine(),sc.nextLine(),sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())));
        }
        ds.sort(Comparator.comparing(DsBD::getTen));
        for (int i = 0; i < ds.size(); i++) {
            System.out.print((i+1)+" ");
            ds.get(i).show();
        }
    }

    private static class DsBD {

        private String ma,ten,lop;
        private Double d1,d2,d3;

        public DsBD(String ma, String ten, String lop, Double d1, Double d2, Double d3) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }

        public String getTen() {
            return ten;
        }
        public void show(){
            DecimalFormat de = new DecimalFormat("#0.0");
            System.out.println(this.ma+" "+this.ten+" "+this.lop+" "+
                    de.format(this.d1)+" "+de.format(this.d2)+" "+de.format(this.d3));
        }
        
    }
}
