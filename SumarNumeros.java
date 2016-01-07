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
public class SumarNumeros {
    
    public static void main(String[] args) throws Exception{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Quieres sumar números (s/n? ");
        String respuesta = br.readLine();
        int total = 0;
        
        while (respuesta.equals("s")){
            System.out.print("Introduce un número: ");
            int numero = Integer.parseInt(br.readLine());
            total = total + numero;
            System.out.print("¿Quieres sumar números (s/n? ");
            respuesta = br.readLine();
        }
        System.out.println("El resultado es: " + total);
        
    }
    
}
