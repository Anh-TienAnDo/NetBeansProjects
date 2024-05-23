/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class SapXepTheoSoLanXuatHien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int size = hs.size();
                hs.add(x);
                if (size == hs.size()) {
                    tm.put(x, tm.get(x) + 1);
                }
                if (size < hs.size()) {
                    tm.put(x, 1);
                }
            }
            
            System.out.println(tm.keySet());
        }
    }
}
