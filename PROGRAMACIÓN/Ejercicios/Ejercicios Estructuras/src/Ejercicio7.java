/*Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .(Circunferencia)
NOTA El valor de PI se obtiene con Math.PI
 */


import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el valor del radio");
    double radio= lector.nextInt();
    lector.close();
    double longitud = 2*Math.PI*radio;
    double area = Math.PI * Math.pow(radio,2);

    System.out.printf("La longitud de la circunferencia es %.2f\n" ,longitud);
    System.out.printf("El area de la circunferencia es %.2f\n" ,area);




    }
}
