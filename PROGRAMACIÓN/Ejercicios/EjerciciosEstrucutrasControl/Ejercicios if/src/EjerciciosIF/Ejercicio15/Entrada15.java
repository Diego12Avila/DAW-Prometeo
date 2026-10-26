package EjerciciosIF.Ejercicio15;

import java.util.Scanner;

public class Entrada15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuanto pesa el paquete(kg)?");
        int peso = lector.nextInt();
        System.out.println("¿A que distancia lo envias (km)?");
        int km = lector.nextInt();
        System.out.println("¿El envio es urgnete?");
        boolean urgente = lector.nextBoolean();
        double precioBase = 5;
        double costePeso =0;
        double costeDistancia=0;

        if (peso >5){
            costePeso = ((peso - 5) *2);
        }
        if (km >100) {
            costeDistancia = 10;
        }
        double subTotal = precioBase + costePeso + costeDistancia;
        double recargoUrgencia = 0;
        double total = subTotal;


        if (urgente){
            recargoUrgencia = subTotal *0.5;
            total = subTotal *1.5;
        }
        System.out.println("\nPrecio base : " + precioBase + " € ");
        if (peso>5){
            System.out.println("Peso :" + peso +"Kg (excede 5Kg en) " + ((peso - 5) )+" Kg");
        } else {
        System.out.println("Peso: " + peso + "kg (no excede 5kg)");}
        System.out.println("Coste adicional por peso: "
                + costePeso + "€");

        if (km  > 100) {
            System.out.println("Distancia: " + km
                    + "km (mayor de 100km)");
        } else {
            System.out.println("Distancia: " + km
                    + "km (no supera 100km)");
        }

        System.out.println("Coste adicional por distancia: "
                + costeDistancia + "€");

        System.out.println("Subtotal: " + subTotal + "€");
        System.out.println("¿Es envío urgente?: " + urgente);

        if (urgente) {
            System.out.println("Recargo por urgencia (x1.5): "
                    + recargoUrgencia + "€");
        } else {
            System.out.println("Recargo por urgencia: 0.0€");
        }

        System.out.println("Coste total de envío: " + total + "€");
        lector.close();
    }


}
