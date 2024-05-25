/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tau_xe_oop;

/**
 *
 * @author Admin
 */
public class ThuyenBuom extends TauThuyen{

    public ThuyenBuom(String name, String publisher, int year, String nguyenLieu) {
        super(name, publisher, year, nguyenLieu);
    }
    

    @Override
    public void run() {
        System.out.println("Thuyen dung suc gio");
    }

    @Override
    public void stop() {
        System.out.println("Keo buom lai");
    }
    
}
