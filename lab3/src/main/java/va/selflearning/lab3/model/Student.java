/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va.selflearning.lab3.model;
/**
 *
 * @author vanan
 */
public class Student {
    private String studentId, name, major;
    private float mark; 

    public Student() {
    }

    public Student(String studentId, String name, String major, float mark) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.mark = mark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public String getCapacity(){
        if(mark >= 9){
            return "Distinction";
        }
        if(mark < 9 && mark >= 7.5){
            return "Very Good";
            }
        if(mark < 7.5 && mark >= 6.5){
                return "Good";
        }
        if(mark < 6.5 && mark >= 5){
                return "Passed";
        }
        return "Fail";
    }
    public boolean isBonnus(){
        return mark >= 7.5; 
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
          
    
}
