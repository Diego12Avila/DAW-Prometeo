package EjerciciosIF.Ejercicio3;

import java.util.Scanner;

public class Entrada3 {
    public static void main(String[] args) {
        System.out.println("¿Que nota has sacado?");
        Scanner lector = new Scanner(System.in);
        double nota = lector.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota no es valida");
        } else if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota == 5) {
            System.out.println("Aprobado raspado");
        } else if (nota > 5 && nota < 8) {
            System.out.println("Enhorabuena, has aprobado");
        } else {
            System.out.println("Enhorabuena, buenisima nota");
        }
        lector.close();
    }
}

