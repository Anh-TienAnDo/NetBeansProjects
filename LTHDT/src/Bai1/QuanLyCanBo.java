/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class QuanLyCanBo {
    protected List<CanBo> qlCanBo;

    public QuanLyCanBo() {
        this.qlCanBo=new ArrayList<>();
    }

    public void addCanBo(CanBo canBo) {
        this.qlCanBo.add(canBo);
    }
    
    public List<CanBo> timKiemCanBoTheoTen(String ten){
        return this.qlCanBo.stream()
                .filter(c -> c.getTen().contains(ten)).collect(Collectors.toList());
    }
    
    public void hienThiThongTinCanBo(){
        this.qlCanBo.forEach(c -> System.out.println(c.toString()));
    }
}
