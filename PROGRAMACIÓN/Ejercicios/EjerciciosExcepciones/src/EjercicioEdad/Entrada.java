package EjercicioEdad;

import java.util.Scanner;

import static EjercicioEdad.EdadInvalidaException.validarEdad;

// Clase Principal del programa
public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        try {
            validarEdad(edad);
            System.out.println("Edad válida: " + edad + " años");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
