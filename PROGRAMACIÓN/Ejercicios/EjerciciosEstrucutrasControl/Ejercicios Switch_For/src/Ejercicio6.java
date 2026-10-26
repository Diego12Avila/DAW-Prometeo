import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un numero para saber su tabla");
        int numero = lector.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        lector.close();
    }
}
