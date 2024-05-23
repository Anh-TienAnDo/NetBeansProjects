/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Admin
 */
// Lớp XeHoiDien kế thừa từ lớp trừu tượng XeHoi
class XeHoiDien extends XeHoi {
    private int dungLuongPin;

    public XeHoiDien(String mauSac, String hangSanXuat, int dungLuongPin) {
        super(mauSac, hangSanXuat);
        this.dungLuongPin = dungLuongPin;
    }

    public int getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(int dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    @Override
    public void chay() {
        System.out.println("Xe hơi điện đang chạy bằng điện.");
    }

    @Override
    public void dung() {
        System.out.println("Xe hơi điện đã dừng.");
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Xe hơi điện - Màu sắc: " + getMauSac() + ", Hãng sản xuất: " + getHangSanXuat() + ", Dung lượng pin: " + dungLuongPin);
    }
}
