/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterFace;

/**
 *
 * @author Admin
 */
public class HinhTron implements DienTichHTron{

    @Override
    public Integer DienTich(Integer r) {
        return 3*r*r;
    }

    @Override
    public Double DienTich(Double r) {
        return 3.14*r*r;
    }
    
}
