

/*Lea dos números entre 0 y 9, ambos inclusive.
Compruébese (mostrándose verdadero o falso) las siguientes condiciones e indíquese cómo se evalúan:
a) El primero es par y el segundo impar
b) El primero es superior al doble del segundo e inferior a 8
c) Son iguales o la diferencia entre el primero y el segundo es menor que 2
*/


import java.util.Scanner;

public class Ejercico13 {
    public static void main(String[] args) {
        Scanner bd = new Scanner (System.in);
        System.out.println("Dime el Primer Entero");
        int numA = bd.nextInt();
        System.out.println("Dime el Segundo Entero");
        int numB = bd.nextInt();
        bd.close();
        boolean parImpar = numA%2==0 && numB%2==1;
        boolean segundaCondicion = numA>2*numB && numA<8;
        boolean terceraCondicion = numA==numB || numA-numB<=2 || numB-numA<=2;


        System.out.println("El primero es par y el segundo impar " +parImpar);
        System.out.println("El primero es superior al doble del segundo e inferior a 8 " +segundaCondicion);
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es menor que 2 "+terceraCondicion);
    }


}
