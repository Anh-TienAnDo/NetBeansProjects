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
public class RaitaAlgorithm {
    private static final int ASIZE = 256;

    public static void RAITA(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();

        int[] bmBc = new int[ASIZE];
        preBmBc(pattern, m, bmBc);

        char firstCh = pattern.charAt(0);
        char middleCh = pattern.charAt(m / 2);
        char lastCh = pattern.charAt(m - 1);
        char[] secondCh = pattern.substring(1, m - 1).toCharArray();

        int j = 0;
        while (j <= n - m) {
            char c = text.charAt(j + m - 1);
            if (lastCh == c && middleCh == text.charAt(j + m / 2) &&
                firstCh == text.charAt(j) && Arrays.equals(secondCh, text.substring(j + 1, j + m - 1).toCharArray())) {
                System.out.println("Pattern found at index " + j);
            }
            j += bmBc[c];
        }
    }

    private static void preBmBc(String pattern, int m, int[] bmBc) {
        Arrays.fill(bmBc, -1);
        for (int i = 0; i < m - 1; ++i) {
            bmBc[pattern.charAt(i)] = i;
        }
    }

    public static void main(String[] args) {
        String text = "ABACABABCABABCABAB";
        String pattern = "ABABCABAB";
        RAITA(pattern, text);
    }
}
