/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class KySu extends CanBo {

    protected String nganhDaoTao;

    public KySu(String ten, Integer tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" + "ten=" + ten
                + ", tuoi=" + tuoi
                + ", gioiTinh=" + gioiTinh
                + ", diaChi=" + diaChi + 
                ", nganhDaoTao=" + nganhDaoTao + '}';
    }

}
