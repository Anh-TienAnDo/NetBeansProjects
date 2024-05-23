/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class bai1 {

    public static ArrayList<String> megre(String str) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            temp.add(s[i]);
        }
        System.out.println(temp);
        Random random = new Random();
        while (temp.size() > 0) {
            int index = random.nextInt(temp.size());
            System.out.println(index);
            result.add(temp.remove(index));
        }
        System.out.println(temp);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String s = "a '` b1290cASA.  jkl";
        String s1 = "abcdHGFds?";
        String r = "";
        System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
        for (int i = 0; i < s1.length(); i++) {
            if (s.contains(s1.charAt(i) + "")) {
                r += s1.charAt(i);
            }
        }
        StringTokenizer token = new StringTokenizer(s,s1);
        while (token.hasMoreTokens()) {
            System.out.print(token.nextToken());
         
        }
        System.out.println("r: "+r);
        int[] a = new int[256];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
            System.out.println(a[s.charAt(i)]);
        }

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.sort((o1, o2) -> o1 - o2);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println(list);
        String[] ms = s.split("\\s+");
        for (String m : ms) {
            System.out.println(m);
        }
//        String str = "có công mài sắt có ngày nên kim";
//        ArrayList<String> s = megre(str);
//        for (int i = 0; i < s.size(); i++) {
//            System.out.println(s.get(i));
//        }

    }

}
