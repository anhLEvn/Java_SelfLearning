/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va.selflearning.lab01;

import java.util.Scanner;

/**
 *
 * @author vanan
 */
public class student extends person{
    private int mark; 
    private String grade; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        student st1 = new student(); 
        st1.input();
    }
    
    public student() {
    }

    public student(int mark, String grade) {
        this.mark = mark;
        this.grade = grade;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
    }


    public void calGrade() {
        if(mark >= 8){ grade = "distinction"; }
        if(mark >= 7 && mark < 8){ grade = "distinction"; }
        if(mark >= 5 && mark < 7){ grade = "pass"; }
        if(mark >= 0){ grade = "fail"; }
    }
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if(mark < 0 && mark > 10){
            System.out.println("Mark unvalid");
        }else
        this.mark = mark;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
}
