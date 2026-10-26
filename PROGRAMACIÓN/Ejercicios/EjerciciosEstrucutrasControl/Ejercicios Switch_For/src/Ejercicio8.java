import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = lector.nextInt();
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Numero de pares encontrados " + pares);
        System.out.println("Numero de impares encontrados " +impares);
        lector.close();
    }


}

