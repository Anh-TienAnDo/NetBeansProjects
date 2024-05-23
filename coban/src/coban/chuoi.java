/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coban;

/**
 *
 * @author Admin
 */
public class chuoi {

    public static void main(String[] args) {
        String s = "ab abc asd";
        System.out.println(s.charAt(0));
        if (!s.equals("le")) {
            System.out.println("YES");
        }
        if (s.charAt(0) == 'l') {
            System.out.println("y");
        }
        if (s.contains("gg")) {
            System.out.println("y");
        }
        System.out.println(s.indexOf("anh"));
        System.out.println(s.replace("ab", "_"));
        System.out.println(s.replaceAll("ab", "_"));
        String ss[] = s.split(" ");
        System.out.println(ss[0]);

    }
}
