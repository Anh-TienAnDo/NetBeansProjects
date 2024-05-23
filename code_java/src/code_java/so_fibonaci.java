/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code_java;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class so_fibonaci {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap=new Scanner(System.in);
        int t=nhap.nextInt();
        while(t-->0){
            long n=nhap.nextLong();
            if(Fibo(n)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static long Fibo(long n){
        long[] M=new long[100];
        M[0]=0;M[1]=1;
        for(int i=2;i<100;i++)M[i]=M[i-1]+M[i-2];
        for(int i=0;i<100;i++)
            if(M[i]==n)return 1;
        return 0;
        
    }
}
