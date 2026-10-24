package EjerciciosIF.Ejercicio10;

import java.util.Scanner;

public class Entrada10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime tu altra en cm");
        int altura = lector.nextInt();
        if (altura < 120){
            System.out.println("No puedes subir a la atraccion, altura minima : 120cm");
        } else if (altura >200) {
            System.out.println("No puedes subir a la atraccion, altura maxima : 200 cm");
        } else {
            System.out.println("Adelante, puedes subir");
        }
        lector.close();
    }
}
