package EjerciciosIF.Ejercicio2;

import java.util.Scanner;

public class Entrada2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = lector.nextInt();

        if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            if (numero > 0) {
                System.out.println("El numero es positivo");
            }
        }
        lector.close();
    }
}
