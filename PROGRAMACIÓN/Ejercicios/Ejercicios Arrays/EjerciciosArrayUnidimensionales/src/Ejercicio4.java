import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] numbers = {5, 12, 8, 3, 15, 9, 6};
        System.out.println("Array: " + Arrays.toString(numbers));

        System.out.println("introduce el numero a buscar");
        int busqueda = lector.nextInt();

        int posicion = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == busqueda) {
                posicion = i;
                break;
            }
        }
        if (posicion != -1) {
            System.out.println("El numero " + busqueda + " se encuentra en la posicion" + posicion);
        } else {
            System.out.println("El numero " + busqueda + " no se encuentra en el Array");
        }
        lector.close();


    }
}
