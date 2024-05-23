/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thao_tac_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class J7006_FileNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        int[] a = new int[1000];
        for (Integer i : l)
            a[i]++;
        for (int i = 0; i < 1000; i++)
            System.out.println(i + " " + a[i]);
    }
}
