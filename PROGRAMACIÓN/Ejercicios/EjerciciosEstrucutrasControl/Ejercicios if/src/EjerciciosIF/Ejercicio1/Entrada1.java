package EjerciciosIF.Ejercicio1;

import java.util.Scanner;

public class Entrada1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime cuantos años tienes");
        int edad = lector.nextInt();

        if (edad <= 18) {
            System.out.println("Eres mayor de edad, puedes votar");
        }
        lector.close();

    }
}
