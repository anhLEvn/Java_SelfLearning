/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va.selflearning.lab6;

/**
 *
 * @author vanan
 */
public class MainClass1 {
    public static void main(String[] args) {
        MyThread mth1 = new MyThread();
        MyThread mth2 = new MyThread();
    
        Thread th1 = new Thread(mth1);
        Thread th2 = new Thread(mth2);
        
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        
        th1.start();
        
        th2.start();
        
        System.out.println("Completed");
    
    }
    
    
    
    
}
