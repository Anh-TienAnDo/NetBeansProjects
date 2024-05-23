/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J4022_wordset {

    public static class WordSet {

        private String[] cs;
        private TreeSet<String> tree1;
        private TreeSet<String> tree2;

        public WordSet(String s) {
           this.cs = s.split(" ");
        }

        public String[] getCs() {
            return cs;
        }
        
        
        public String union(WordSet s2){
            TreeSet<String> tree1 = new TreeSet<>();
            TreeSet<String> tree2 = new TreeSet<>();
            TreeSet<String> tree = new TreeSet<>();
            for (String c : cs) {
                tree.add(c.toLowerCase());
                tree1.add(c.toLowerCase());
            }
            this.tree1=tree1;
            for (String c : s2.getCs()) {
                tree.add(c.toLowerCase());
                tree2.add(c.toLowerCase());
            }
            this.tree2=tree2;
            String uni="";
            for (String string : tree) {
                uni=uni+string+" ";
            }
            return uni;
        }
        public String intersection(WordSet s2) {
            String inter="";
            for (String t1 : tree1) {
                for (String t2 : tree2) {
                    if(t1.equals(t2)){
                        inter=inter+t1+" ";
                    }
                }
            }
            return inter;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
