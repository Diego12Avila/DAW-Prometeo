/*Hágase un programa que convierta segundos en horas,
minutos y segundos.(Segundos)*
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int segundos = entrada.nextInt();
        int minutos = segundos / 60;
        int restoSegundos = segundos%60;
        int horas = minutos / 60;
        int restoMinutos = minutos%60;
        System.out.println("Horas: "+ horas);
        System.out.println("Minutos: " +restoMinutos);
        System.out.println("Segundos: " +restoSegundos);
//SE PUEDE HACER SIN DECLARAR LA VARIABLE 'MINUTOS
    }

}
