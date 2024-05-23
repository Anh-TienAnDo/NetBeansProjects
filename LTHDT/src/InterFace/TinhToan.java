/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterFace;

/**
 *
 * @author Admin
 */
public class TinhToan implements DienTichHCN, DienTichHTron {

    @Override
    public Integer DienTich(Integer a, Integer b) {
        DienTichHCN dthcn = new HCN();
        return dthcn.DienTich(a, b);
    }

    @Override
    public Double DienTich(Double a, Double b) {
        DienTichHCN dthcn = new HCN();
        return dthcn.DienTich(a, b);
    }

    @Override
    public Integer DienTich(Integer r) {
        DienTichHTron dtht = new HinhTron();
        return dtht.DienTich(r);
    }

    @Override
    public Double DienTich(Double r) {
        DienTichHTron dtht = new HinhTron();
        return dtht.DienTich(r);
    }

}
