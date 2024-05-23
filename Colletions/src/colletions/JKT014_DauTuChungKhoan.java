/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            a[0] = 1000000000;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for (int i = 1; i <= n; i++) {
                while (st.size() > 0 && a[st.peek()] <= a[i]) {
                    st.pop();
                }
                System.out.print(i - st.peek() + " ");
                st.push(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
