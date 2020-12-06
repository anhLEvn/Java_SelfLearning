/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va.selflearning.lab4.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vanan
 */
public class XDate {
    public static Date parse(String text) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY"); 
        
        return sdf.parse(text); 
    }
    
    public static Date parse(String text, String pattern) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat(pattern); 

    return sdf.parse(text); 
}
}
