
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

public class Coban {
    public static void main(String[] args) {
        String s = "abcA.@NM;";
        String s1 = "abcdabcef";
        System.out.println(s.replaceAll("[^a-zA-Z]", ""));
        for (int i = 0; i < s1.length(); i++) {
            int dem=0;
            for (int j = i; j < s1.length(); j++) {
                if(s1.charAt(i)==s1.charAt(j)){
                    dem++;
                }
            }
            if (dem>1){
                System.out.print(s1.charAt(i) + String.valueOf(dem) + "|");
                System.out.println(s1.charAt(i) +'\0');
                System.out.println((char)100);
            }
        }
    }
}
