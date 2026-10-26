import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(" --MENÚ--");
            System.out.println(" 1. Saludar");
            System.out.println(" 2. Despedirse");
            System.out.println(" 3. Ver hora");
            System.out.println(" 4. Salir");
            System.out.println("Elige una opcion");


            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¡Hola!");
                    break;
                case 2:
                    System.out.println("¡Adios!");
                    break;
                case 3:
                    System.out.println("La hora actual es 14:30");
                    break;
                case 4 :
                    System.out.println("Programa cerrado");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 4);

        lector.close();
    }
}
