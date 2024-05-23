/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class So_nguyen_to_filenhiphan {

//    public static boolean ktnt(int i) {
//        if (i < 2) {
//            return false;
//        }
//        for (int j = 2; j <= (int)Math.sqrt(i); j++) {
//            if (i % j == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        for (String s : a) {
            String s1="";
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='0'||s.charAt(i)=='1'){
                    s1=s1+s.charAt(i);
                }
            }
            long kq=0;
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i)=='1'){
                    kq=kq+(long)Math.pow(2, s1.length()-i-1);
                }
            }
            System.out.println(s1+" "+kq);
        }
//        int a1[] = new int[10001];
//        for (int i = 0; i < 10001; i++) {
//            if (ktnt(i)) {
//                a1[i] = 1;
//            } else {
//                a1[i] = 0;
//            }
//        }
//        for (Integer integer : a) {
//            if (a1[integer] > 0) {
//                a1[integer]++;
//            }
//        }
//        for (int i = 0; i < 10001; i++) {
//            if (a1[i] > 1) {
//                int kq = a1[i] - 1;
//                System.out.println(i + " " + kq);
//            }
//        }
    }
}
