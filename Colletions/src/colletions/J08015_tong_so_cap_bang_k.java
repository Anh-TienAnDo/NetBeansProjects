/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J08015_tong_so_cap_bang_k {
    public static void count(long[] a, long k) {
        long dem = 0;
        HashMap<Long,Long> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(!hm.containsKey(a[i])) 
                hm.put(a[i], (long) 1);
            else hm.put(a[i], hm.get(a[i])+1);
        }
        for (int i = 0; i < a.length; i++) {
            if(hm.get(k-a[i])!=null)
                dem+=hm.get(k-a[i]);
            if(k-a[i]==a[i])
                dem--;
        }
        System.out.println(dem/2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            long n,k;
            n=sc.nextLong();
            k=sc.nextLong();
            long a[]= new long[100000];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextLong();
            }
            count(a,k);
        }
    }
}
