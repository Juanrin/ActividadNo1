
package co.edu.uniminuto;

import javax.swing.JOptionPane;

/**
 *
 * @author Camila Rincón
 */
public class ExerciseNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*
        DS: suma de n numeros -> double
        DE: canatidad de numeros y los numeros 
        */
         short cantNumeros;
         double numero; 
         double suma;
         suma= 0;
         JOptionPane.showMessageDialog(null, "Bienvenido");
         cantNumeros = Short.parseShort(JOptionPane.showInputDialog
        ("cantidad de Numeros"));
         for (int i=0; i<cantNumeros; i++) {
             System.out.println("introduzca el numero ["+i+"]:");
             numero = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Introduzca un numero"));
             suma = suma +numero;
              
               
    
         }
         JOptionPane.showMessageDialog(null, "El resultdo de la suma es:"+suma); }
         
         
}

    
