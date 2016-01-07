/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author LuigiMIX
 */
public class EjercicioAcertarNumero {
    
    public static void main(String[] args) throws Exception{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int numero = r.nextInt(100);
        //System.out.println(numero);
        String respuesta = "";
        int n;
        
        do{
            System.out.print("NÚMERO: ");
            n = Integer.parseInt(br.readLine());
        
            if( n == numero ){
                System.out.println("ACIERTO");
            }
            else{
                if( n < numero ){
                    System.out.println("Has fallado es mayor");
                }
                else{
                    System.out.println("Has fallado es menor");
                }
        
                System.out.print("¿Quieres continuar (s/n)? ");
                respuesta = br.readLine();
             }
             
        }while( respuesta.equals("s") && n != numero);
        
    }
    
}
