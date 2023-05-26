package co.edu.uniminuto;

import java.util.Scanner;
/**
 *
 * @author Camila Rincón
 */

public class ExerciseNo9 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero: ");
        double cantidadDinero = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de días generando interés: ");
        int diasGenerandoInteres = scanner.nextInt();

        System.out.print("Ingrese el interés diario (%): ");
        double interesDiario = scanner.nextDouble();

        double interes = cantidadDinero * (interesDiario / 100) * diasGenerandoInteres;
        double total = cantidadDinero + interes;

        System.out.println("El interés a pagar es: $" + interes);
        System.out.println("El total a pagar es: $" + total);
    }
}
