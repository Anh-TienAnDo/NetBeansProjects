/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuattoantimkiem_cnpm;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class MorrisPrattSearch {

    // Hàm tiền xử lý để xây dựng bảng mpNext
    public static void preMp(char[] pattern, int m, int[] mpNext) {
        int i = 0, j = -1;
        mpNext[0] = -1;

        while (i < m) {
            while (j > -1 && pattern[i] != pattern[j]) {
                j = mpNext[j];
            }
            i++;
            j++;
            mpNext[i] = j;
        }
    }

    // Hàm tìm kiếm sử dụng thuật toán Morris-Pratt
    public static void MP(char[] pattern, int m, char[] text, int n) {
        int[] mpNext = new int[m + 1];

        // Giai đoạn tiền xử lý
        preMp(pattern, m, mpNext);

        int i = 0, j = 0;

        // Giai đoạn tìm kiếm
        while (j < n) {
            while (i > -1 && pattern[i] != text[j]) {
                i = mpNext[i];
            }
            i++;
            j++;
            if (i >= m) {
                System.out.println("Pattern found at index " + (j - i));
                i = mpNext[i];
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABABABABABAC";
        String pattern = "ABABAC";

        char[] textArr = text.toCharArray();
        char[] patternArr = pattern.toCharArray();

        MP(patternArr, patternArr.length, textArr, textArr.length);
    }

}
