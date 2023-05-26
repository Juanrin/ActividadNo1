package co.edu.uniminuto;

import java.util.Scanner;
/**
 *
 * @author Camila Rincón
 */

public class ExerciseNo5{
          /**
     */
    public static final double IVA = 0.19;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        double iva = montoCompra * IVA;
        double montoSinIva = montoCompra - iva;
        double montoConIva = montoCompra + iva;

        System.out.println("Detalle de la compra:");
        System.out.println("Monto sin IVA: $" + montoSinIva);
        System.out.println("IVA: $" + iva);
        System.out.println("Monto con IVA: $" + montoConIva);
    }
}
