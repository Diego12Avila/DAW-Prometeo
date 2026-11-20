import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class cuadradoMagico {

    private int[][] matriz;
    private Random random;

    public cuadradoMagico() {
        matriz = new int[4][4];
        random = new Random();
    }

    public void generarAleatorio() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }
    }

    public boolean esMagico() {
        int sumaRef = 0;
        for (int j = 0; j < 4; j++) {
            sumaRef += matriz[0][j];
        }
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 4; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaRef)
                return false;
        }
        for (int j = 0; j < 4; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaRef)
                return false;
        }
        int diagonal1 = 0;
        for (int i = 0; i < 4; i++) {
            diagonal1 += matriz[i][i];
        }
        if (diagonal1 != sumaRef)
            return false;
        int diagonal2 = 0;
        for (int i = 0; i < 4; i++) {
            diagonal2 += matriz[i][3 - i];
        }
        if (diagonal2 != sumaRef)
            return false;
        return true;
    }

    public void mostrar() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}



