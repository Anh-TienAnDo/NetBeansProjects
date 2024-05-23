/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class CongNhan extends CanBo{
    protected Integer bac;

    public CongNhan(String ten, Integer tuoi, String gioiTinh, String diaChi, Integer bac) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public Integer getBac() {
        return bac;
    }

    public void setBac(Integer bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" + "ten=" + ten + 
                ", tuoi=" + tuoi + 
                ", gioiTinh=" + gioiTinh + 
                ", diaChi=" + diaChi + 
                ", bac=" + bac + '}';
    }
    
    
    
}
