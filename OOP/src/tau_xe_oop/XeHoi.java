/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tau_xe_oop;

/**
 *
 * @author Admin
 */
public class XeHoi extends Xe implements Retrograde{
    private String dungTichBinh;

    public XeHoi(String dungTichBinh, String name, String publisher, int year, String nguyenLieu) {
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
        System.out.println("Xe dung dong co dot trong");
    }

    @Override
    public void stop() {
        System.out.println("dap phanh");
    }

    @Override
    public void retrograde() {
        System.out.println("Xe di lui");
    }
    
    
}
