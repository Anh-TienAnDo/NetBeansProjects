/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DsCanhPair {
    static class Pair{
        int d,c;

        public Pair(int d, int c) {
            this.d = d;
            this.c = c;
        }
        public void show(){
            System.out.printf("(%d,%d)\n", d, c);
        }
    }
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x, n = sc.nextInt();
//        ArrayList<Pair> p =new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                x = sc.nextInt();
//                if (i <= j && x == 1)
//                {
//                    p.add(new Pair(i,j));
//                }
//            }
//        }
//        for (Pair pair : p) {
//            pair.show();
//        }
        Scanner sc = new Scanner(System.in);
        int x, n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                x = sc.nextInt();
                if (i <= j && x == 1)
                    System.out.printf("(%d,%d)\n", i, j);
            }
        }
    }
}
