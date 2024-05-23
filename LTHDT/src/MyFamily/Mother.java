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
public class Mother extends Person{
    protected List<String> husbandIs;
    protected List<String> childIs;

    public Mother(List<String> husbandIs, List<String> childIs, String ten, int tuoi, String fatherIs, String motherIs) {
        super(ten, tuoi, false, fatherIs, motherIs);
        this.husbandIs = husbandIs;
        this.childIs = childIs;
    }

    public Mother() {
    }

    @Override
    public void Noi(){
        System.out.println("Talkative");
    }
    
}
