/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tau_xe_oop;

/**
 *
 * @author Admin
 */
public class TauChoHang extends TauThuyen{
    private String dungTichBinh;

    public TauChoHang(String dungTichBinh, String name, String publisher, int year, String nguyenLieu) {
        super(name, publisher, year, nguyenLieu);
        this.dungTichBinh = dungTichBinh;
    }

    public String getDungTichBinh() {
        return dungTichBinh;
    }

    public void setDungTichBinh(String dungTichBinh) {
        this.dungTichBinh = dungTichBinh;
    }
    

    @Override
    public void run() {
        System.out.println("Tau dung dong co dot trong");
    }

    @Override
    public void stop() {
        System.out.println("Tat dong co");
    }
    
}
