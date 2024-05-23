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
public class J7081_SapXepDsSV {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<DsSV> Ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Ds.add(new DsSV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Ds.sort(Comparator.comparing(DsSV::getTen).thenComparing(DsSV::getHo).thenComparing(DsSV::getTenDem).thenComparing(DsSV::getMa));
        for (DsSV D : Ds) {
            System.out.println(D);
//            System.out.println(D.getHo()+D.getTenDem()+D.getTen());
        }
    }

    private static class DsSV {
        private String ma,ten,phone,email;

        public DsSV(String ma, String ten, String phone, String email) {
            this.ma=ma;
            this.ten=ten;
            this.phone=phone;
            this.email=email;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            String ten[]=this.ten.split(" ");
            return ten[ten.length-1];
        }
        public String getHo() {
            String ten[]=this.ten.split(" ");
            return ten[0];
        }
        public String getTenDem() {
            String ten[]=this.ten.split(" ");
            String tmp="";
            for (int i=1;i<ten.length-1;i++) {
                tmp=tmp+ten[i];
            }
            return tmp;
        }

        @Override
        public String toString() {
            return  ma + " " + ten + " " + phone + " " + email;
        }

    }
    
}
