/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class JKT013_so_loc_phat {

    static String[] a = {"6", "8"};
    static String kq = "8 6";
    static int dem = 2;

    public static void sinh(String sosanh) {
        Queue<String> st = new LinkedList<>();
        st.add(a[0]);
        st.add(a[1]);
        while (true) {
            String s = st.poll();
            for (int i = 0; i < 2; i++) {
                String tmp = "";
                tmp = s + a[i];
                kq = tmp + " " + kq;
                dem = dem + 1;
                if (tmp.equals(sosanh)) {
                    while (!st.isEmpty()) {
                        st.poll();
                    }
                    return;
                }
                st.add(tmp);
            }
            s = "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {
            int n = 15;
            String sosanh = "";
            for (int i = 0; i < n; i++) {
                sosanh = sosanh + "8";
            }
            if (n == 1) {
                System.out.println("2");
                System.out.println("8 6");
            } else {
                sinh(sosanh);
                System.out.println(dem);
                System.out.println(kq);
            }
            kq = "8 6";
            dem = 2;
        }
    }
}
