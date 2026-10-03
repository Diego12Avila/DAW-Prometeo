/*Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos
decimales). (Temperaturas)*/


import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double farenheit ;
        double centigrados ;
        double kelvin ;



        System.out.println("Dime los grados en Centigrados:");
        centigrados = entrada.nextDouble();
        System.out.println("Dime los grados en Farenheit:");
        farenheit = entrada.nextDouble();
        System.out.println("Dime los grados en Kelvin:");
        kelvin = entrada.nextDouble();
        double centigradosDESDEFarenheit = (5.0*(farenheit-32))/9;
        double farenheitDESDECentigrados = (9*centigrados/5)+32;

        double centigradosDESDEKelvin = kelvin-273.15;
        double kelvinDESDECentigrados = centigrados+273.15;

        double farenheitDESDEKelvin = (9*(kelvin-273.15)/5)+32;
        double kelvinDESDEFarenheit = 273.15+(5*(farenheit-32)/9);


        System.out.printf("Temperatura inicial en Centigrados = %.2f.\nTemperatura en Farenheit = %.2f, temperatura en Kelvin %.2f \n\n",centigrados,farenheitDESDECentigrados,kelvinDESDECentigrados);
        System.out.printf("Temperatura inicial en Farenheit = %.2f.\nTemperatura en Centigrados = %.2f, temperatura en Kelvin %.2f \n\n",farenheit,centigradosDESDEFarenheit,kelvinDESDEFarenheit);
        System.out.printf("Temperatura inicial en Kelvin = %.2f.\nTemperatura en Centigrados = %.2f, temperatura en Farenheit %.2f ",kelvin,centigradosDESDEKelvin,farenheitDESDEKelvin);

        entrada.close();
    }
}
