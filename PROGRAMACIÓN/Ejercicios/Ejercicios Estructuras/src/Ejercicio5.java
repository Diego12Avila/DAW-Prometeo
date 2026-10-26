/*Hágase un programa que convierta segundos en horas,
minutos y segundos.(Segundos)
 */


import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner cont = new Scanner(System.in);
        System.out.println("Que cantidad de segundos pasamos a h:m:s");
        int segundosSistema = cont.nextInt(); //25678s
        //1h -> 3600s
        //1h -> 60 m
        //1m -> 60s
        cont.close();
        int horas = segundosSistema/3600; //7.1333
        int segundosRestantes = segundosSistema%3600; // 478
        System.out.println("Horas "+horas);
        int minutos = segundosRestantes/60; // 7.922222;
        System.out.println("Minutos "+minutos);
        int segundos = segundosRestantes%60;
        System.out.println("Segundos "+segundos);
        System.out.printf("%d:%d:%d",horas,minutos,segundos);

    }
}
