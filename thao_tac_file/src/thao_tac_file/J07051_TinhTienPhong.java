/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07051_TinhTienPhong {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<DsKH> ds = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for (int j = 1; j <= t; j++) {
            ds.add(new DsKH(j,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),
            Integer.parseInt(sc.nextLine())));
        }
        ds.sort(Comparator.comparing(DsKH::getTong).reversed());
        for (DsKH d : ds) {
            d.show();
        }
    }

    private static class DsKH {

        private String ma,ten="",phong;
        private Long soNgay, tong;

        public DsKH(int ma, String ten, String phong, String vao, String ra, Integer phi) throws ParseException {
            this.ma = "KH"+String.format("%02d", ma);
            String s = ten.trim();
            while(s.contains("  ")==true){
                s=s.replace("  ", " ");
            }
            String ms[]=s.split(" ");
            for (String m : ms) {
                this.ten=this.ten+m.substring(0,1).toUpperCase()+m.substring(1).toLowerCase()+" ";
            }
            this.phong = phong.trim();
            Date in = new SimpleDateFormat("dd/MM/yyyy").parse(vao);
            Date out = new SimpleDateFormat("dd/MM/yyyy").parse(ra);
            long diff = out.getTime()-in.getTime();
            long Days = (Long)(diff / (24 * 60 * 60 * 1000))+1;
            this.soNgay = Days;
            if(phong.charAt(0)=='1'){
                this.tong=phi+(25*Days);
            } else {
                if(phong.charAt(0)=='2'){
                    this.tong=phi+(34*Days);
                } else{
                    if(phong.charAt(0)=='3') {
                        this.tong = phi + (50*Days);
                    } else this.tong = phi + (80*Days);
                }
            }
        }

        public Long getTong() {
            return tong;
        }
        public void show(){
            System.out.println(this.ma+" "+this.ten+this.phong+" "+this.soNgay+" "+this.tong);
        }
    }
    
}
