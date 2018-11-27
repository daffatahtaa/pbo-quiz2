/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;

/**
 *
 * @author bagas
 */
public interface DateTime {
    DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
    JFormattedTextField dateTextField = new JFormattedTextField(format);
    
    
}
