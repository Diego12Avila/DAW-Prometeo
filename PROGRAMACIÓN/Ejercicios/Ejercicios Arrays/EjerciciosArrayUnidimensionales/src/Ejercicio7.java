import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] listaNumero = {15, 8, 23, 4, 19, 12};
        System.out.println(Arrays.toString(listaNumero));
        int nAlto = listaNumero[0], nBajo = listaNumero[0];
        for (int item : listaNumero) {
            if (item<nAlto){
                nAlto = item;
            }
            if (item>nBajo){
                nBajo = item;
            }
        }
        System.out.println("El numero mas alto es: " + nAlto);
        System.out.println("El numero mas bajo es: " + nBajo);
    }
}
