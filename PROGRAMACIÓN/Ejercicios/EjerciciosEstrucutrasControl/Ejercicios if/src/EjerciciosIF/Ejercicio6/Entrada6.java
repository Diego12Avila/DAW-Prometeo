package EjerciciosIF.Ejercicio6;

import java.util.Scanner;

public class Entrada6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = lector.nextInt();
        if (edad >=16 ){
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado, debes tener al menos 16 años");
        }
        lector.close();
    }
}
