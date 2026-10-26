package EjerciciosIF.Ejercicio11;

import java.util.Scanner;

public class Entrada11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime el importe de la compra");
        double compra = lector.nextDouble();
        System.out.println("¿Eres socio? (true/false)");
        boolean socio = lector.nextBoolean();
        if (socio && compra >= 200) {
            double desc = compra * 0.2;
            System.out.println("Importe de la compra " + compra + "€");
            System.out.println("Eres socio y tu compra es >=200€");
            System.out.println("Descuento aplicado (20%)");
            System.out.println("Importe final " + (compra - desc) + "€");
        } else if (socio && compra < 200) {
            double desc = compra * 0.1;
            System.out.println("Importe de la compra " + compra + "€");
            System.out.println("Eres socio y tu compra es <200€");
            System.out.println("Descuento aplicado (10%)");
            System.out.println("Importe final " + (compra - desc) + "€");
        } else if (!socio && compra >= 300) {
            double desc = compra * 0.05;
            System.out.println("Importe de la compra " + compra + "€");
            System.out.println("No eres socio pero tu compra es >=300€");
            System.out.println("Descuento aplicado (5%)");
            System.out.println("Importe final " + (compra - desc) + "€");
        } else {
            System.out.println("Lo sentimos, no tienes descuento");
            System.out.println("Importe final " + compra + "€");
        }
    }
}
