/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LuigiMIX
 */
public class EjercicioFuncion_esPrimo {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("NÚMERO: ");
        int numero = Integer.parseInt(br.readLine());
        
        //for( int i = 1; i <= 1000; i++ ){
        
                if ( esPrimo(numero) ){
                    System.out.println("El numero " + numero + " es PRIMO");
                }
                else{
                    System.out.println("El numero " + numero + " NO es Primo");
                }
        //}
        
    }
    static boolean esPrimo(int numero){
        
        boolean esprimo = true;
        int i = 2;
        
        while( i < numero ){
        
                if( numero%i == 0 )
                    esprimo = false;
                i++;
        }
        
        return esprimo;
    }
}
