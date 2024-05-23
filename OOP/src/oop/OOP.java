/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author Admin
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tạo đối tượng của lớp XeHoiDien
        XeHoi xeHoiDien = new XeHoiDien("Xanh", "Tesla", 100);
        xeHoiDien.chay(); // Output: Xe hơi điện đang chạy bằng điện.
        xeHoiDien.dung(); // Output: Xe hơi điện đã dừng.
        xeHoiDien.hienThiThongTin(); // Output: Xe hơi điện - Màu sắc: Xanh, Hãng sản xuất: Tesla, Dung lượng pin: 100
    
        
//        // Tạo đối tượng của lớp XeHoi
//        XeHoi xeHoi = new XeHoi("Đỏ", "Toyota");
//        xeHoi.chay(); // Output: Xe hơi đang chạy.
//        xeHoi.dung(); // Output: Xe hơi đã dừng.
//
//        // Tạo đối tượng của lớp XeHoiDien
//        XeHoiDien xeHoiDien = new XeHoiDien("Xanh", "Tesla", 100);
//        xeHoiDien.chay(); // Output: Xe hơi điện đang chạy bằng điện.
//        xeHoiDien.sacPin(); // Output: Xe hơi điện đang sạc pin.
//
//        // Đa hình (Polymorphism)
//        XeHoi xeHoiPolymorph = new XeHoiDien("Trắng", "Nissan", 80);
//        xeHoiPolymorph.chay(); // Output: Xe hơi điện đang chạy bằng điện.
    }
    
}
