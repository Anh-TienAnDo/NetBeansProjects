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
public class GrandMother extends Mother{
    protected List<String> nephew;
    protected List<String> niece;

    public GrandMother(List<String> nephew, List<String> niece, List<String> wifeIs, List<String> childIs, String ten, int tuoi, String fatherIs, String motherIs) {
        super(wifeIs, childIs, ten, tuoi, fatherIs, motherIs);
        this.nephew = nephew;
        this.niece = niece;
    }

    public GrandMother() {
    }
    
    @Override
    public void Noi(){
        System.out.println("Talkative");
    }
}
