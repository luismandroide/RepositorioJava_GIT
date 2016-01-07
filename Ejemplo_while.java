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
public class Ejemplo_while {
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Quieres repetir (s/n)? ");
        String respuesta = br.readLine();
        
        while( respuesta.equals("s")){
            System.out.println("Repitiendo!!");
             System.out.print("¿Quieres repetir (s/n)? ");
             respuesta = br.readLine();
        }
        
    }
    
}
