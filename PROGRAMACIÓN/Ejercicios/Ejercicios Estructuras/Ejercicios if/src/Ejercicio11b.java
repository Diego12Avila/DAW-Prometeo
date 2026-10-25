/*Hágase una aplicación que permita comprobar si puedo comprarme una serie de artículos.
Para ello, el sistema pedirá por consola la cantidad de dinero en euros que tengo, el IVA que se aplica en este momento
y el precio de dos articulos (sin IVA). El sistema indicará:

- Si puedo comprar el primer artículo solo
- Si puedo comprar el segundo artículo solo
- Si puedo comprar ámbos artículos juntos
*/

import java.util.Scanner;

public class Ejercicio11b {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuánto dinero tienes? ");
        double dinero = lector.nextDouble();

        System.out.println("¿Qué IVA se aplica (%): ");
        double iva = lector.nextDouble();

        System.out.println("Precio del primer artículo (sin IVA): ");
        double precio1 = lector.nextDouble();

        System.out.println("Precio del segundo artículo (sin IVA): ");
        double precio2 = lector.nextDouble();
        lector.close();

        double precioFinal1 = precio1 + (precio1 * iva / 100);
        double precioFinal2 = precio2 + (precio2 * iva / 100);

        boolean puedeComprar1 = dinero >= precioFinal1;
        boolean puedeComprar2 = dinero >= precioFinal2;
        boolean puedeComprarAmbos = dinero >= precioFinal1 + precioFinal2;

        System.out.println("¿Puedes comprar el primer artículo? " + puedeComprar1);
        System.out.println("¿Puedes comprar el segundo artículo? " + puedeComprar2);
        System.out.println("¿Puedes comprar ambos artículos? " + puedeComprarAmbos);
    }
}
