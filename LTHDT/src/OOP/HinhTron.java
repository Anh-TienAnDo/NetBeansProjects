/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Admin
 */
public class HinhTron extends Hinhf{
    private Double r;

    public HinhTron(ToaDo toaDo, Double r) {
        super(toaDo);
        this.r = r;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    @Override
    public Double DienTich() {
        return 3.14*r*r;
    }
    
}
