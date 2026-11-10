import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {


        int[] lista = {23, 67, 45, 89, 12, 56, 78, 34, 90, 43};
        System.out.println(Arrays.toString(lista));
        int contador = 0;
        for (int item : lista) {
            if (item > 50) {
                contador++;
            }
        }
        System.out.println("Cantidad de numeros mayores que 50 : " + contador);
    }
}
