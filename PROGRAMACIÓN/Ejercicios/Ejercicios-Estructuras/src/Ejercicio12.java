/*Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:
 a) Son iguales
 b) La primera es menor que la segunda
 c) Son distintas
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        System.out.println("Dime la primera frase/palabra");
        String cad1 = keybd.nextLine();
        System.out.println("Dime la segunda frase/palabra");
        String cad2 = keybd.nextLine();
        keybd.close();
        String cad1MINUS = cad1.toLowerCase();
        String cad2MINUS = cad2.toLowerCase();

        boolean menorQue = cad1.length() < cad2.length();
        boolean iguales = cad1.equals(cad2); //compara los Strings tal cual
        boolean igualesReal = cad1.equalsIgnoreCase(cad2); //Compara los Strings ignorando las mayusculas
        boolean contiene = cad1MINUS.contains(cad2MINUS) || cad2MINUS.contains(cad1MINUS);

        System.out.println(menorQue);
        System.out.println(iguales);
        System.out.println(!iguales);//INVERTIMOS EL BOOLEAN PARA HACER LA OPCION C)
        System.out.println(igualesReal);
        System.out.println(contiene);

    }
}



