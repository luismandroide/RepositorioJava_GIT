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
public class Ejemplo_Funciones {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("NÚMERO: ");
        int a = Integer.parseInt(br.readLine());
        int b = multiplicaPorTres(a);
        System.out.println("El resultado de  multiplicar " + a + " por tres es " + b);
        
    }
    
    static int multiplicaPorTres(int p){
        
        int r = p * 3;
        return r;
    }
            
    
}
