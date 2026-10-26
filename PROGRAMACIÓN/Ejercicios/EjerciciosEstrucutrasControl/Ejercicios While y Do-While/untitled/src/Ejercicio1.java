import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        int num = lector.nextInt();
        System.out.println("Contando con While");
        int i = 1;
        while (i<=num) {
            System.out.println(i);
            i++;
        }
        System.out.println("Fin del conteo ");
        lector.close();
        }
    }

