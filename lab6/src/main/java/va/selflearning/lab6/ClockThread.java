/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va.selflearning.lab6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author vanan
 */
public class ClockThread extends Thread{
    private JButton button; 

    public ClockThread(JButton button) {
        this.button = button;
    }
    
    
   @Override
   public void run(){
       SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
       
       while(true){
           Date now = new Date(); 
           
           String st = sdf.format(now); 
           button.setText(st);
           
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {}
       }
       
   }
}
