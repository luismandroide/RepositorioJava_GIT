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
public class EjemploFactorial {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("NÚMERO: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("El FACTORIAL de "+ n + " es "+ factorial(n));
    }
    static int factorial(int n){
        
        if(n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
}
