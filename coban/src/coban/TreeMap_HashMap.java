/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coban;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class TreeMap_HashMap {
    public static void Hash_Map(){
        HashMap<Character,Integer> hm = new HashMap<>();
        String a="HIJKLMNABCDEFG";
        for (int l = 0; l < a.length(); l++) {
            hm.put(a.charAt(l), (l*2+1)%5);
        }
        Set s = hm.keySet();
        for (Object h : s) {
            System.out.print(h);
        }
        System.out.println("");
        for (Object h : hm.values()) {
            System.out.print(h);
        }
        System.out.println("");
        hm.replace('A', hm.get('A'), hm.get('A')+1);
        System.out.println(hm.get('A'));
    }
    public static void Tree_Map(){
        TreeMap<Character,Integer> tm = new TreeMap<>();
        String a="HIJKLMNABCDEFG";
        for (int l = 0; l < a.length(); l++) {
            tm.put(a.charAt(l), (l*2+1)%5);
        }
        Set s = tm.keySet();
        for (Object h : s) {
            System.out.print(h+" "+tm.get(h));
        }
        System.out.println("");
        for (Object h : tm.values()) {
            System.out.print(h);
        }
        System.out.println("");
        tm.replace('A', tm.get('A'), tm.get('A')+1);
        System.out.println(tm.get('A'));
    }
    public static void main(String[] args) {
        Hash_Map();
        Tree_Map();
    }
}
