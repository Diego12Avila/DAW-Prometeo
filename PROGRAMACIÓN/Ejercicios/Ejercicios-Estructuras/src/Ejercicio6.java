import java.util.Scanner;

/*Permítase introducir el valor con IVA de una compra con dos decimales
(la compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha compra (valor entero entre 0 y 25%).
¿Cuánto costó la compra sin IVA?¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales.
 */
public class Ejercicio6  {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el valor de la compra (entre 0.00 y 500.00) ");
        double valorCompra = input.nextDouble();
        System.out.println("Qué IVA le quieres aplicar? (entre 0 y 25%)");
        double iva = input.nextInt();
        double ivaCompra = valorCompra * (iva/100);
        iva = 1+(iva/100);
        double compraSinIva = valorCompra / iva ;
        System.out.println(ivaCompra);
        System.out.println(compraSinIva);
        System.out.println(ivaCompra+compraSinIva);



    }
}