/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videotutorialesjava_01;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author LuigiMIX
 */
public class Medidor_Velocidad {
    
    public static void main(String[ ] args) {
         Calendar start = Calendar. getInstance();
         int startMinute = start.get(Calendar. MINUTE);
         int startSecond = start.get(Calendar. SECOND);
         start.roll(Calendar.MINUTE, true);
         int nextMinute = start. get(Calendar. MINUTE);
         int nextSecond = start. get(Calendar. SECOND);
         int index = 0;
         while ( true) {
             double x = Math.sqrt(index) ;
             GregorianCalendar now = new GregorianCalendar() ;
             if (now. get(Calendar.MINUTE) >= nextMinute) {
                 if ( now.get(Calendar.SECOND) >= nextSecond) {
                     break;
                 }
             }
             index++;
         }
         System. out.println(index + " loops en un minuto." ) ;
     }
    
}
