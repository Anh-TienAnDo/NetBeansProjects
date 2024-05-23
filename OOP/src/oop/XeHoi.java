/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Admin
 */
// Giao diện XeCo (Abstraction - Tính trừu tượng)
interface XeCo {
    void chay();
    void dung();
}

// Lớp trừu tượng XeHoi (Abstraction - Tính trừu tượng)
abstract class XeHoi implements XeCo {
    private String mauSac;
    private String hangSanXuat;

    // Constructor để khởi tạo đối tượng XeHoi
    public XeHoi(String mauSac, String hangSanXuat) {
        this.mauSac = mauSac;
        this.hangSanXuat = hangSanXuat;
    }

    // Getter và setter
    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    // Phương thức trừu tượng
    public abstract void hienThiThongTin();
}
