/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tau_xe_oop;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Xe xe1 = new XeHoi("0.2l", "anh", "anh", 2024, "xang");
        xe1.run();
        xe1.stop();
        
        TauThuyen tau1 = new ThuyenBuom("anh", "anh", 2024, null);
        tau1.run();
        tau1.stop();
    }
}
