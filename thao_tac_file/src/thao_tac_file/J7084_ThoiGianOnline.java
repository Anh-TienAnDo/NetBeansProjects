/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J7084_ThoiGianOnline {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        String dateStart = "01/14/2015 08:29:58";
//        String dateStop = "01/15/2015 07:31:48";
//
//        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//
//        Date d1 = format.parse(dateStart);
//        Date d2 = format.parse(dateStop);
//
//        long diff = d2.getTime() - d1.getTime();
//
//        long diffSeconds = diff / 1000 % 60;
//        long diffMinutes = diff / (60 * 1000) % 60;
//        long diffHours = diff / (60 * 60 * 1000) % 24;
//        long diffDays = diff / (24 * 60 * 60 * 1000);
//
//        System.out.print(diffDays + " days, ");
//        System.out.print(diffHours + " hours, ");
//        System.out.print(diffMinutes + " minutes, ");
//        System.out.print(diffSeconds + " seconds.");
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DsOnline> ds = new ArrayList<>();
        while (t-- > 0) {
            ds.add(new DsOnline(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        ds.sort(Comparator.comparing(DsOnline::getTime).reversed().thenComparing(DsOnline::getTen));
        for (DsOnline d : ds) {
            d.show();
        }
    }

    private static class DsOnline {

        private String ten;
        private Date on, off;
        private long time;

        public DsOnline(String ten, String on, String off) throws ParseException {
            this.ten = ten;
            this.on = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(on);
            this.off = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(off);
            
            long diff = this.off.getTime() - this.on.getTime();
            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);
            this.time = diffMinutes + diffHours*60 + diffDays*24*60;
        }

        public String getTen() {
            return ten;
        }

        public long getTime() {
            return time;
        }
        public void show(){
            System.out.println(ten + " " + time);
        }

    }
}
