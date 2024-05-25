/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tau_xe_oop;

/**
 *
 * @author Admin
 */
public class XeDien extends Xe {
    private String dungTichPin;

    public XeDien(String dungTichPin, String name, String publisher, int year, String nguyenLieu) {
        super(name, publisher, year, nguyenLieu);
        this.dungTichPin = dungTichPin;
    }

    public String getDungTichPin() {
        return dungTichPin;
    }

    public void setDungTichPin(String dungTichPin) {
        this.dungTichPin = dungTichPin;
    }
    
    

    @Override
    public void run() {
        System.out.println("Xe dung dong co dien");
    }

    @Override
    public void stop() {
        System.out.println("dap phanh");
    }
    
}
