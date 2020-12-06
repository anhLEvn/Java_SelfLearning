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
public class Exo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        do{
        System.out.println("Input radius of the circle: ");
        double radius = sc.nextDouble(); 
        if (radius ==0){
            System.out.println("Radius must be superior than 0!");
        }else {
        double round = 2*radius*Math.PI;
        System.out.printf("Round of the circle: %f\n ", round);
        
        double area = (Math.pow(radius, 2))*Math.PI;
        System.out.printf("Area of the circle: %f \n", area);
        }
        System.out.println("Continue? (Y/N)");
        String choice; 
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("N")){
                break;
            }
    }while(true);
        
    } 
}
