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
public class J04015_tinhThuNhapGiaoVien {
    public static class TinhThuNhap{
        String chucVu,ten,ma;
        long luongCoBan,heSo,phuCap,luong;

        public TinhThuNhap(String chucVu, String ten, long luongCoBan) {
            this.chucVu = chucVu;
            this.ten = ten;
            this.luongCoBan = luongCoBan;
            this.ma = this.chucVu.substring(0, 2);
            this.heSo = Long.parseLong(this.chucVu.substring(2));
            if(this.ma.equals("HT")){
                this.phuCap=2000000;
            } else{
                if(this.ma.equals("HP")){
                    this.phuCap=900000;
                }
                else{
                    this.phuCap=500000;
                }
            }
            this.luong=(luongCoBan*heSo)+phuCap;
        }

        @Override
        public String toString() {
            return this.chucVu+" "+this.ten+" "
                    +this.heSo+" "+this.phuCap
                    +" "+this.luong;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TinhThuNhap> ds = new ArrayList<>();
        String chucVu,ten;
        long luongCoBan;
        chucVu=sc.nextLine();
        ten=sc.nextLine();
        luongCoBan=sc.nextLong();
        ds.add(new TinhThuNhap(chucVu, ten, luongCoBan));
        for (TinhThuNhap d : ds) {
           System.out.println(d); 
        }
    }
}
