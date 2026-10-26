import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int secreto = 7;
        int numero;
        int intento = 0;
        System.out.println("adivina un numero entre el 1 y el 100");
        do{
            System.out.println("introduce tu numero:");
            numero = lector.nextInt();
            intento ++;

            if (numero < secreto){
                System.out.println("El numero es mayor, intentalo de nuevo");
            } else if (numero > secreto) {
                System.out.println("El numero es menor, intentalo de nuevo");
            }
        } while (numero != secreto);
        System.out.println("¡Enhorabuena! Has adivinado el numero en " + intento + " intentos");
        lector.close();
    }
}
