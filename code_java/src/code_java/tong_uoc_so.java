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
public class tong_uoc_so {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int maxN = 2000001;
        boolean isnotPrime[] = new boolean[maxN];
        for (int i = 2; i * i < maxN; ++i) {  
            if (isnotPrime[i] == false) {
                for (int j = i * i; j < maxN; j += i) {
                    isnotPrime[j] = true;
                }
            }
        }
        int sumDiv[] = new int[maxN]; 
        for (int i = 2; i < maxN; ++i) {
            if (isnotPrime[i] == false) {
                for (int j = i; j < maxN; j += i) {
                    int tmp = j;
                    while (tmp % i == 0) {
                        sumDiv[j] += i;   
                        tmp /= i;
                    }
                }
            }
        }
        int t = sc.nextInt();
        long count = 0;
        for (int i = 1; i <= t; i++) {
            count += sumDiv[sc.nextInt()];
        }
        System.out.println(count);
    }
}
