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
public class GalilGiancarlo {
    private int[] shift;
    private int[] next;
    private int[] h;
    private int ell;

    public GalilGiancarlo(String pattern) {
        preprocess(pattern);
    }

    private void preprocess(String pattern) {
        int m = pattern.length();
        shift = new int[m + 1];
        next = new int[m + 1];
        h = new int[m];
        Arrays.fill(shift, m);
        Arrays.fill(next, m);

        int i, j = 0;
        for (i = 0; pattern.charAt(i) == pattern.charAt(i + 1); i++);
        ell = i;
        if (ell == m - 1) return;

        int nd = preColussi(pattern, m, h, next, shift);
    }

    private int preColussi(String pattern, int m, int[] h, int[] next, int[] shift) {
        int i, j, k;
        int[] f = new int[m];
        Arrays.fill(f, -1);

        for (i = 0, j = 1; j < m; j++) {
            while (i >= 0 && pattern.charAt(i) != pattern.charAt(j)) {
                if (f[i] == -1) f[i] = j;
                i = next[i];
            }
            h[j] = ++i;
        }

        for (i = m - 1; i >= 0; i--) {
            if (f[i] == -1) f[i] = m;
            if (i + 1 == f[i]) f[i] = next[i];
            next[i] = f[i];
        }

        for (i = 0, k = 1; k <= m; k++) {
            while (i < m && pattern.charAt(i) == pattern.charAt(i + k)) i++;
            shift[k] = k + i - h[i];
        }

        return h[m - 1];
    }

    public void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        if (ell == m - 1) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (text.charAt(j) == pattern.charAt(0)) {
                    count++;
                    if (count >= m) {
                        System.out.println("Pattern found at index " + (j - m + 1));
                    }
                } else {
                    count = 0;
                }
            }
            return;
        }

        int i = 0, j = 0, last = -1;
        boolean heavy = false;

        while (j <= n - m) {
            if (heavy && i == 0) {
                int k = last - j + 1;
                while (k < m && pattern.charAt(0) == text.charAt(j + k)) k++;
                if (k <= ell || pattern.charAt(ell + 1) != text.charAt(j + k)) {
                    i = 0;
                    j += (k + 1);
                    last = j - 1;
                } else {
                    i = 1;
                    last = j + k;
                    j = last - (ell + 1);
                }
                heavy = false;
            } else {
                while (i < m && last < j + h[i] && pattern.charAt(h[i]) == text.charAt(j + h[i])) i++;
                if (i >= m || last >= j + h[i]) {
                    System.out.println("Pattern found at index " + j);
                    i = m;
                }
                if (i > ell) last = j + m - 1;
                j += shift[i];
                i = next[i];
            }
            heavy = j <= last;
        }
    }

    public static void main(String[] args) {
        String text = "ABABABABC";
        String pattern = "ABABC";
        GalilGiancarlo gg = new GalilGiancarlo(pattern);
        gg.search(text, pattern);
    }
}
