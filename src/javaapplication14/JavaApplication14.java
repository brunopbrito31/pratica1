/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import static java.util.Date.parse;
import java.util.TimeZone;

/**
Estudo da sintaxe das classes Date , SimpleDate e das operações envolvendo o calendar
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date y1 = new Date();
        Date y2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));// Realizar a impressão no horário GMT
        
        System.out.println(sdf1.format(y2));
    }
    
}
