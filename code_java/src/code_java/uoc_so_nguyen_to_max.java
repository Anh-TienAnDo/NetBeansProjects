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
public class uoc_so_nguyen_to_max {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            long res = 0;
//            long n = sc.nextLong();
//            for (int i = 2; i <= Math.sqrt(n); ++i) {
//                if (n % i == 0) {
//                    res = Math.max(res, i);
//                    while (n % i == 0) {
//                        n /= i;
//                    }
//                }
//            }
//            System.out.println(Math.max(res, n));
//        }
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        int dem=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='4'||s.charAt(i)=='7')
                dem++;
        }
        System.out.println((dem==4||dem==7) ? "YES":"NO");
    }
    
}
