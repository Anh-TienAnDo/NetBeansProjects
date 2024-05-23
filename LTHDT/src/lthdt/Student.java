/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

/**
 *
 * @author Admin
 */
public class Student extends Person{
    private String hoc_van;
    
    public Student(String name, int age, String hoc_van) {
        super(name, age);
        this.hoc_van=hoc_van;
    }
    public void show(){
        System.out.println("name: " + getName() + ", " + "age: "+getAge()+", " + "hoc van: " + hoc_van);
    }
    
    
    
}
