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
public class Factorial {
    
    public static void main(String[] args) throws Exception{
    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("NÚMERO: ");
            int n = Integer.parseInt(br.readLine());
            
            while ( n < 0 ){
                System.out.println("ERROR: el número no es positivo");
                System.out.println("NÚMERO: ");
                n = Integer.parseInt(br.readLine());
            }
            int factorial = 1;
            
            for (int i = 1; i <= n; i++) {
            
                factorial *= i;
            }
            
            System.out.println("El FACTORIAL de " + n + " es " + factorial);
    }
    
}
