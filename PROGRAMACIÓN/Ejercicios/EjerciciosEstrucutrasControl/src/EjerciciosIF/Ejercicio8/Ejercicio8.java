package EjerciciosIF.Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = lector.nextInt();
        System.out.println("Dime un segundo numero");
        int num2 = lector.nextInt();
        if (num1 < num2) {
            System.out.printf("El numero %d es mayor que el numero %d\n", num2, num1);
        } else if (num1 == num2) {
            System.out.println("Ambos numeros son iguales");
        } else {
            System.out.printf("El numero %d es mayor que el numero %d\n", num1, num2);
        }
        lector.close();
    }
}
