/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_bss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class bai1_sapxepnhanh {

    // In các phần tử của mảng
    static void printArray(List<Integer> arr) {
        for (Integer j : arr) {
            System.out.print(j);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // khởi tạo mảng 
        List<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(1,10,4,7,2,66));
        
        // sắp xếp mảng arr
        Collections.sort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

}
