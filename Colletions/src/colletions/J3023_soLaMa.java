/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J3023_soLaMa {

    public static void main(String[] args) {
        String b= "IVXLCDM";
        Scanner sc = new Scanner(System.in);
        String[] a= {"1","5","10","50","100","500","1000"};
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            ArrayList<Integer> cs = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if(b.charAt(j)==s.charAt(i)){
                        cs.add(Integer.parseInt(a[j]));
                        break;
                    }
                }
            }
            long tong=cs.get(cs.size()-1);
            for (int i=0;i<cs.size()-1;i++) {
                long tmp=cs.get(i);
                if(tmp>=cs.get(i+1)){
                    tong=tong+tmp;
                }
                else tong=tong-tmp;
            }
            System.out.println(tong);
        }
    }
}
