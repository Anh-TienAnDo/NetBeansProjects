/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class liet_ke_tu_khac_nhau {

    public static class WordSet {

//        private TreeSet<String> tree = new TreeSet<>();
        private String[] s;

//        public WordSet(String path) throws FileNotFoundException {
//            File file = new File(path);
//            Scanner sc = new Scanner(file);
//            TreeSet<String> tree = new TreeSet<>();
//            while (sc.hasNext()) {
//                String s = sc.next();
//                tree.add(s.toLowerCase());
//            }
//            this.tree = tree;
//        }
//
//        @Override
//        public String toString() {
//            String res = "";
//            for (String i : tree) {
//                res += i + "\n";
//            }
//            return res;
//        }

        public WordSet(String s) {
            String s1=s.trim();
            while (s1.contains("  ") == true) {
                s1 = s1.replace("  ", " ");
            }
            String[] ls = s1.split(" ");
//            TreeSet<String> tree = new TreeSet<>();
//            for (String l : ls) {
//                tree.add(l.toLowerCase());
//            }
            this.s=ls;
        }

        public String[] getS() {
            return s;
        }
        
        public String intersection(WordSet s2){
            String[] cs2 = s2.getS();
            TreeSet<String> tree = new TreeSet<>();
            for (String l : s) {
                for (String c : cs2) {
                    if(l.toLowerCase().equals(c.toLowerCase())){
                        tree.add(c.toLowerCase());
                    }
                }
            }
            
            String kq="";
            for (String string : tree) {
                kq=kq+string+" ";
            }
            return kq;
        }
        
        public String union(WordSet s2){
            String[] cs2 = s2.getS();
            TreeSet<String> tree = new TreeSet<>();
            for (String l : s) {
                tree.add(l.toLowerCase());
            }
            for (String l : cs2) {
                tree.add(l.toLowerCase());
            }
            String kq="";
            for (String string : tree) {
                kq=kq+string+" ";
            }
            return kq;
        }

    }

//    public static void main(String[] args) throws IOException {
////        File file = new File("VANBAN.in");
////        Scanner sc = new Scanner(file);
////        TreeSet<String> tree = new TreeSet<>();
////        while(sc.hasNext()){
////            String s = sc.next();
////            tree.add(s.toLowerCase());
////        }
////        for (String string : tree) {
////            System.out.println(string);
////        }
//
//        WordSet ws = new WordSet("VANBAN.in");
//        System.out.println(ws);
//    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }

}
