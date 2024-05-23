/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07041 {

    public class Pair implements Serializable, Comparable<Pair> {

        private int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }

        public int compareTo(Pair o) {
            return this.first - o.first;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }

    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        TreeSet<Pair> tree = new TreeSet<>();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) in.readObject();
        HashMap<Integer, Integer> check = new HashMap<>();
        ArrayList<Pair> res = new ArrayList<>();
        for(Pair x : a){
            if(x.getFirst() < x.getSecond()){
                if(check.get(x.getFirst()) == null){
                    res.add(x);
                    check.put(x.getFirst(), x.getSecond());
                }
            }
        }
        Collections.sort(res);
        for(Pair x : res){
            System.out.println(x);
        }
    }
}
