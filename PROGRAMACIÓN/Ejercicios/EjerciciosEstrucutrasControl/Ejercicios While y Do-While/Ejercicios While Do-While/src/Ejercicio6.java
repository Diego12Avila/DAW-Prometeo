import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = lector.nextInt();
        System.out.println("Cuenta atras");
        while (num  >=1) {
            System.out.println(num);
            num--;
        }
        System.out.println("¡Despegue!");

        lector.close();



    }
}
