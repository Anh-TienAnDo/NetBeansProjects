/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class TH16_10 {

    public static class ThiSinh {

        private String ma, ten, team;

        public ThiSinh(int ma, String ten, String team) {
            this.ma = "C" + String.format("%03d", ma);
            this.ten = ten;
            this.team = team;
        }
        
        public String show(String[] donVi){
            Integer so = Integer.valueOf(team.substring(4));
            return ma+" "+ten+" "+donVi[so-1];
            
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        sc.nextLine();
        String[] donVi = new String[t1];
        for (int i = 0; i < t1; i++) {
            String team, truong;
            team = sc.nextLine();
            truong = sc.nextLine();
            donVi[i] = team + " " + truong;
        }

        int t2 = sc.nextInt();
        sc.nextLine();
        TreeSet<String> tree = new TreeSet<>();
        String[] kq = new String[t2];
        for(int j=0;j<t2;j++){
            String name,team;
            name = sc.nextLine();
            team = sc.nextLine();
            ThiSinh ts = new ThiSinh(j+1, name, team);
            tree.add(name);
            kq[j]=ts.show(donVi);
//            System.out.println(kq[j]);
        }
        
        for (String t : tree) {
            for (int i = 0; i < kq.length; i++) {
                String string = kq[i];
                if(string.contains(t)) System.out.println(string);
            }
        }
//        Scanner sc = new Scanner(new File("DAYSO.in"));
//                String n = sc.nextLine();
//        List<String> a = new ArrayList<String>();
//        while (sc.hasNextLine()) {
//            String s = sc.nextLine();
//            String s1 = s.trim();
//            String kq = "";
//            int dem = 1;
//            while (s1.contains("  ") == true) {
//                s1 = s1.replace("  ", " ");
//            }
//            String hoten[] = s1.split(" ");
//            kq = kq + hoten[hoten.length - 1].toLowerCase();
//            for (int i = 0; i < hoten.length - 1; i++) {
//                kq = kq + (hoten[i].toLowerCase().substring(0, 1));
//            }
//            for (String tmp : a) {
//                if (tmp.contains(kq)) {
//                    dem += 1;
//                }
//            }
//            a.add(kq);
//            if (dem > 1) {
//                kq = kq + dem;
//            }
//            System.out.println(kq + "@ptit.edu.vn");
//        }
//        int t = sc.nextInt();
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int[] a = new int[n];
//            int i=0;
//            while(n-->0){
//                a[i]=sc.nextInt();
//                i++;
//            }
//            
//            int tmp=0;
//            for(int k=0;k<a.length-1;k++){
//                for (int j = k+1; j < a.length; j++) {
//                    if (a[k]>a[j]) {
//                        tmp = a[j];
//                        a[j] = a[k];
//                        a[k] = tmp;
//                    }
//                }
//            }
//            long sum1=0,sum2=0;
//            long sum=0;
//            for (int j = 0; j < a.length; j++) {
//                    if(j%2==0) sum1=sum1*10+a[j];
//                    else sum2=sum2*10+a[j];
//            }
//            sum=sum1+sum2;
//            System.out.println(sum);
//
//        }
    }

}
