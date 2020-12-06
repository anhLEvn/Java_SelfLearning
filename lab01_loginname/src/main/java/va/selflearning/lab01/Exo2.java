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
public class Exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Input the parameters: ");
        
        double a = sc.nextDouble(); 
        double b = sc.nextDouble(); 
        double c = sc.nextDouble(); 
        double root; 
        double delta; 
        
        if(a == 0){
            if(b==0){
                if(c==0){
                    System.out.println("The equatation has uncountable roots");
                }
                else System.out.println("The equatation has no root"); 
                
            }else {
                    root = -c/b;
                    System.out.printf("Equatation has 1 root: %f", root );
                    }
                } else {
                    delta = Math.pow(b, 2) - 4*a*c; 
                    if(delta < 0){
                        System.out.println("The equatation has no root"); 
                    }else if (delta == 0){
                        root = -b/(2*a); 
                    System.out.printf("Equatation has double root: %f \n", root );
                    }else{
                        
                        double root1 = (-b+Math.sqrt(delta))/(2*a);
                        double root2 = (-b-Math.sqrt(delta))/(2*a);
                        System.out.printf("Equatation has two different roots -- Root 1:%f \t Root 2: %f ", root1, root2);
                    }
            
        }
                
    }
    
}
