
package co.edu.uniminuto;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Camila Rincón
 */
public class ExerciseNo1 {
    public static void main(String[] args){
        /*
        DS: suma de n numeros -> double
        DE: canatidad de numeros y los numeros 
        */
       
         //1. Instanciar un objeto de la clase Scanner
         Scanner read = new Scanner(System.in);
         short cantNumeros;
         double numero; 
         double suma;
         suma= 0;
         System.out.println("Introduzca la cantidad de numeros");
         cantNumeros = read.nextShort();
         for (int i=0; i<cantNumeros; i++) {
             System.out.println("introduzca el numero ["+i+"]:");
             numero =read.nextDouble();
             suma = suma +numero;
             
             
         }
         System.out.println("El resultado de la suma es:"+suma);
             
             
    }
}
