/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Admin
 */
public class HinhChuNhat extends Hinhf{
    private Double rong, cao;

    public HinhChuNhat(ToaDo toaDo, Double rong, Double cao) {
        super(toaDo);
        this.rong = rong;
        this.cao = cao;
    }

    public Double getRong() {
        return rong;
    }

    public void setRong(Double rong) {
        this.rong = rong;
    }

    public Double getCao() {
        return cao;
    }

    public void setCao(Double cao) {
        this.cao = cao;
    }

    @Override
    public Double DienTich() {
        return 1.0*rong*cao;
    }
    
}
