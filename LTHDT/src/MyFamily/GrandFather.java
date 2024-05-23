/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyFamily;

import java.util.List;

/**
 *
 * @author Admin
 */
public class GrandFather extends Father{
    protected List<String> nephew;
    protected List<String> niece;

    public GrandFather(List<String> nephew, List<String> niece, List<String> wifeIs, List<String> childIs, String ten, int tuoi, String fatherIs, String motherIs) {
        super(wifeIs, childIs, ten, tuoi, fatherIs, motherIs);
        this.nephew = nephew;
        this.niece = niece;
    }

    public GrandFather() {
    }
    
    
    public void Noi(String content){
        System.out.println(content);
    }
    
    public double Toan(double a, double b){
        return (double) a+b;
    }
    
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        System.out.println(gf.gioi_tinh); // kq = true 
        gf.Noi("Nois chaamj");
        gf.Noi();
        System.out.println(gf.Toan(1, 3));
    }
}
