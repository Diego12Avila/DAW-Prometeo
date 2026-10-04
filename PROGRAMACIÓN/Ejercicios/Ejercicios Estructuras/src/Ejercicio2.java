/*Programa que lee el nombre completo y la edad de una persona,
y muestra los datos leídos. (leerNombreEdad)
 */


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("Introduce tu nombre completo");
        String name = lector.nextLine();
    System.out.println("Introduce tu edad");
        int edad = lector.nextInt();
        lector.close();

        System.out.println("Tu nombre es " +name);
        System.out.println("Tienes " + edad + " años");


    }
}
