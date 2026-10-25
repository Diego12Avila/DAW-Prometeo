/*Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos
decimales). (Temperaturas)
*/


import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        final double FACTOR_CORRECTOR = 273.15;
        Scanner lector = new Scanner(System.in);
        System.out.println("indica el numero de grados Cº");
        double gradosC = lector.nextDouble();
        double gradosF = (9* gradosC) / 5.0+32;
        double gradosK = gradosC + FACTOR_CORRECTOR;
        System.out.printf("Vas a pasar %.2f C\n",gradosC);
        System.out.printf("Los grados en F son %.2f y en K son %.2f\n ",gradosF,gradosK);
        System.out.println("indica el numero de grados F");
        gradosF = lector.nextDouble();
        gradosC = 5*(gradosF-32)/9;
        gradosK = gradosC +FACTOR_CORRECTOR;
        System.out.printf("Vas a pasar %.2f C\n",gradosC);
        System.out.printf("Los grados en F son %.2f y en K son %.2f\n ",gradosF,gradosK);
        System.out.println("indica el numero de grados K");
        gradosK = lector.nextDouble();
        gradosF= 9*(gradosK-FACTOR_CORRECTOR)/5 +32;
        gradosC= gradosK -FACTOR_CORRECTOR;
        System.out.printf("Vas a pasar %.2f K\n",gradosC);
        System.out.printf("Los grados en C son %.2f y en F son %.2f\n ",gradosF,gradosK);
        lector.close();

    }
}
