import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("---MENU---");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        Scanner lector = new Scanner(System.in);
        System.out.println("Elige una opcion");
        int opcion = lector.nextInt();

        switch (opcion){
            case 1 :
                System.out.println("Has elegido: Ver perfil");
                break;
            case 2 :
                System.out.println("Has elegido: Configuración");
                break;
            case 3 :
                System.out.println("Has elegido: Ayuda");
                break;
            case 4 :
                System.out.println("Has elegido: Salir");
                break;
            default:
                System.out.println("Elige una opcion de las anteriores.");
        }

    }
}
