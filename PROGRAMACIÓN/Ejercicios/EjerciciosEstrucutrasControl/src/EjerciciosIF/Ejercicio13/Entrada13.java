package EjerciciosIF.Ejercicio13;

import java.util.Scanner;

public class Entrada13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = lector.nextInt();
        System.out.println("¿Que dia de la semana es en numero?");
        int dia = lector.nextInt();

        if (edad < 12) {
            int precio = 0;
        } else if (dia == 2 && edad <= 17) {
            int precio = 0;
        } else if (edad <= 17) {
            int precio = 5;
        } else if (dia == 4 && edad <= 64) {
            int precio = 7;
        } else if (edad <= 64){
            int precio = 10;
        }    else {
            int precio = 6;
        }
        // Ejercicio pendiente de terminar. 



    }
}