/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.*;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        List<ToaDo> toado = new ArrayList<ToaDo>();
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            toado.add(new ToaDo(sc.nextInt(), sc.nextInt()));
        }
        for (ToaDo td : toado) {
            System.out.println("toa do: " + td);
            Diem diem = new Diem(td);
            System.out.println("Dien tich diem: " + diem.DienTich());

            HinhTron ht = new HinhTron(td, 3.0);
            System.out.println("Dien tich hinh tron: " + Math.round(ht.DienTich() * 100) / 100);

            HinhChuNhat hcn = new HinhChuNhat(td, 6.0, 3.0);
            System.out.println("Dien tich hinh chu nhat: " + Math.round(hcn.DienTich() * 100) / 100);
        }

    }
}
