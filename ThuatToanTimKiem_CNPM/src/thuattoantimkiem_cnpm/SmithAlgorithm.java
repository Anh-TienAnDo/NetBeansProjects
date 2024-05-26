/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuattoantimkiem_cnpm;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class SmithAlgorithm {
    private static final int ASIZE = 256;

    public static void SMITH(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();

        int[] bmBc = new int[ASIZE];
        int[] qsBc = new int[ASIZE];

        // Preprocessing
        preBmBc(pattern, bmBc);
        preQsBc(pattern, qsBc);

        // Searching
        int j = 0;
        while (j <= n - m) {
            if (pattern.equals(text.substring(j, j + m))) {
                System.out.println("Pattern found at index " + j);
            }
            j += Math.max(bmBc[text.charAt(j + m - 1)], qsBc[text.charAt(j + m)]);
        }
    }

    private static void preBmBc(String pattern, int[] bmBc) {
        Arrays.fill(bmBc, -1);
        for (int i = 0; i < pattern.length() - 1; ++i) {
            bmBc[pattern.charAt(i)] = i;
        }
    }

    private static void preQsBc(String pattern, int[] qsBc) {
        Arrays.fill(qsBc, pattern.length());
        for (int i = pattern.length() - 1; i >= 0; --i) {
            if (qsBc[pattern.charAt(i)] == pattern.length()) {
                qsBc[pattern.charAt(i)] = pattern.length() - i - 1;
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABACABABCABABACABAB";
        String pattern = "ABAB";
        SMITH(pattern, text);
    }
}
