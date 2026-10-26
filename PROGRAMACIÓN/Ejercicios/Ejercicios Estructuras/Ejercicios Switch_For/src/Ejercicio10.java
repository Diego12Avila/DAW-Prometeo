import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("---MENU---");
        System.out.println("1. Flexiones");
        System.out.println("2. Abdominales");
        System.out.println("3. Sentadillas");
        System.out.println("Elige un ejercicio (1-3)");
        int ej = lector.nextInt();
        System.out.println("¿Cuantas repes?");
        int repes = lector.nextInt();

        switch (ej) {
            case 1: {
                for (int i = 1; i <= repes; i++) {
                    System.out.println("Repeticion " + i + " compeltada");
                }
                System.out.println("¡Ejercico completado! Has hecho " + repes + " felxiones");
                break;
            }
            case 2: {
                for (int i = 1; i <= repes; i++) {
                    System.out.println("Repeticion " + i + " compeltada");
                }
                System.out.println("¡Ejercico completado! Has hecho " + repes + " abdominales");
                break;
            }
            case 3: {
                for (int i = 1; i <= repes; i++) {
                    System.out.println("Repeticion " + i + " compeltada");
                }
                System.out.println("¡Ejercico completado! Has hecho " + repes + " sentadillas");
                break;
            }
            default:
                System.out.println("Elige una opcion válida");
        }
        lector.close();
    }
}

