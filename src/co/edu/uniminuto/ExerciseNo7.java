package co.edu.uniminuto;

import java.util.Scanner;/**
 *
 * @author Camila Rincón
 */

public class ExerciseNo7 {
             /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int cubo = numero * numero * numero;

        System.out.println("El cubo de " + numero + " es: " + cubo);
    }
}
