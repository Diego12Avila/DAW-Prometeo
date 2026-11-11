import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBonoloto {
    // generar un carton de bonoloto -> 5 numeros entre el 1 - 100 sin que se puedan repetir
    // TODO -> pedir al usuario 5 numeros, que no sean repetidos
    // decidir cuantos he acertado -> coincide valor y posicion
    public static void main(String[] args) {
        int[] cartonBonoloto = new int[100];

        for (int i = 0; i < cartonBonoloto.length; i++) {
            int aleatorio;
            do {
                aleatorio = (int) (Math.random() * 105) + 1; // 5 posiciones 1-105 1,2,3,4,5
            } while (estaNumero(cartonBonoloto, aleatorio));
            cartonBonoloto[i] = aleatorio;
        }

        System.out.println(Arrays.toString(cartonBonoloto));

        int []cartonUsuario= new int[5];
        for (int i = 0; i < cartonUsuario.length; i++) {
            Scanner lector = new Scanner(System.in);
            int numeroUsuario = lector.nextInt();

            do {
                System.out.println("Indica el numero en posicion " +(i+1));
            } while (estaNumero(cartonUsuario, numeroUsuario) || numeroUsuario  <1 || numeroUsuario>10);
            cartonUsuario[i]=numeroUsuario;
        }
    }






    public static boolean estaNumero(int[] carton, int numero) {
        for (int item : carton) {
            if (item == numero) {
                System.out.println("Repetido");
                return true;
            }
        }
        return false;
    }

}

