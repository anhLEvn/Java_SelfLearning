/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va.selflearning.lab5.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author vanan
 */
public class XFile {
    
    public static Object readOject(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        try(
                FileInputStream fis = new FileInputStream(path); 
                ObjectInputStream ois = new ObjectInputStream(fis);
                ){
            return ois.readObject(); 
        }
    }
    
    public static void writeObject(String path, Object data) throws FileNotFoundException, IOException {
        try(
                FileOutputStream fos = new FileOutputStream(path); 
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ){
            oos.writeObject(data);
            
        }
        
    }
    public static byte[] read(String path) throws FileNotFoundException, IOException{
        try (
                //FileInputStream fis = new FileInputStream("F:/Demo/FileDemo/excercise1.dat");){
                FileInputStream fis = new FileInputStream(path);){
                int length = fis.available(); 
                byte[] buffer = new byte[length];
                
                fis.read(buffer); 
                
                return buffer; 
        }
            
        } // catch (Exception e) { - Dont use catch clause because of using throws clause above
        
    
    
    public static void write(String path, byte[] data) throws FileNotFoundException, IOException{
        try (
                FileOutputStream fos = new FileOutputStream(path);){
            fos.write(data);
        }
    }
}
