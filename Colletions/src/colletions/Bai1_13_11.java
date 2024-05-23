/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Bai1_13_11 {

    public static String Ktra(String s){
        Stack<Character> S=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                S.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(S.size()==0 || S.pop()!='('){
                    return "NO";
                }
            } else if(s.charAt(i)==']'){
                if(S.size()==0 || S.pop()!='['){
                    return "NO";
                }
            } else continue;
        }
        if(S.size()>0) return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        scan.nextLine();
        while(t-->0){
            String s=scan.nextLine();
            System.out.println(Ktra(s));
        }
    }

}

//        File file = new File("DANHSACH.in");
//        Scanner sc = new Scanner(file);
//        ArrayList<String> a = new ArrayList<>();
//        TreeSet<String> tree = new TreeSet<>();
//        while (sc.hasNextLine()) {
//            int l=tree.size();
//            String s = sc.nextLine();
//            String s1 = s.trim();
//            String kq = "";
//            int dem = 1;
//            while (s1.contains("  ") == true) {
//                s1 = s1.replace("  ", " ");
//            }
//            s1=s1.toLowerCase();
//            tree.add(s1);
//            if(tree.size()==l) continue;
//            String hoten[] = s1.split(" ");
//            kq = kq + hoten[hoten.length - 1];
//            for (int i = 0; i < hoten.length - 1; i++) {
//                kq = kq + (hoten[i].substring(0, 1));
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
