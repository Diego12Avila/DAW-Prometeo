package EjerciciosIF.Ejercicio4;

import java.util.Scanner;

public class Entrada4 {
    public static void main(String[] args) {
        System.out.println("¿Cuanto te ha costado la compra?");
        Scanner lector = new Scanner(System.in);
        int compra = lector.nextInt();

        if (compra > 100) {

            System.out.println("Enhorabuena, tienes descuento");
            System.out.println("Precio original : " + compra+"€");
            double desc = compra * 0.10;
            System.out.println("Descuento aplicado : " + desc+"€");
            double precioF = compra - desc;
            System.out.println("Precio Final : " + precioF+"€" );
        }
        lector.close();
    }
}
