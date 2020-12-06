/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va.selflearning.lab5;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import va.selflearning.lab5.utils.XFile;

/**
 *
 * @author vanan
 */
public class MainClass {
    public static void main(String[] args) {
        try {
            String path ="F:/Demo/FileDemo/excercise1.dat";
            XFile.write(path, "Today I learn Thread in Java".getBytes());
            
            byte[] data = XFile.read(path);
            System.out.println("Read Data:  " + new String(data));
            
        } catch (IOException ex) {
            //Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
        
    }
}
