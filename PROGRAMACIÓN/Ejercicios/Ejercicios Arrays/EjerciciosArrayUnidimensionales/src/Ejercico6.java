import java.util.Arrays;

public class Ejercico6 {
    public static void main(String[] args) {

        double[] listaNumero = {4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};
        System.out.println(Arrays.toString(listaNumero));
        double sumaTotal = 0;
        for (double item : listaNumero) {
            sumaTotal += item;
        }
        System.out.println(sumaTotal);
        double media = Arrays.stream(listaNumero).sequential().average().getAsDouble();
        System.out.println("El promedio es: " + media);
    }
}
