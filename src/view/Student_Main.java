package view;
import model.*;
import controller.*;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import static controller.Student_Controller.readDataFromFile;
import static controller.Student_Controller.writeDataToFile;

public class Student_Main {
    public static void main(String[] args) {
        // Tạo các đối tượng học viên
        Student student1 = new Student(1,"A","Hà Nội");
        Student student2 = new Student(2,"B","SG");
        Student student3 = new Student(3,"C","Huế");
        Student student4 = new Student(4,"D","Sài Gòn");
        // Khai báo danh sách học viên
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        // write
        writeDataToFile("student.txt", students);

        // read
        System.out.println("read");
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}