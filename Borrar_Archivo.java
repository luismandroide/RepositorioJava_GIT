/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package videotutorialesjava_01;

import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author LuigiMIX
 */
public class Borrar_Archivo {
    
    public static void main(String args[] ) {
        File archivo = new File("e:\\miArchivo.txt" ) ;
        Scanner miScanner = new Scanner (System.in) ;
        char replica;
        do {
            out. print("¿Borrar archivo? (s/ n) " ) ;
        replica = miScanner. findWithinHorizon( "." , 0) . charAt( 0) ; }
        while (replica != 's' && replica != 'n' && replica != 'S' && replica != 'N' ) ;
        if ( replica == 's' || replica == 'S'  ) {
            out. println( "De acuerdo, borrando archivo. . . ") ;
            archivo. delete() ; }
        else {
            out. println( "De acuerdo, confirmado no borrar. ") ;
        }
    }
    
}
