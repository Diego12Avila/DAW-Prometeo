/*Lea dos números entre 0 y 9, ambos inclusive.
Compruébese (mostrándose verdadero o falso)
las siguientes condiciones e indíquese cómo se evalúan
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = lector.nextInt();
        System.out.println("Dime otro numero");
        int num2 = lector.nextInt();
        lector.close();
        boolean par= num1%2 == 0;
        boolean noPar = num2%2 != 0;
        System.out.println("el primer numero es par "+par);
        System.out.println("el segundo numero es inpar "+noPar);
        System.out.println("El primero es superior al doble del segundo e inferior a 8");
        boolean opB = num1 > (num2*2) && num1 <8;
        System.out.println("La opcion b es "+opB);
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es menor que 2");
        boolean opC = num1 == num2 || Math.abs(num1-num2) <2;
        System.out.println("La opcion c es "+opC);

    }
}
