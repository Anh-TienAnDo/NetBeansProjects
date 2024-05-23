/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuat_toan;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Admin
 */
class Result {

    static int tong = 0;
    static int kq = 0;

    public static int powerSum(int X, int N) {
        // Write your code here
        Do(X, N, 1);
        return kq;
    }

    public static void Do(int X, int N, int i) {
        for (int j = i; j <= Math.sqrt(X); j++) {
            tong = tong + (int) (Math.pow(j, N));
            System.out.println(tong);
            System.out.println(j + " " + i);
            if (tong == X) {
                tong = tong - (int) (Math.pow(j, N));
                kq += 1;
            } else if (tong < X) {
                Do(X, N, i + 1);
            } else if (tong > X) {
                tong = tong - (int) (Math.pow(j, N));
            }

        }
        tong = tong - (int) (Math.pow(i - 1, N));
    }

}

public class the_power_sum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = Integer.parseInt(bufferedReader.readLine().trim());

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
