/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyFamily;

/**
 *
 * @author Admin
 */
public class Person {
    protected String ten;
    protected int tuoi;
    protected boolean gioi_tinh = false;
    protected String fatherIs;
    protected String motherIs;

    public Person(String ten, int tuoi, boolean gioi_tinh, String fatherIs, String motherIs) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioi_tinh = gioi_tinh;
        this.fatherIs = fatherIs;
        this.motherIs = motherIs;
    }

    public Person(){
    }
    
    public void Noi(){
        System.out.println("can speak");
    }
    public void DiBo(){
        System.out.println("can walk");
    }
    public void Chay(){
        System.out.println("can run");
    }
    
}
