package controler;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner lector =new Scanner(System.in);

        System.out.println("Operando 1");

        int operando1 = lector.nextInt();

        System.out.println("Operando 2");

        int operando2 = lector.nextInt();

        calculadora.sumar(operando1,operando2);
        System.out.println("el resultado de la suma es "+ calculadora.getResultado());

    }
}
