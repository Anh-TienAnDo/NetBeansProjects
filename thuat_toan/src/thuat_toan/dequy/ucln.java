/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuat_toan.dequy;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ucln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(UCLN(n,m));
    }

    private static int UCLN(int n, int m) {
      if(m==0) return n;
      return UCLN(m, n%m);
    }
    
}
