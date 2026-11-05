package EjercicioArray;

import java.util.Arrays;
import java.util.Scanner;

public class EjArray {
    public static void main(String[] args) {

        int[] lista = {10, 20, 30, 40, 50};
        boolean posicionValida = false;
        Scanner lector = new Scanner(System.in);
        System.out.println("Array : " + Arrays.toString(lista));
        while (!posicionValida) {
            System.out.println("Introduce una posicion");
            try {
                int posicion = lector.nextInt();
                System.out.println("Elemento en posición " + posicion + " pertenece al numero: " + lista[posicion]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error, posición fuera de la array");
            }
        }
        lector.close();
    }
}
