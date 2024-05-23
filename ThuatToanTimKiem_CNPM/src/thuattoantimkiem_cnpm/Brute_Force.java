/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuattoantimkiem_cnpm;

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
        String pattern = "ABABAC";
        search(pattern, text);
    }
    
}
