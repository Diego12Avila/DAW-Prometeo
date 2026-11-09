import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Introduce el nombre " + (i + 1) + ": ");
            names[i] = lector.nextLine();
        }
        System.out.println("\nNombres introducidos");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        lector.close();
    }
}
