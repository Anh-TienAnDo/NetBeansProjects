/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Admin
 */
public class Student {
//    public String id; // công khai tt: tt có thể được truy cập và thay dổi student.id=... từ bên ngoài
    private String id;
    public String name;
    protected int age;
    private float point;
    
    public Student(){
        
    }
    public Student(String id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }
    
    public float Tong(){
        return (point*4/10);
    }

    
    
}
