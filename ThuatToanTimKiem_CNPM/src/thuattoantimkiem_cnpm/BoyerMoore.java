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
public class BoyerMoore {
    private final int ALPHABET_SIZE = 256;
    private int[] badCharacterTable;
    private int[] goodSuffixTable;

    public BoyerMoore(String pattern) {
        preprocessBadCharacterShift(pattern);
        preprocessGoodSuffixShift(pattern);
    }

    private void preprocessBadCharacterShift(String pattern) {
        int m = pattern.length();
        badCharacterTable = new int[ALPHABET_SIZE];
        Arrays.fill(badCharacterTable, m);

        for (int i = 0; i < m - 1; i++) {
            badCharacterTable[pattern.charAt(i)] = m - 1 - i;
        }
    }

    private void preprocessGoodSuffixShift(String pattern) {
        int m = pattern.length();
        goodSuffixTable = new int[m];
        int[] suffixes = new int[m];

        suffixes[m - 1] = m;
        int g = m - 1;
        int f = m - 1;

        for (int i = m - 2; i >= 0; i--) {
            if (i > g && suffixes[i + m - 1 - f] < i - g) {
                suffixes[i] = suffixes[i + m - 1 - f];
            } else {
                if (i < g) g = i;
                f = i;
                while (g >= 0 && pattern.charAt(g) == pattern.charAt(g + m - 1 - f)) g--;
                suffixes[i] = f - g;
            }
        }

        for (int i = 0; i < m; i++) {
            goodSuffixTable[i] = m;
        }

        int j = 0;
        for (int i = m - 1; i >= -1; i--) {
            if (i == -1 || suffixes[i] == i + 1) {
                for (; j < m - 1 - i; j++) {
                    if (goodSuffixTable[j] == m) {
                        goodSuffixTable[j] = m - 1 - i;
                    }
                }
            }
        }

        for (int i = 0; i <= m - 2; i++) {
            goodSuffixTable[m - 1 - suffixes[i]] = m - 1 - i;
        }
    }

    public void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int s = 0;

        while (s <= (n - m)) {
            int j = m - 1;

            while (j >= 0 && pattern.charAt(j) == text.charAt(s + j)) {
                j--;
            }

            if (j < 0) {
                System.out.println("Pattern occurs at index " + s);
                s += goodSuffixTable[0];
            } else {
                s += Math.max(goodSuffixTable[j], badCharacterTable[text.charAt(s + j)] - m + 1 + j);
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABAAABCD";
        String pattern = "ABC";
        BoyerMoore bm = new BoyerMoore(pattern);
        bm.search(text, pattern);
    }
}
