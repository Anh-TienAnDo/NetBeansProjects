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

public class luy_thua {
//    static long luy_thua(long n,long k,long mod){
//        if(k==0)return 1;
//	long tmp=luy_thua(n,k/2,mod);
//	if(k%2==0) return (tmp*tmp)%mod;
//	else return ((tmp*tmp)%mod *n)%mod;
//    }

    static String Fi(int n, long k, long a[]) {
        if (n == 1 || n == 2) {
            return Integer.toString(n - 1);
        }
        if (k <= a[n - 2]) {
            return Fi(n - 2, k, a);
        }
        return Fi(n - 1, k - a[n - 2], a);
    }

    public static void main(String[] agrs) {
//        Scanner in= new Scanner(System.in);
//        while(true){
//            long a=in.nextLong();
//            long b=in.nextLong();
//            long mod=(long)1e9 + 7;
//            if(a==0&&b==0) break;
//            System.out.println(luy_thua(a,b,mod));
//        }

        Scanner sc = new Scanner(System.in);
        long a[] = new long[93];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= 92; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Fi(n, k, a));

            t--;
        }
    }

}
