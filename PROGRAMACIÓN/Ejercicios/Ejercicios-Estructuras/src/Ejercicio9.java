/*
Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados (valores entre 0 y 20).
 Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00 €).
 También se podrá introducir el número de alumnos que realizaron la compra (valor entre 0 y 10).
 Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos)
 y la cantidad que debe pagar cada alumno redondeada a 2 decimales.
*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numBebida;
        int numBocadillo;
        int numAlumno;
        double precioBebida;
        double precioBocadillo;
        System.out.println("¿Cuantos soys para comer?");
        numAlumno = teclado.nextInt();
        System.out.println("¿Cuantas bebidas quereis?");
        numBebida = teclado.nextInt();
        System.out.println("¿A qué precio las ponemos?");
        precioBebida = teclado.nextDouble();
        System.out.println("¿Cuantos bocadillos quereis?");
        numBocadillo = teclado.nextInt();
        System.out.println("¿A qué precio los ponemos?");
        precioBocadillo = teclado.nextDouble();

        System.out.println("Pues nada, esta es la cuenta\n\n\n\n\n\n\n");



        System.out.println("                       "+"TICKET");
        System.out.println("=====================================================");
        System.out.printf("%-20s %-10s %-10s %10s\n","ARTICULO","CANTIDAD","PRECIO","COSTE");
        System.out.printf("%-20s %-10d %-10.2f %10.2f\n","Bebida",numBebida,precioBebida,numBebida*precioBebida);
        System.out.printf("%-20s %-10d %-10.2f %10.2f\n","Bocadillo",numBocadillo,precioBocadillo,numBocadillo*precioBocadillo);
        System.out.println("=====================================================");
        System.out.printf("%-20s  %10.2f\n","TOTAL",(numBebida*precioBebida)+(numBocadillo*precioBocadillo));
        System.out.printf("%-10s  %10.2f\n","Bebidas",(numBebida*precioBebida));
        System.out.printf("%-10s  %10.2f\n","Bocadillos",(numBocadillo*precioBocadillo));
        System.out.printf("%-20s %-10s %-10d %10.2f\n","A dividir","ENTRE",numAlumno,((numBebida*precioBebida)+(numBocadillo*precioBocadillo))/numAlumno);
        teclado.close();


    }
}

