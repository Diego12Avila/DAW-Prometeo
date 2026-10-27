import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double saldo = 1000;
        int opcion;

        System.out.println("----CAJERO AUTOMATICO----");
        System.out.println("Saldo inicial : " + saldo + "€");
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Tus saldo actual es de " + saldo + "€");
                    break;
                case 2:
                    System.out.println("Cuanto deseas retirar");
                    double retirada = lector.nextDouble();

                    while (retirada > saldo || retirada <= 0) {
                        if (retirada > saldo) {
                            System.out.println("Fondos insuficientes, tu saldo es de " + saldo + "€");
                        } else {
                            System.out.println("la cantidad debe ser positiva");
                        }
                        System.out.println("Cuanto deseas retirar?");
                        retirada = lector.nextDouble();
                    }
                    saldo -= retirada;
                    System.out.println("Retiro exitoso. Has retirado " + retirada + "€");
                    System.out.println("Tu nuevo saldo es de " + saldo + "€");
                case 3:
                    double deposito;
                    System.out.println("Cuanto dinero quieres depositar");
                    deposito = lector.nextDouble();

                    while (deposito <= 0) {
                        System.out.println("La cantidad debe ser positiva");
                        System.out.println("Cuanto deseas depositar");
                        deposito = lector.nextDouble();
                    }
                    saldo += deposito;
                    System.out.println("Deposito exitoso. Has depositado: " + deposito + "€");
                    System.out.println("Nuevo saldo : " + saldo + "€");
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Operacion no valida. Intentalo de nuevo");

            }
        }while (opcion != 4) ;
        lector.close();
    }
}





