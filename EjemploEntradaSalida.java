/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LuigiMIX
 */
public class EjemploEntradaSalida {
    
    public static void main(String[] args) throws Exception{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("VARIABLE: ");
        String s = br.readLine();
        System.out.println("la variable s vale: " + s);
        
    }
    
}
