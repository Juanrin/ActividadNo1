package co.edu.uniminuto;

import java.util.Scanner;
/**
 *
 * @author Camila Rincón
 */
public class ExerciseNo8 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor de la hora en pesos: ");
        double valorHora = scanner.nextDouble();

        double sueldo = horasTrabajadas * valorHora;

        System.out.println("El sueldo a pagar es: $" + sueldo);
    }
}
