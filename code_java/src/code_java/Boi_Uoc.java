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
public class Boi_Uoc {
    static long uoc(long a,long b){
        if(b==0) return a;
        return uoc(b,a%b);  
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextInt();
            long b=in.nextInt();
            long u=uoc(a,b);
            long boi=(a*b)/u;
            System.out.println(boi+" "+u);
        }
    }
}
