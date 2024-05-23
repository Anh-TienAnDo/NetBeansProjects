/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class DS_mon_thi {

    public static class DsMonHoc{
        private String ma,ten,ht;

        public DsMonHoc(String ma, String ten, String ht) {
            this.ma = ma;
            this.ten = ten;
            this.ht = ht;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public String getHt() {
            return ht;
        }
        public void show(){
            System.out.println(ma+" "+ten+" "+ht);
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        ArrayList<DsMonHoc> ds = new ArrayList<>();
        TreeSet<String> tree=new TreeSet<>();
        while (sc.hasNextLine()) {
            String ma,ten,ht;
            ma=sc.nextLine();
            ten=sc.nextLine();
            ht=sc.nextLine();
            tree.add(ma);
            ds.add(new DsMonHoc(ma,ten,ht));
        }
        for (String tr : tree) {
            for (DsMonHoc d : ds) {
                if(tr.equals(d.getMa())){
                    d.show();
                    break;
                }
            }
        }
        
    }
}
