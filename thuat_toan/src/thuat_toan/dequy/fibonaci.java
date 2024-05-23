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
public class fibonaci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Fibo(sc.nextInt());
        System.out.println(n);
    }
    public static long Fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}
