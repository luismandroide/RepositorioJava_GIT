package seccion_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioOperaciones {
    
    public static void main(String[] args) throws Exception{
    
        int a, b;
        double x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.print("ENTERO: ");
        a = Integer.parseInt(br.readLine());
        
        System.out.print("Otro ENTERO: ");
        b = Integer.parseInt(br.readLine());
        
        System.out.print("REAL: ");
        x = Double.parseDouble(br.readLine());
        
        System.out.print("Otro REAL: ");
        y = Double.parseDouble(br.readLine());
        
        System.out.println("la suma de " + a + " y " + b + " es " + (a+b));
        System.out.println("la resta de " + a + " y " + b + " es " + (a-b));
        System.out.println("la multiplicación de " + a + " por " + b + " es " + (a*b));
        System.out.println("la división de " + a + " por " + b + " es " + (a/b));
        System.out.println("el módulo de la división de " + a + " por " + b + " es " + (a%b));
        
        System.out.println("la suma de " + x + " y " + y + " es " + (x+y));
        System.out.println("la resta de " + x + " y " + y + " es " + (x-y));
        System.out.println("la multiplicación de " + x + " por " + y + " es " + (x*y));
        System.out.println("la división de " + x + " por " + y + " es " + (x/y));
        System.out.println("el módulo de la división de " + x + " por " + y + " es " + (x%y));
        
        
        System.out.println("la suma de " + a + " y " + x + " es " + (a+x));
        System.out.println("la resta de " + a + " y " + x + " es " + (a-x));
        System.out.println("la multiplicación de " + a + " por " + x + " es " + (a*x));
        System.out.println("la división de " + a + " por " + x + " es " + (a/x));
        System.out.println("el módulo de la división de " + a + " por " + x + " es " + (a%x));
        
    }
    
}
