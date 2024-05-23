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
public class dt_cucgach {
     public static boolean kt(String xau, String[] s, char[] c){
        int n=xau.length();
        for(int i=0;i<n/2;i++){
            Character a = xau.charAt(i),a1=xau.charAt(n-i-1);
            for(int j=0;j<s.length;j++){
                String s1 = s[j];
                for(int l=0;l<s1.length();l++){
                    if(s1.charAt(l)==xau.charAt(i)) a=c[j];
                    if(s1.charAt(l)==xau.charAt(n-i-1)) a1=c[j];
                }
            }
            if(!a.equals(a1)) return false;
        }
        
        return true;
    }
     public static void main(String[] args) {
                Scanner nhap = new Scanner(System.in);
        int t = nhap.nextInt();
        String s[] = {"BC","EF","HI","KL","NO","QRS","UV","XYZ"};
        char c[]= {'A','D','G','J','M','P','T','W'};
        while(t-->0){
            String xau = nhap.next().toUpperCase();
            if(kt(xau,s,c)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
