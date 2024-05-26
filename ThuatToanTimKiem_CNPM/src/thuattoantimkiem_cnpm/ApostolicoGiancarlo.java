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
public class ApostolicoGiancarlo {

    private final int ALPHABET_SIZE = 256;
    private int[] bmBc;
    private int[] bmGs;
    private int[] suffix;

    public ApostolicoGiancarlo(String pattern) {
        preprocess(pattern);
    }

    private void preprocess(String pattern) {
        preprocessBadCharacterShift(pattern);
        preprocessGoodSuffixShift(pattern);
    }

    private void preprocessBadCharacterShift(String pattern) {
        int m = pattern.length();
        bmBc = new int[ALPHABET_SIZE];
        Arrays.fill(bmBc, m);

        for (int i = 0; i < m - 1; i++) {
            bmBc[pattern.charAt(i)] = m - 1 - i;
        }
    }

    private void preprocessGoodSuffixShift(String pattern) {
        int m = pattern.length();
        bmGs = new int[m];
        suffix = new int[m];
        int f = 0;
        int g = m - 1;
        suffix[m - 1] = m;

        for (int i = m - 2; i >= 0; i--) {
            if (i > g && suffix[i + m - 1 - f] < i - g) {
                suffix[i] = suffix[i + m - 1 - f];
            } else {
                if (i < g) {
                    g = i;
                }
                f = i;
                while (g >= 0 && pattern.charAt(g) == pattern.charAt(g + m - 1 - f)) {
                    g--;
                }
                suffix[i] = f - g;
            }
        }

        Arrays.fill(bmGs, m);
        int j = 0;
        for (int i = m - 1; i >= 0; i--) {
            if (suffix[i] == i + 1) {
                while (j < m - 1 - i) {
                    if (bmGs[j] == m) {
                        bmGs[j] = m - 1 - i;
                    }
                    j++;
                }
            }
        }

        for (int i = 0; i <= m - 2; i++) {
            bmGs[m - 1 - suffix[i]] = m - 1 - i;
        }
    }

    public void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] skip = new int[m];
        Arrays.fill(skip, 0);

        int j = 0;
        while (j <= n - m) {
            int i = m - 1;
            while (i >= 0 && pattern.charAt(i) == text.charAt(j + i)) {
                i--;
            }
            if (i < 0) {
                System.out.println("Pattern found at index " + j);
                skip[m - 1] = m;
                j += bmGs[0];
            } else {
                int k = skip[i];
                int s = suffix[i];
                if (k > s) {
                    if (s == i + 1) {
                        i = -1;
                    } else {
                        i -= s;
                    }
                } else {
                    i -= k;
                    if (k < s) {
                        i = -1;
                    }
                }
                skip[m - 1] = m - 1 - i;
                j += Math.max(bmGs[i], bmBc[text.charAt(j + i)] - m + 1 + i);
            }
            if (j <= n - m) {
                System.arraycopy(skip, 1, skip, 0, m - 1);
                skip[m - 1] = 0;
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABAAABCD";
        String pattern = "ABC";
        ApostolicoGiancarlo ag = new ApostolicoGiancarlo(pattern);
        ag.search(text, pattern);
    }
}
