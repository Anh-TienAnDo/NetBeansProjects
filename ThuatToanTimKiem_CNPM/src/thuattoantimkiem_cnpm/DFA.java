/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuattoantimkiem_cnpm;


/**
 *
 * @author Admin
 */
public class DFA {
    private static final int ALPHABET_SIZE = 256; // Kích thước bảng chữ cái
    private int[][] dfa; // Bảng chuyển trạng thái của DFA
    private int m; // Độ dài mẫu

    // Xây dựng DFA từ mẫu x
    public DFA(String pattern) {
        m = pattern.length();
        dfa = new int[m][ALPHABET_SIZE];
        dfa[0][pattern.charAt(0)] = 1;

        int X = 0;
        for (int j = 1; j < m; j++) {
            for (int c = 0; c < ALPHABET_SIZE; c++) {
                dfa[j][c] = dfa[X][c];
            }
            dfa[j][pattern.charAt(j)] = j + 1;
            X = dfa[X][pattern.charAt(j)];
        }
    }

    // Tìm kiếm mẫu x trong văn bản y
    public void search(String text) {
        int n = text.length();
        int i, j;
        for (i = 0, j = 0; i < n && j < m; i++) {
            j = dfa[j][text.charAt(i)];
        }
        if (j == m) {
            System.out.println("Pattern found at index " + (i - m));
        } else {
            System.out.println("Pattern not found");
        }
    }

    public static void main(String[] args) {
        String text = "ABCCBAABCABAC";
        String pattern = "ABCAB";

        DFA dfa = new DFA(pattern);
        dfa.search(text);
    }
}
