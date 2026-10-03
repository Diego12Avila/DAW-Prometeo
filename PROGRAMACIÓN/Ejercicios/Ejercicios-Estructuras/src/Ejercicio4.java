import java.util.Scanner;

/*Hágase una aplicación que permita comprobar si puedo comprarme una serie de artículos.
Para ello, el sistema pedirá por consola la cantidad de dinero en euros que tengo,
el IVA que se aplica en este momento y el precio de dos articulos (sin IVA). El sistema indicará:

- Si puedo comprar el primer artículo solo
- Si puedo comprar el segundo artículo solo
- Si puedo comprar ámbos artículos juntos
* */
public class Ejercicio4 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        double ahorros ;
        double precio1;
        double precio2;
        int iva;
        System.out.println("Dime cuantos ahorros tienes");
        ahorros = teclado.nextDouble();
        System.out.println("Cuanto vale el primer articulo?(sin iva)");
        precio1 = teclado.nextDouble();
        System.out.println("Cuanto vale el segundo artículo?(sin iva");
        precio2 = teclado.nextDouble();
        System.out.println("Qué IVA debemos aplicar?");
        iva = teclado.nextInt();

        if (((precio1+precio1*iva/100)+(precio2+precio2*iva/100))<ahorros){
            System.out.println("Has triunfao, compratelo todo");
        }
        if ( (precio1+precio1*iva/100)<ahorros && (precio2+precio2*iva/100)<ahorros &&   ((precio1+precio1*iva/100)+(precio2+precio2*iva/100))>ahorros ){
            System.out.println("Vas por buen camino, puedes comprar una de las dos cosas, pero no las dos.");
        }
        if ((precio1+precio1*iva/100)>ahorros || (precio2+precio2*iva/100)>ahorros ) {
            System.out.println("Estas en la mugre, colega");
        }




    }
}