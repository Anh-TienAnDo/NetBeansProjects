/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code_java;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class tong_giai_thua {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1, tmp = 1;
        for (int i = 2; i <= n; i++) {
            tmp *= i;
            res += tmp;
        }
        System.out.println(res);
    }
}
