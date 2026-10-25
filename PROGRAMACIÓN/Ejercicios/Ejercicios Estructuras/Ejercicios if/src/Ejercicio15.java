
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numero = lector.nextInt();


        numero += 5;
        System.out.println("Después de sumar 5: " + numero);


        numero -= 3;
        System.out.println("Después de restar 3: " + numero);


        numero *= 10;
        System.out.println("Después de multiplicar por 10: " + numero);

        numero /= 2;
        System.out.println("Después de dividir por 2: " + numero);

        lector.close();
    }
}
