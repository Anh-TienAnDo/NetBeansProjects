/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J05021_SapXepTheoMaSV {
    static class Student {

        private String id;
        private String name;
        private String lop;
        private String email;

        public Student() {
        }

        public Student(String id, String name, String lop, String email) {
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
        }

        public String getId() {
            return id;
        }
        
        public String getLop() {
            return lop;
        }

        @Override
        public String toString() {
            return id + " "
                    + name + " "
                    + lop + " "
                    + email;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> ds = new ArrayList<>();
        int t = sc.nextInt();sc.nextLine();
        while (t-- > 0) {
            String id, name, lop, email;
            id = sc.nextLine();
            name = sc.nextLine();
            lop = sc.nextLine();
            email = sc.nextLine();
            ds.add(new Student(id, name, lop, email));
        }
        ds.sort(Comparator.comparing(Student::getLop).thenComparing(Student::getId));
        for (Student i : ds) {
            System.out.println(i);
        }
    }
}
