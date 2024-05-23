/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class co_ban {

    static class Student {

        String id;
        String name;
        String lop;
        double p1;
        double p2;
        double p3;

        public Student(String id, String name, String lop, double p1, double p2, double p3) {
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            DecimalFormat de = new DecimalFormat("#0.0");
            return id + " "
                    + name + " "
                    + lop + " "
                    + de.format(p1) + " "
                    + de.format(p2) + " "
                    + de.format(p3) + " ";
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stList = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            double p1 = Double.parseDouble(sc.nextLine());
            double p2 = Double.parseDouble(sc.nextLine());
            double p3 = Double.parseDouble(sc.nextLine());
            stList.add(new Student(id, name, lop, p1, p2, p3));
        }
        stList.sort(Comparator.comparing(Student::getId));
        for (int i = 0; i < stList.size(); i++) {
            System.out.println(i + 1 + " " + stList.get(i));
        }
    }
}
