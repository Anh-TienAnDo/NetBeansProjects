/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tau_xe_oop;

/**
 *
 * @author Admin
 */
public abstract class Xe implements Runable, Stopable{
    private String name;
    private String publisher;
    private int year;
    private String nguyenLieu;

    public Xe(String name, String publisher, int year, String nguyenLieu) {
        this.name = name;
        this.publisher = publisher;
        this.year = year;
        this.nguyenLieu = nguyenLieu;
    }

    public String getNguyenLieu() {
        return nguyenLieu;
    }

    public void setNguyenLieu(String nguyenLieu) {
        this.nguyenLieu = nguyenLieu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public abstract void run();

    @Override
    public abstract void stop();
            
            
}
