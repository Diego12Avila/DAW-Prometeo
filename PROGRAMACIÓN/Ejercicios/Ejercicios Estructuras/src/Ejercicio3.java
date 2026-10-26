/*Hágase un programa que lea dos variables enteras
 y obtenga las siguientes operaciones
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner opera = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = opera.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = opera.nextInt();
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multi = numero1*numero2;
        int divi = numero1/numero2;
        int modulo = numero1%numero2;
        double diviReal = (double)numero1/numero2;
        double moduloReal =(double)numero1%numero2;

        System.out.println("la sumna de "+ numero1 +" y " + numero2 +" es " + suma);
        System.out.printf("la resta de %d y %d es %d\n", numero1,numero2,resta);
        System.out.printf("la multiplicacion de %d y %d es %d\n", numero1,numero2,multi);
        System.out.printf("la division de %d y %d es %d\n", numero1,numero2,divi);
        System.out.printf("el modulo de %d y %d es %d\n", numero1,numero2,modulo);
        System.out.printf("la division real de %d y %d es %.1f\n", numero1,numero2,diviReal);
        System.out.printf("el modulo real de %d y %d es %.1f\n", numero1,numero2,moduloReal);
        opera.close();




    }
}
