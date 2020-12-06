/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va.selflearning.lab5;

import va.selflearning.lab5.model.Student;
import va.selflearning.lab5.utils.XFile;

/**
 *
 * @author vanan
 */
public class MainClass2 {
    public static void main(String[] args) {
        try{
            Student st = new Student("AnhLE", 9, "Data Science");
            String path = "F:Demo/FileDemo/student.dat";
            XFile.writeObject(path, st);
            
            Student std = (Student) XFile.readOject(path);
            System.out.println("Name:" + std.getName());
            System.out.println("Mark:" + std.getMark());
            System.out.println("Major:" + std.getMajor());
            System.out.println("Grade:" + std.getGrade());
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
}
