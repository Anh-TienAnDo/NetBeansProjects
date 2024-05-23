/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coban;

/**
 *
 * @author Admin
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class array {

    public static void main(String[] args) {
//        int[] a = new int[100];
//        String s;
//        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<4;i++){
//            a[i]=sc.nextInt();
//        }
//        int b=3;
//        s=String.valueOf(b);
//        System.out.println(a.length);
        List<String> l = new ArrayList<String>();
        l.add("abc");
        System.out.println(l.get(0));

        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(1);
        tree.add(2);
        System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());
        
    }
}
