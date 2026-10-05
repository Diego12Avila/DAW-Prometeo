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
        System.out.println("¿Cuanto dinero tienes?");
        double dinero = lector.nextDouble();
        System.out.println("cuanto IVA se aplica (%)");
        double iva = lector.nextDouble();
        System.out.println("Precio 1 articulo sin iva");
        



    }
}
