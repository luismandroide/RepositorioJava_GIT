/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author LuigiMIX
 */
public class EjercicioAprobadoSuspendido {
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("NOTA: ");
        int nota = Integer.parseInt(br.readLine());
        
        if( nota >=0 && nota <= 10){
            switch(nota){
                case 5:
                    System.out.println("SUFICIENTE");
                    break;
                case 6:
                    System.out.println("BIEN");
                    break;
                 case 7:
                 case 8:
                    System.out.println("NOTABLE");
                    break;
                 case 9:
                 case 10:
                    System.out.println("SOBRESALIENTE");
                    break;
                 default:
                     System.out.println("SUSPENDIDO");
            }
        }
        else{
            System.out.println("ERROR: el valor es incorrecto");
        }
        
    }
    
}
