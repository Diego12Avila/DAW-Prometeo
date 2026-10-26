package EjerciciosIF.Ejercicio13;

import java.util.Scanner;

public class Entrada13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = lector.nextInt();
        System.out.println("¿Que dia de la semana es en numero?");
        int dia = lector.nextInt();
        String[] dias = {
                "Lunes", "Martes", "Miércoles", "Jueves",
                "Viernes", "Sábado", "Domingo"
        };


        boolean menor12 = edad < 12;
        boolean de12a17 = edad >= 12 && edad <= 17;
        boolean entre18y64 = edad >= 18 && edad <= 64;
        boolean mayor65 = edad >= 65;

        boolean esMartes = dia == 2;
        boolean esJueves = dia == 4;

        double precio;
        String motivo;
        if (menor12) {
            precio = 0;
            motivo = "Entrada gratuita";
        }   else if (de12a17 && esMartes) {
            precio = 0;
            motivo = "Entrada gratuita para jovenes los Martes";
        }   else if (de12a17) {
            precio = 5;
            motivo = "Tarifa estudiante";
        }   else if (entre18y64 && esJueves) {
            precio = 7;
            motivo = "Tarifa de los Jueves";
        }   else if (entre18y64) {
            precio = 10;
            motivo = "Tarifa general";
        }   else {
            precio = 6;
            motivo = "Tarifa para mayores de 65";
        }
        if (edad <0 || dia <1 || dia >7){
            System.out.println("Error; introduce los datos correctamente");
        }else {
            System.out.println("Edad: " + edad + " años");
            System.out.println("Día de la semana: " + dia
                    + " (" + dias[dia - 1] + ")");
            System.out.println("¿Eres menor de 12?: " + menor12);
            System.out.println("¿Tienes entre 12 y 17?: " + de12a17);
            System.out.println("¿Es martes?: " + esMartes);
            System.out.println("¿Tienes entre 18 y 64?: " + entre18y64);
            System.out.println("¿Es jueves?: " + esJueves);
            System.out.println("¿Tienes 65 años o más?: " + mayor65);
            System.out.println("Precio de entrada: " + precio
                    + "€ (" + motivo + ")");
        }

    }
}



