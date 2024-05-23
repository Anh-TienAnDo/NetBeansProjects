/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lopPair {

    public static class Pair<F, S> {

        private F first;
        private S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public boolean check(Integer n) {
            if (n < 2) {
                return false;
            }
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    return false;
                }
            }
            return true;
        }

        public boolean isPrime() {
            return check((Integer) first) && check((Integer) second);
        }

        @Override
        public String toString() {
            return first + " " + second;
        }

    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            boolean check = false;
//            for(int i = 2; i <= 2*Math.sqrt(n); i++){
//                Pair<Integer, Integer> p = new Pair<>(i, n-i);
//                if(p.isPrime()){
//                    System.out.println(p);
//                    check = true;
//                    break; 
//                }
//            }
//            if(!check) System.out.println(-1);
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("DATA.in"));
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            boolean check = false;
//            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
//                Pair<Integer, Integer> p = new Pair<>(i, n - i);
//                if (p.isPrime()) {
//                    System.out.println(p);
//                    check = true;
//                    break;
//                }
//            }
//            if (!check) {
//                System.out.println(-1);
//            }
//        }
//    }
    
        public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2*Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i,n-i);
                if (p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.println("-1");
            }
        }
    }
}
