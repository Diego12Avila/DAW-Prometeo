package EjerciciosIF.Ejercicio9;

import java.util.Scanner;

import static java.lang.Math.*;

public class Entrada9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime tu peso");
        int peso = lector.nextInt();
        System.out.println("Dime tu altuta en metros");
        double altura = lector.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        if (imc < 24.9 && imc > 18.5) {
            System.out.println("Estas en un peso normal");
        } else if (imc < 18.5) {
            System.out.println("Estas por debajo del peso normal");
        } else {
            System.out.println("estas por encima del peso normal");
        }
        lector.close();
    }
}
