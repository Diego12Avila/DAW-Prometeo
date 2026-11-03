import java.util.Scanner;

public class EjercicioConversion {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean numeroValido = false;

        while ( !numeroValido){
            try {
                System.out.println("Introduce el numero entero : ");
                String num = lector.nextLine();
                int numero = Integer.parseInt(num);
                System.out.println("Has introducido :" + numero);
                numeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println(" Error: Eso no es un numero valido. Intentalo de nuevo");
            }
        }
        lector.close();
    }
}
