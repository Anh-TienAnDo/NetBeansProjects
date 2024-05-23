/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Tap_hop_so_nguyen {

    public static void remove(ArrayList<Integer> tree, ArrayList<Integer> tree1) {
        ArrayList<Integer> tree3 = new ArrayList<>();
        TreeSet<Integer> tree6 = new TreeSet<>();
        tree3.addAll(tree);
        tree3.removeAll(tree1);
        tree6.addAll(tree3);
        for (Integer tr : tree6) {
            System.out.print(tr + " ");
        }
        System.out.println("");
    }

    public static void retain(ArrayList<Integer> tree, ArrayList<Integer> tree1) {
        ArrayList<Integer> tree2 = new ArrayList<>();
        TreeSet<Integer> tree3 = new TreeSet<>();
        tree2.addAll(tree);
        tree2.retainAll(tree1);
        tree3.addAll(tree2);
        for (Integer tr : tree3) {
            System.out.print(tr + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        ArrayList<Integer> tree = new ArrayList<>();
        ArrayList<Integer> tree1 = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            tree.add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            tree1.add(sc.nextInt());
        }
        retain(tree, tree1);
        remove(tree, tree1);
        remove(tree1, tree);

    }
}
