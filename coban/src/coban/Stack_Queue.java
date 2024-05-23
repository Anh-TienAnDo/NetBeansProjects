/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coban;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Stack_Queue {
    public static void STACK(){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 10; i++) {
            st.push(i);
        }
        System.out.println(st.peek());
        System.out.println(st.search(0));
        while(!st.empty()){
            System.out.print(st.pop());
        }
    }
    public static void QUEUE(){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        System.out.println(q.peek());
        System.out.println(q.poll());
        
    }
    public static void main(String[] args) {
        STACK();
        QUEUE();
    }
}
