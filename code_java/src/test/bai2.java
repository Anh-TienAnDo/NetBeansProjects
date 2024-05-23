/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Admin
 */
public class bai2 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            if (i < 3) {
                arr[i] = i + 1;
            } else {
                arr[i] = arr[i - 1] * arr[i - 2] * arr[i - 3];
            }
        }
        double avg;
        long sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += arr[i];
        }
        avg = (double) sum / 100;
        System.out.println(avg);

        for (int i = 40; i < 100; i++) {
            if(arr[i]>=avg){
                System.out.println(i-1 + i);
                break;
            }
        }

    }
}
