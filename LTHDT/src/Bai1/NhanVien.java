/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class NhanVien extends CanBo{
    protected String congViec;

    public NhanVien(String ten, Integer tuoi, String gioiTinh, String diaChi, String congViec) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ten=" + ten + 
                ", tuoi=" + tuoi + 
                ", gioiTinh=" + gioiTinh + 
                ", diaChi=" + diaChi + 
                ", congViec=" + congViec + '}';
    }
    
    
}
