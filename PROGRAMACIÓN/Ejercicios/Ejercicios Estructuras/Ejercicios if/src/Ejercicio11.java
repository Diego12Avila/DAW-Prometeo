/*Hágase una aplicación que lea un entero entre 0 y 100.
Compruébese (mostrándose verdadero o falso)
las siguientes condiciones:
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("indica el numero a evaluar");
        int numero = lector.nextInt();
        boolean par = numero%2 == 0;
        boolean esMayor= numero>50;
        System.out.println("Es par "+par);
        System.out.println("es mayor que 50 "+esMayor);

    }
}
