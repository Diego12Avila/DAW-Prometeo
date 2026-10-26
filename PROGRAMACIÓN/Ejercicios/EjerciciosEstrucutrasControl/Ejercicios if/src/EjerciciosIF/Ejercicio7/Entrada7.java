package EjerciciosIF.Ejercicio7;

import java.util.Scanner;

public class Entrada7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime una nota entre 0 y 10");
        int nota = lector.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("La nota no es valida");
        } else if (nota <= 4) {
            System.out.println("Suspenso");
        } else if (nota <= 6) {
            System.out.println("Aprobado");
        } else if (nota <=8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
        lector.close();
    }
}
