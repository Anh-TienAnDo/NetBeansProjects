/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Danh_sach_SV {

    public static class DsSV {

        private String ma, ten="", lop;
        private Date sinh;
        private Double diem;

        public DsSV(int stt, String ten, String lop, String sinh, Double diem) throws ParseException {
            this.ma = "B20DCCN" + String.format("%03d", stt);
            this.lop = lop;
            this.sinh = new SimpleDateFormat("dd/mm/yyyy").parse(sinh);
            this.diem = diem;
            this.ten=ten;
            
        }

        public DsSV() {
        }

        public void show() {
            DecimalFormat de = new DecimalFormat("#0.00");
            System.out.println(ma + " " + ten+ lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(sinh)
                    + " " + de.format(diem)); 
        }
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        Scanner sc = new Scanner(new FileInputStream("SV.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<DsSV> l = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            l.add(new DsSV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        for (DsSV s : l) {
            s.show();
        }
    }
}
