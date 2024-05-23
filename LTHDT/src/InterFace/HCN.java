/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterFace;

/**
 *
 * @author Admin
 */
public class HCN implements DienTichHCN{

    @Override
    public Integer DienTich(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public Double DienTich(Double a, Double b) {
        return a*b;
    }
    
}
