import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String pass;

        do {
            System.out.println("Introduce la contraseña");
            pass = lector.nextLine();

            if(!pass.equals("1234")){
                System.out.println("Contraseña incorrecta, intentalo de nuevo");
            }
        } while (!pass.equals("1234"));{
            System.out.println("Contraseña correcta, acceso permitido");
        }
        lector.close();
    }
}
