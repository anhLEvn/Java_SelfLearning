/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va.selflearning.lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanan
 */
public class MyThread implements Runnable{

    @Override
    public void run() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
               // Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
