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
public class Danh_so_dau_ngoac {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Stack<Integer> st = new Stack<>();
            String s = sc.nextLine();
//            boolean x=false;
            int dem=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    dem++;
                    st.push(dem);
                    System.out.print(dem+" ");
                }
                if(s.charAt(i)==')'){
                    System.out.print(st.pop()+" ");
                }
            }
            System.out.println("");
        }
    }
}
