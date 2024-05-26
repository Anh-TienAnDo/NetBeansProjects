/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuattoantimkiem_cnpm;

import java.util.Random;

public class Brute_Force {
    public static void search(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();

        for (int j = 0; j <= n - m; ++j) {
            int i;
            for (i = 0; i < m && pattern.charAt(i) == text.charAt(i + j); i++);
            if (i == m) {
                System.out.println("Pattern found at index " + j);
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABABABABABAC";
//        Random random = new Random();
//        for (int i = 0; i < 100000; i++) {
//            char c = (char) (random.nextInt(65,91));
//            text = c + text;
//        }
        String pattern = "ABABAC";
        search(pattern, text);
    }
    
}
