import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num ;
        int suma = 0;
        System.out.println("Introduce un numero (0 o negativo para terminar)");
        num = lector.nextInt();
        while (num >0){
            suma = suma + num;
            System.out.println("Suma acual " + suma);
            System.out.println("Introduce un numero (0 o negativo para terminar)");
            num = lector.nextInt();
        }
        System.out.println("Programa terminado, suma total " + suma);
        lector.close();
        }
    }

