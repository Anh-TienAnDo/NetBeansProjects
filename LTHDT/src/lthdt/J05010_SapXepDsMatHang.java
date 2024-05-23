/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J05010_SapXepDsMatHang {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DsMH> ds = new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            ds.add(new DsMH(i,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
//        Collections.sort(ds, new Comparator<DsMH>() {
//            @Override
//            public int compare(DsMH o1, DsMH o2) {
//                if(o1.getLoi()>o2.getLoi()){
//                    return -1;
//                }
//                return 1;
//            }
//        });
        ds.sort(Comparator.comparing(DsMH::getLoi).reversed());
        for (DsMH d : ds) {
            d.show();
        }
    }

    private static class DsMH {
        int ma;
        String ten,loai;
        double mua,ban,loi;

        public DsMH(int ma, String ten, String loai, double mua, double ban) {
            this.ma = ma;
            this.ten = ten;
            this.loai = loai;
            this.mua = mua;
            this.ban = ban;
            this.loi=ban-mua;
        }
        public void show(){
//            DecimalFormat de = new DecimalFormat("#0.00");
            DecimalFormat de = new DecimalFormat("#0.00");
            System.out.println(ma+" "+ten+" "+loai+" "+de.format(loi));
        }

        public double getLoi() {
            return loi;
        }
        
    }
}
