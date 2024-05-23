/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J05033_sapXepThoiGian {

    static class Time {

        private int hour;
        private int minute;
        private int second;

        public void nhap(Scanner scanner) {
            hour = scanner.nextInt();
            minute = scanner.nextInt();
            second = scanner.nextInt();
        }

        public void in() {
            System.out.println(hour + " " + minute + " " + second);
        }

        public int getTime() {
            return hour * 60 * 60 + minute * 60 + second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> res = new ArrayList<>();
        while (n-- > 0) {
            Time t = new Time();
            t.nhap(sc);
            res.add(t);
        }
        Collections.sort(res, Comparator.comparing(Time::getTime));
        res.forEach(Time::in);
    }
    
}
