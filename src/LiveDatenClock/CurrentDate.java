/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiveDatenClock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alkin PC
 */
public class CurrentDate {
    public String getCurDate(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDateTime now=LocalDateTime.now();
        return dtf.format(now).toString();
    }
    
}
