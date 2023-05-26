package co.edu.uniminuto;

import java.util.Scanner;
/**
 *
 * @author Camila Rincón
 */
public class ExerciseNo4 {
    
           /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = 0;

        if (numero2 != 0) {
            division = numero1 / numero2;
        }

        System.out.println("Operaciones con " + numero1 + " y " + numero2 + ":");
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);

        if (numero2 != 0) {
            System.out.println("División: " + numero1 + " / " + numero2 + " = " + division);
        } else {
            System.out.println("No se puede realizar la división entre cero.");
        }
    }
}
