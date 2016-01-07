/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videotutorialesjava_01;

import java.util.Calendar;

/**
 *
 * @author LuigiMIX
 */
public class Reloj {
    
    public static void main(String[] args) {
        // Obtener fecha y hora actual
        Calendar ahora = Calendar.getInstance();
        int hora = ahora.get(Calendar.HOUR_OF_DAY);
        int minuto = ahora.get(Calendar.MINUTE);
        int mes = ahora.get(Calendar.MONTH) + 1;
        int dia = ahora.get(Calendar.DAY_OF_MONTH);
        int an = ahora.get(Calendar.YEAR);
        
        if( hora < 12 ){
            System.out.println("Buenos días");
        }
        else if( hora < 17 ){
            System.out.println("Buenas tardes");
        }
        else{
            System.out.println("Buenas Noches");
        }
        
        System.out.print("Son las ");
        System.out.print( (hora > 12) ? (hora - 12) : hora );
        System.out.print(" horas y ");
        
        if( minuto != 0 ){
            System.out.print(minuto + " ");
            System.out.print( ( minuto != 1) ? "minutos" : "minuto" );
        }
       
        System.out.print(" del dia " + dia + " de ");
        
        switch (mes){
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBFRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            default:
                System.out.println("DICIEMBRE");
                        
        }
                
    }
    
}
