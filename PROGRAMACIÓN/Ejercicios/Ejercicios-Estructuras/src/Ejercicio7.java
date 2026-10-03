/*Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2).
(Circunferencia) NOTA El valor de PI se obtiene con Math.PI
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Define el valor del radio de una circunferencia. \n(numeros enteros entre 0 y 100)");
        int radio = teclado.nextInt();
        double longitud = (double)radio*Math.PI*2;
        double area = Math.PI*(double)radio*radio;

        System.out.println("Radio= "+radio);
        System.out.println("Longitud= "+ longitud);
        System.out.println("Area " + area);

    }

}

