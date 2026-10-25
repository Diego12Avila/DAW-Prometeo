package EjerciciosIF.Ejercicio14;

import java.util.Scanner;

public class Entrada14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Que edad tienes?");
        int edad = lector.nextInt();
        System.out.println("¿Cuales son tus ingresos?");
        int ingreso= lector.nextInt();
        System.out.println("¿Tienes deuda?");
        boolean deuda = !lector.nextBoolean();

         
         if (edad <21){
             System.out.println("Lo sentimos no podemos concederete un prestamo");
         } else if (edad <= 65 && ingreso >= 1000 && deuda) {
             boolean edadT = true;
             System.out.println("¿edad entre 21 y 65? : "+ edadT );
             boolean ingresoT= true;
             System.out.println("¿Ingresos >= 1000€ : " + ingresoT );
             System.out.println("¿Sin deudas pendientes?: "+ deuda);
             boolean elegible = true;
             System.out.println("¿Es elegible para el prestamo? : " + elegible);
             System.out.println("Enhorabuena, puedes solicitar un prestamo");
         }  else {
             System.out.println("Lo sentimos no podemos concederte un prestamo");
         }
        lector.close();
    }

}
