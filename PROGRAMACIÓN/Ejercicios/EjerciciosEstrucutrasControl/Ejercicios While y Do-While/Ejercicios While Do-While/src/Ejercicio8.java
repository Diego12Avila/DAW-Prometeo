import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;

        do {
            System.out.println("Introduce tu edad");
            edad = lector.nextInt();

            if (edad <0 || edad >120);
            System.out.println("Edad no valida, Debe estar entre 0 y 120");
        }
        while (edad <0 || edad >120);

        System.out.println("Edad valida " + edad + " años. Gracias");
        lector.close();
    }
}
