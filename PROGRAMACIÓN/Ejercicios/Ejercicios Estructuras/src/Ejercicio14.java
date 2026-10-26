/*
Hágase una aplicación que permita introducir la edad de una persona (valores enteros entre 0 y 100),
su nivel de estudios (valores entre 0 y 10) y sus ingresos (valores enteros entre 0 y 25000).
Compruébese (mostrándose verdadero o falso) si dicha persona tiene más de 40 años,
un nivel de estudios entre 5 y 8, ambos incluisives, y gana menos de 15000 €.
(CondicionLogica)
 */


import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Dime tu edad");
        int edad = lector.nextInt();

        System.out.println("¿Que nota tienes");
        int nota = lector.nextInt();

        System.out.println("¿Cuales son tus ingresos?");
        int dinero = lector.nextInt();

        lector.close();

        boolean mas40 = edad > 40 && nota >=5 && nota <=8 &&  dinero < 1500;
        System.out.println("Mas de 40 años y estudios entre 5-8 y gana menos de 1500: " +mas40  );






    }
}
