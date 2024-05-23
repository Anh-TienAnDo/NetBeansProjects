/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_bss;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class bai2 {

    public static void main(String[] args) {
        int arr[][] = new int[100][5];
        Random ram = new Random();
        int values[] = new int[100];
        int value_max = 0;

        for (int i = 0; i < 100; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                int v = ram.nextInt(100) + 1;
                arr[i][j] = v;
                sum += v;
            }
            values[i] = sum;
            if (value_max < sum) {
                value_max = sum;
            }
        }
        System.out.println(value_max);
        System.out.println("Danh sách mảng có phần tổng các phần tử là lớn nhất:");
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value_max) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println("");
        System.out.println("Mảng có chứa cả 1 và 9: ");
        for (int i = 0; i < 100; i++) {
            boolean one = false;
            boolean nine = false;
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    one = true;
                }
                if (arr[i][j] == 9) {
                    nine = true;
                }
            }
            if (one && nine) {
                System.out.println("Mảng: " + (i + 1));
            }
        }

    }
}
