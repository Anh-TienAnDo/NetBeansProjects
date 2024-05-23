/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterFace;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        DienTichHCN hcn = new HCN();
        System.out.println(hcn.DienTich(5.2, 6.4));
        
        DienTichHTron ht = new HinhTron();
        System.out.println(ht.DienTich(7.8));
        
        TinhToan tt = new TinhToan();
        System.out.println(tt.DienTich(5.2, 6.4));
        System.out.println(tt.DienTich(7.8));
        
    }
}
