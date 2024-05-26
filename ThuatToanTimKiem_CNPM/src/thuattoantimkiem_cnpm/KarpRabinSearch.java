/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuattoantimkiem_cnpm;

/**
 *
 * @author Admin
 */
public class KarpRabinSearch {
    private final static int d = 256; // Kích thước bảng chữ cái (số ký tự có thể có)

    public static void search(String pattern, String text, int q) {
        int m = pattern.length();
        int n = text.length();
        int i, j;
        int p = 0; // Giá trị băm cho mẫu
        int t = 0; // Giá trị băm cho cửa sổ trong văn bản
        int h = 1;

        // Tính giá trị của h = d^(m-1) % q
        for (i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        // Tính giá trị băm ban đầu cho mẫu và cửa sổ đầu tiên của văn bản
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        // Duyệt qua văn bản để tìm kiếm mẫu
        for (j = 0; j <= n - m; j++) {
            // Kiểm tra giá trị băm của mẫu và cửa sổ hiện tại
            if (p == t) {
                // Nếu giá trị băm khớp, kiểm tra ký tự từng ký tự
                boolean match = true;
                for (i = 0; i < m; i++) {
                    if (text.charAt(j + i) != pattern.charAt(i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println("Pattern found at index " + j);
                }
            }

            // Tính lại giá trị băm cho cửa sổ tiếp theo
            if (j < n - m) {
                t = (d * (t - text.charAt(j) * h) + text.charAt(j + m)) % q;

                // Trong trường hợp giá trị băm âm, thêm q để đảm bảo giá trị băm dương
                if (t < 0) {
                    t = (t + q);
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABCCBAABCABAC";
        String pattern = "ABCAB";
        int q = 101; // Một số nguyên tố lớn

        search(pattern, text, q);
    }
}
