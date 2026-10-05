/*Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:

a) Son iguales

b) La primera es menor que la segunda *

c) Son distintas

(CompararCadenas)
*/

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("indica una frase");
        String frase1 = lector.nextLine();
        System.out.println("indica una frase");
        String frase2 = lector.nextLine();
        lector.close();
        boolean compararIguales = frase1.equals(frase2);
        boolean compararLong = frase1.length() < frase2.length();
        System.out.println("comparar iguales "+compararIguales);
        System.out.println("comparar longitud "+compararLong);
        System.out.println("comparar distintas "+!compararIguales);
        
    }

}
