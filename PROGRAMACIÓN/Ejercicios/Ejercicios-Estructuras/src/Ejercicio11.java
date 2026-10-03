/*Hágase una aplicación que lea un entero entre 0 y 100.
Compruébese (mostrándose verdadero o falso) las siguientes condiciones:
        a) Es par
        b) Es mayor que 50
        (CompararEntero)

 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        boolean esPar = true;
        boolean esMayor = true;
        Scanner entrada = new Scanner (System.in);
        System.out.println("dime un entero entre 0 y 100");
        int numeroUsuario = entrada.nextInt();
        if (numeroUsuario<=50) {
            esMayor=false;
        }
        if (numeroUsuario%2==1){
            esPar = false;
        }
        System.out.println("Tu numero es par? "+esPar);
        System.out.println("Tu numero es mayor que 50? "+esMayor);
        entrada.close();

    }
}
