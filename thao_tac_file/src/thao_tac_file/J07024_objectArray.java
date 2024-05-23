/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class J07024_objectArray {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> l = (ArrayList<Integer>) o.readObject();
        int a[] = new int[1000000];
        for (Integer i : l) {
            if(kt(i)){
                a[i]++;
            }
        }
        int dem=0;
        for(int i=1000000;i>=2;i--){
            if(dem>2) break;
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
                dem++;
            }
        }
    }

    private static boolean kt(int i) {
        if(i<2) return false;
        for(int j=2;j<=sqrt(i);j++){
            if(i%j==0) return false;
        }
        return true;
    }
}
