/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J5011_QuanLyQuanGame {

    public static void main(String[] args) {
        ArrayList<QLquanGame> Ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            Ds.add(new QLquanGame(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Ds.sort(Comparator.comparing(QLquanGame::getGio).reversed().thenComparing(QLquanGame::getPhut).reversed());
        for (QLquanGame D : Ds) {
            D.show();
        }
    }

    private static class QLquanGame {
        private String ma,ten;
        private Integer gio,phut;

        public QLquanGame(String ma, String ten, String gioVao, String gioRa) {
            this.ma = ma;
            this.ten = ten;
            String s1[]=gioVao.split(":");
            String s2[]=gioRa.split(":");
            if(Integer.parseInt(s1[1])>Integer.parseInt(s2[1])){
                this.phut=(Integer)60-Integer.parseInt(s1[1])+Integer.parseInt(s2[1]);
                this.gio=Integer.parseInt(s2[0])-Integer.parseInt(s1[0])-(Integer)1;
            }
            else{
                this.phut=Integer.parseInt(s2[1])-Integer.parseInt(s1[1]);
                this.gio=Integer.parseInt(s2[0])-Integer.parseInt(s1[0]);
            }
        }
        public void show(){
            System.out.println(this.ma+" "+this.ten+" "+this.gio+" gio "+this.phut+" phut");
        }

        public Integer getGio() {
            return gio;
        }

        public Integer getPhut() {
            return phut;
        }
        
    }
}
