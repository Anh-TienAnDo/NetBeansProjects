/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_java;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class dia_chi_email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> a = new ArrayList<String>();
        while(n-->0){
            String s = sc.nextLine();
            String s1=s.trim();
            String kq="";
            int dem=1;
            while (s1.contains("  ") == true) {
                s1 = s1.replace("  ", " ");
            }
            String hoten[] = s1.split(" ");
            kq=kq+hoten[hoten.length-1].toLowerCase();
            for(int i=0;i<hoten.length-1;i++){
                kq=kq+(hoten[i].toLowerCase().substring(0,1));
            }
            for(String tmp : a){
               if(tmp.contains(kq)) dem+=1;
            }
            a.add(kq);
            if(dem>1) kq=kq+dem;
            System.out.println(kq+"@ptit.edu.vn");
        }
    }
}
