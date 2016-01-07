package seccion_02;

public class EjemploConversiones {
    
    public static void main(String[] args){
    
        int a =5;
        int b = 7;
        double c = 0.5;
        String s = "7";
        
        System.out.println("La variable a vale: " + a);
        System.out.println("La variable b vale: " + b);
        System.out.println("La variable c vale: " + c);
        System.out.println("La variable s vale: " + s + "\n");
        
        c = a;
        // conversión implícita
        a = (int)c;
        // casting
        b = Integer.parseInt(s);
        // método de la clase asociada
        System.out.println("La variable c vale: " + c);
        System.out.println("La variable a vale: " + a);
        System.out.println("La variable b vale: " + b);
        
    }
}
