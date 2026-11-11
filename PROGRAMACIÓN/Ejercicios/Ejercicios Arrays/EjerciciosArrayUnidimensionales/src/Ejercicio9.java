import java.util.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] lista = {2, 4, 6, 8, 10, 12, 14};
        System.out.println(Arrays.toString(lista));
        for (int i = 0; i < lista.length / 2; i++) {
            int item = lista[i];
            lista[i] = lista[lista.length - 1 - i];
            lista[lista.length - 1 - i] = item;
        }
        System.out.println(Arrays.toString(lista));
    }
}
