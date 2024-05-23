/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_bss;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class bai3 {

    // In mảng a
    void in_mang(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // kiểm tra nguyên tố 
    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(number); k++) {
            if (number % k == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        int[] check = new int[100000];
        for (int i = 0; i < 100000; i++) {
            check[i] = 0;
        }
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    int v = random.nextInt(100000) + 1;
                    if (check[v - 1] == 0) {
                        a[i][j] = v;
                        check[v - 1] = 1;
                        break;
                    }
                }
            }
        }
        bai3 o = new bai3();
        o.in_mang(a, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (o.isPrime(a[i][j])) {
                    System.out.println(a[i][j]);
                    System.out.println("vị trí: " + "(" + i + ", " + j + ")");
                }
            }
        }
    }
}
