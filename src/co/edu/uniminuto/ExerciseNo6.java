package co.edu.uniminuto;

import java.util.Scanner;
/**
 *
 * @author Camila Rincón
 */
public class ExerciseNo6 {
             /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        double cuadrado = numero * numero;

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
    }
}

