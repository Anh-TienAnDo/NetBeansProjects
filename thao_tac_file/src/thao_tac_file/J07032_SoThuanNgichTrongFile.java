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
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07032_SoThuanNgichTrongFile {

    public static int kt(String s) {
        String rs = "";
        if (s.length() % 2 == 0 || s.length() == 1) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Integer.valueOf(s.charAt(i)) % 2 == 0) {
                return 0;
            }
            rs = s.charAt(i) + rs;
        }
        if (s.contains(rs) == false) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) o2.readObject();
        TreeSet<Integer> tr = new TreeSet<>();
        int ma1[] = new int[1000000];
        int ma2[] = new int[1000000];
        for (Integer a : a1) {
            String s = String.valueOf(a);
            if (kt(s) == 1) {
                ma1[a] += 1;
                tr.add(a);
            }
        }
        for (Integer a : a2) {
            String s = String.valueOf(a);
            if (kt(s) == 1) {
                ma2[a] += 1;
                tr.add(a);
            }
        }
        int dem = 0;
        for (Integer t : tr) {
            if (dem == 10) {
                break;
            }
            if (ma1[t] > 0 && ma2[t] > 0) {
                int kq = ma1[t] + ma2[t];
                dem++;
                System.out.println(t + " " + kq);
            }
        }
    }
}
