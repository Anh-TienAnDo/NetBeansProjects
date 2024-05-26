/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuattoantimkiem_cnpm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class SkipSearch {
    private Map<Character, List<Integer>> buckets;

    public SkipSearch(String pattern) {
        preprocess(pattern);
    }

    private void preprocess(String pattern) {
        int m = pattern.length();
        buckets = new HashMap<>();

        for (int i = 0; i < m; i++) {
            char c = pattern.charAt(i);
            buckets.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
        }
    }

    public void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int j = m - 1; j < n; j += m) {
            char currentChar = text.charAt(j);
            if (buckets.containsKey(currentChar)) {
                for (int pos : buckets.get(currentChar)) {
                    int start = j - pos;
                    if (start >= 0 && start + m <= n) {
                        if (text.regionMatches(start, pattern, 0, m)) {
                            System.out.println("Pattern found at index " + start);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABABABC";
        String pattern = "ABABC";
        SkipSearch skipSearch = new SkipSearch(pattern);
        skipSearch.search(text, pattern);
    }
}
