/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCanBo managerOfficer = new QuanLyCanBo();
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1" ->  {
                    System.out.println("Enter a: to insert Enginner");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a" ->  {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter branch: ");
                            String branch = scanner.nextLine();
                            // khởi tạo vùng nhớ kiểu Kỹ sư gồm các thuộc tính của KySu
                            // tạo biến engineer với kiểu CanBo nên chỉ truy cập đc các thuộc tính của CanBo
                            CanBo engineer = new KySu(name, age, gender, address, branch);
                            managerOfficer.addCanBo(engineer);
                            System.out.println(engineer.toString());

                        }
                        case "b" ->  {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter level: ");
                            int level = scanner.nextInt();
                            CanBo worker = new CongNhan(name, age, gender, address, level);
                            managerOfficer.addCanBo(worker);
                            System.out.println(worker.toString());
                            scanner.nextLine();
                        }
                        case "c" ->  {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter task: ");
                            String task = scanner.nextLine();
                            CanBo staff = new NhanVien(name, age, gender, address, task);
                            managerOfficer.addCanBo(staff);
                            System.out.println(staff.toString());
                        }
                        default -> System.out.println("Invalid");
                    }
                }
                case "2" ->  {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    managerOfficer.timKiemCanBoTheoTen(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                }
                case "3" ->  {
                    managerOfficer.hienThiThongTinCanBo();
                }
                case "4" -> {
                    return;
                }
                default -> {
                    System.out.println("Invalid");
                    continue;
                }
            }

        }
    }

}
