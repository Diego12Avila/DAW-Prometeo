/*Permítase introducir el valor con IVA de una compra con dos decimales
(la compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA
 de dicha compra (valor entero entre 0 y 25%).
 ¿Cuánto costó la compra sin IVA?¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
     double compra = lector.nextDouble();
        System.out.println("Indica que IVA se aplica a la comrpa");
        int iva = lector.nextInt();
        double costeIva = compra * (iva/100.0);
        double costeSinIva = compra-costeIva;
        System.out.printf("La compra han sido %.2f\n",compra);
        System.out.printf("La compra sin iva han sido %.2f\n",costeSinIva);
        System.out.printf("El coste del IVA ha sido %.2f\n",costeIva);
    }
}
