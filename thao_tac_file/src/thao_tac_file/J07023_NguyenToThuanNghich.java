/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07023_NguyenToThuanNghich {
    
    public static int ktnn(Integer n){
        for(int j=2;j<=Math.sqrt(n);j++){
            if(n%j==0) return 0;
        }
        return 1;
    }
    
    public static int kttn(String s){
        for(int j=0;j<s.length()/2;j++){
            if(s.charAt(j)!=s.charAt(s.length()-j-1)) return 0;
        }
        return 1;
    }
    
    public static int kt(Integer n){
        if(n<11) return 0;
        if(ktnn(n)==1 && kttn(String.valueOf(n))==1) return 1;
        else return 0;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) o2.readObject();
        int ma1[] = new int[10000];
        int ma2[] = new int[10000];
        TreeSet<Integer> tr = new TreeSet<>();
        for (Integer a : a1) {
            if(kt(a)==1){
                ma1[a]+=1;
                tr.add(a);
            }
        }
        for (Integer a : a2) {
            if(kt(a)==1){
                ma2[a]+=1;
                tr.add(a);
            }
        }
        for (Integer t : tr) {
            if(ma1[t]>0&&ma2[t]>0){
                System.out.println(t+" "+ma1[t]+" "+ma2[t]);
            }
        }
    }
}
