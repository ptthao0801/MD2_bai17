package controller;
import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student_Controller {
    public static void writeDataToFile(String path, List<Student> students){
        try {
            // tạo 1 đối tượng fos liên kết với path mong muốn
            FileOutputStream fos = new FileOutputStream(path);
            // tạo một đối tượng ObjectOutputStream và liên kết nó với một FileOutputStream đã tồn tại, được sử dụng để ghi các đối tượng Java vào tệp
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
