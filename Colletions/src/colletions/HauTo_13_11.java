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
public class HauTo_13_11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            HauTo(n,s);
        }
    }

    private static void HauTo(int n, String s) {
        String[] s1=s.split(" ");
        Stack<Long> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            try {
                Long tmp = Long.parseLong(s1[i]);
                st.push(tmp);
            } catch (NumberFormatException e) {
                if(s1[i].equals("+")){
                    Long a=st.pop();
                    Long b=st.pop();
                    st.push(a+b);
                }
                if(s1[i].equals("*")){
                    Long a=st.pop();
                    Long b=st.pop();
                    st.push(a*b);
                }
                if(s1[i].equals("-")){
                    Long a=st.pop();
                    Long b=st.pop();
                    st.push((Long)(b-a));
                }
                if(s1[i].equals("/")){
                    Long a=st.pop();
                    Long b=st.pop();
                    st.push((Long)(b/a));
                }
            }
        }
        System.out.println(st.pop()); 
    }
}
