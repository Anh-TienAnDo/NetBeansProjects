/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Admin
 */
public class tinh_tong {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        Integer sum=0;
        while(sc.hasNext()){
            String s=sc.next();
            try{
                sum=sum+Integer.valueOf(s);
            }catch(NumberFormatException e){
                
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
