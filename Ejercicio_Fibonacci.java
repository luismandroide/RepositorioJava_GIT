/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static seccion_04.EjemploFactorial.factorial;

/**
 *
 * @author LuigiMIX
 */
public class Ejercicio_Fibonacci {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("NÚMERO ");
        int numero = Integer.parseInt(br.readLine());
        System.out.println("FIBONACCI de "+ numero + " es "+ fibonacci(numero));
    }
    
    
    static int fibonacci(int numero){
            if( numero < 2 )
                return numero;
            else
             return fibonacci(numero-1)+fibonacci(numero-2);
        }
    
}
