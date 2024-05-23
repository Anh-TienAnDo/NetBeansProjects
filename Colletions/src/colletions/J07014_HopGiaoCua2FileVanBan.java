/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import com.sun.source.tree.Tree;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07014_HopGiaoCua2FileVanBan {
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        
        a1.addAll(nhap("DATA1.in"));
        a2.addAll(nhap("DATA2.in"));
        hop(a1,a2);
        giao(a1,a2);
    }

    private static ArrayList<String> nhap(String i) throws FileNotFoundException {
        ArrayList<String> a = new ArrayList<>();
        Scanner sc = new Scanner(new File(i));
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim();
            while(s.contains("  ")==true){
                s=s.replace("  ", " ");
            }
            String[] s1=s.split(" ");
            for (String string : s1) {
                a.add(string);
            }
        }
        return a;
    }

    private static void hop(ArrayList<String> a1, ArrayList<String> a2) {
        TreeSet<String> tr1 = new TreeSet<>();
        tr1.addAll(a1);
        tr1.addAll(a2);
        for (String t : tr1) {
            System.out.println(t+" ");
        }
    }

    private static void giao(ArrayList<String> a1, ArrayList<String> a2) {
        ArrayList<String> b1 = new ArrayList<>();
        ArrayList<String> b2 = new ArrayList<>();
        TreeSet<String> tr1 = new TreeSet<>();
        b1.addAll(a1);
        b2.addAll(a2);
        b1.retainAll(b2);
        tr1.addAll(b1);
        for (String t : tr1) {
            System.out.println(t+" ");
        }
    }
}
