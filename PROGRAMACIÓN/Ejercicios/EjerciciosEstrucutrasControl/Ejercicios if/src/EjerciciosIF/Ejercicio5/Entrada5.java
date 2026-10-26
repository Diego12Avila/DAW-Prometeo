package EjerciciosIF.Ejercicio5;

import java.util.Scanner;

public class Entrada5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        int num = lector.nextInt();
        if (num %2 == 0) System.out.println("El numero es par");
        else {
            System.out.println("el numero es impar");
        }
        lector.close();
    }
}
