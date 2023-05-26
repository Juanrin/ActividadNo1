
package co.edu.uniminuto;
/**
 *
 * @author Camila Rincón
 */
public class ExerciseNo3
         /**
     * @param args the command line arguments
     */
{
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1 = 7; 
        int numero2 = 5;  
        int numero3 = 3;  
        
        //estos numeros pueden modificar 

        if (numero1 % 2 == 0 && numero2 % 2 == 0 && numero3 % 2 == 0) {
            int suma = numero1 + numero2 + numero3;
            System.out.println("La suma de los tres números pares es: " + suma);
        } else {
            int resta = numero1 - numero2 - numero3;
            System.out.println("La resta de los tres números es: " + resta);
        }
    }
}

