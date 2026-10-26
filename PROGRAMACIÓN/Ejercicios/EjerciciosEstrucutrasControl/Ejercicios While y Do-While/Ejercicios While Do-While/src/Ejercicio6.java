import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num = lector.nextInt();

        while (num  >=1) {
            System.out.println(num);
            num--;
        }
        System.out.println("¡Despegue!");

        lector.close();



    }
}
