/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J08024_so0va9 {

    public static void xuly(int n,long[] a) {
        Queue<String> q = new LinkedList<>();
        q.add("9");
        while (true) {
            Long tmp = Long.parseLong(q.poll());
            for (int i = 0; i <= 1; i++) {
                Long kq = tmp;
                kq = kq * 10 + a[i];
                if (kq % n == 0) {
                    System.out.println(kq);
                    return;
                }
                else q.add(String.valueOf(kq));
            }
        }
    }

    public static void main(String[] args) {
        long[] a = new long[2];
        a[0] = 0;
        a[1] = 9;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1 || n == 3 || n == 9) {
                System.out.println("9");
            } else {
                xuly(n,a);

            }
        }
    }
}
