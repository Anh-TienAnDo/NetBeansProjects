/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thao_tac_file;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Thao_tac_file {

    /**
     * @param args the command line arguments
     */
    
    private static void thaoTacFileText() throws FileNotFoundException, IOException{
        File file = new File("input.txt");
        if (!file.exists()) {
            System.out.println("file khong ton tai");
        } else {
            System.out.println("File ton tai");
        }
        System.out.println("folder path: " + file.getParent());
        System.out.println("path: " + file.getPath());
        System.out.println("name: " + file.getName());
        System.out.println("full path: " + file.getAbsolutePath());
        File file1 = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\coban");
//        System.out.println("list: "+file1);
        Scanner sc = new Scanner(file);
        Integer sum = 0;
        while (sc.hasNextInt()) {
            Integer a = sc.nextInt();
            try {
                sum = sum + a;
                System.out.println(sum);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
   
    private static void thaoTacFileNhiPhan() throws FileNotFoundException, IOException{
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int a[] = new int[1000];
        for (int i = 0; i < 100000; i++) {
            a[in.readInt()]++;
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+" "+a[i]);
        }
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        thaoTacFileText();
        thaoTacFileNhiPhan();
        
        
//                while(sc.hasNextLine()){
//                String x = sc.nextLine();
//                String[] s=x.split(" ");
//                for(String i:s)
//                System.out.print(i+" ");
//                System.out.println("");
//            }

    }
    
}
