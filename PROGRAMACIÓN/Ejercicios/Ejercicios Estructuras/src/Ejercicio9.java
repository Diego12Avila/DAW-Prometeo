/*Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados (valores entre 0 y 20).
Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo
(valor entre 0.00 € y 5.00 €). También se podrá introducir el número de alumnos que realizaron la compra (valor entre 0 y 10).
Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno redondeada a 2 decimales.
(CosteBar)
 */


import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("Cuantos bocatas pides");
        int nBocatas = lector.nextInt();
        System.out.println("cuanto te cuesta cada bocata");
        double precioBocata = lector.nextDouble();
        System.out.println("Cuantas bebidas pides");
        int nBebidas = lector.nextInt();
        System.out.println("cuanto te cuesta cada bebida");
        double precioBebida = lector.nextDouble();
        System.out.println("Cuantos sois");
        int comensales = lector.nextInt();
        lector.close();
        double precioBocatasTotal = precioBocata*nBocatas;
        double precioBebidaTotal = precioBebida*nBebidas;
        double importeIndividual = (precioBebidaTotal+precioBebidaTotal)/comensales;
        System.out.println("ARTICULO\t\t\t\tCANTIDAD\t\t\t\tCOSTE\t\t\t\tTOTAL");
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t\t%.2f\t\t\t\t%.2f\n","Bebidas",nBebidas,precioBebida,precioBebidaTotal);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t\t%.2f\t\t\t\t%.2f\n","Bocatas",nBocatas,precioBocata,precioBocatasTotal);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t\t%.2f\t\t\t\t%.2f\n","Compra",nBocatas+nBebidas,0.0,precioBocatasTotal+precioBebidaTotal);
        System.out.printf("%s\t\t\t\t%d\t\t\t\t\t\t%d\t\t\t\t\t%.2f\n","P Unitario",comensales,comensales,importeIndividual);



    }
}
