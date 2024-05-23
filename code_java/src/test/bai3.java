/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class bai3 {

    int findMinCost(int[][] a, int row, int col) {
        int n = a.length;

        System.out.print(a[row][col]+ " ");
        
        
        // Trường hợp cơ sở: Đến điểm cuối cùng
        if (row == n - 1 && col == n - 1) {
            return a[row][col];
        }

        // Nếu đến biên phải, chỉ có thể đi xuống
        if (row == n - 1) {
            return a[row][col] + findMinCost(a, row, col + 1);
        }

        // Nếu đến biên dưới, chỉ có thể đi sang phải
        if (col == n - 1) {
            return a[row][col] + findMinCost(a, row + 1, col);
        }
        

        // Trường hợp chung: Tìm chi phí nhỏ nhất từ điểm tiếp theo
        int rightCost = findMinCost(a, row, col + 1);
        int downCost = findMinCost(a, row + 1, col);
        System.out.println(rightCost + " " + downCost);

        // Trả về chi phí nhỏ nhất từ hai lựa chọn
        return a[row][col] + Math.min(rightCost, downCost);
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[][] = new int[n][n];
        Random ram = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = ram.nextInt(10) + 1;
                arr[i][j] = v;
                System.out.print(v + " ");
            }
            System.out.println("");
        }
        arr[0][0] = 0;
        arr[n - 1][n - 1] = 0;

        bai3 ob = new bai3();
        int minCost = ob.findMinCost(arr, 0, 0);
        System.out.println("Chi phí nhỏ nhất: " + minCost);
    }
}
