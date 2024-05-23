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
public class uoc_chia_het2 {
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            if (n%2 != 0) {
                System.out.println("0");
                continue;
            }
            int dem = 1;
            for (int i = 2; i* i < n; i++) {
                if (n%i == 0) {
                    if (i %2 == 0) dem++;
                    if (n/i % 2 ==0) dem++;
                }
            }
            double sq = Math.sqrt(n);
            if ((sq - Math.floor(sq)) == 0 && sq %2 == 0) dem++;
            System.out.println(dem);
       
             }
        }
}