import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = lector.nextInt();
        int suma = 0;


        for (int i = 1; i<= num; i++ ){
            suma = suma + i;
        }
        System.out.println("la suma total es: " + suma);


    }
}
