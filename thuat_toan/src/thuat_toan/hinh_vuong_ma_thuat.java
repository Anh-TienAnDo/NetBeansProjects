///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package thuat_toan;
//
///**
// *
// * @author Admin
// */
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'formingMagicSquare' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts 2D_INTEGER_ARRAY s as parameter.
//     */
//    public static int formingMagicSquare(List<List<Integer>> s) {
//        // Write your code here
////        List<List<List<Integer>>> magic = new ArrayList<>();
////
////        magic.add(Arrays.asList(
////                Arrays.asList(8, 1, 6),
////                Arrays.asList(3, 5, 7),
////                Arrays.asList(4, 9, 2)
////        ));
////
////        magic.add(Arrays.asList(
////                Arrays.asList(6, 1, 8),
////                Arrays.asList(7, 5, 3),
////                Arrays.asList(2, 9, 4)
////        ));
////
////        magic.add(Arrays.asList(
////                Arrays.asList(4, 9, 2),
////                Arrays.asList(3, 5, 7),
////                Arrays.asList(8, 1, 6)
////        ));
////
////        magic.add(Arrays.asList(
////                Arrays.asList(2, 9, 4),
////                Arrays.asList(7, 5, 3),
////                Arrays.asList(6, 1, 8)
////        ));
////
////        magic.add(Arrays.asList(
////                Arrays.asList(8, 3, 4),
////                Arrays.asList(1, 5, 9),
////                Arrays.asList(6, 7, 2)
////        ));
////
////        magic.add(Arrays.asList(
////                Arrays.asList(4, 3, 8),
////                Arrays.asList(9, 5, 1),
////                Arrays.asList(2, 7, 6)
////        ));
////
////        magic.add(Arrays.asList(
////                Arrays.asList(6, 7, 2),
////                Arrays.asList(1, 5, 9),
////                Arrays.asList(8, 3, 4)
////        ));
////
////        magic.add(Arrays.asList(
////                Arrays.asList(2, 7, 6),
////                Arrays.asList(9, 5, 1),
////                Arrays.asList(4, 3, 8)
////        ));
//        int[][][] magic = {
//            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
//            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
//            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
//            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
//            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
//            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
//            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
//            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
//        };
//        Integer cost = Integer.MAX_VALUE;
//        for (int[][] i : magic) {
//            Integer kq = 0;
//            for (int j = 0; j < 3; j++) {
//                for (int k = 0; k < 3; k++) {
//                    kq = kq + Math.abs(i[j][k] - s.get(j).get(k));
//                }
//            }
//            cost = Math.min(cost, kq);
//        }
//        return cost;
//    }
//
//}
//
//public class hinh_vuong_ma_thuat {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<List<Integer>> s = new ArrayList<>();
//
//        IntStream.range(0, 3).forEach(i -> {
//            try {
//                s.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        int result = Result.formingMagicSquare(s);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
