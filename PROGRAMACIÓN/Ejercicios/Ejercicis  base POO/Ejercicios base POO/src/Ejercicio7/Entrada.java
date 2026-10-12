package Ejercicio7;

import java.security.spec.RSAOtherPrimeInfo;

public class Entrada {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        Rectangulo cuadrado = new Rectangulo(4.0);

        System.out.println("Rectangulo : " +  " base " +rectangulo.base+ " - " +" altura " +rectangulo.altura);

        System.out.println("Area del rectangulo : " + rectangulo.altura * rectangulo.base);

        System.out.println("Cuadrado : " + " base " +cuadrado.base + " - " + " altura " +cuadrado.altura );

        System.out.println("Area del cuadrado : " + cuadrado.altura * cuadrado.base);
    }
}
