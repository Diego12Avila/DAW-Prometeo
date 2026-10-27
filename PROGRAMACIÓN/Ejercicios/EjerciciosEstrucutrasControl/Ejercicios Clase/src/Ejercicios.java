import java.util.Scanner;

public class Ejercicios {


    public void ejercicioAdivinacion() {
        Scanner lector = new Scanner(System.in);
        String respuesta;
        int record = Integer.MAX_VALUE;
        do {

            int aleatorio = (int) (Math.random() * 21); //0-20
            System.out.println(aleatorio);
            int numeroUsuario;
            int intento = 0;
            do {
                System.out.println("Dime el numero a adivinar");
                numeroUsuario = lector.nextInt();
                intento++;
            } while (aleatorio != numeroUsuario);

            System.out.println("Enhorabuena, numero correcto. Has hecho " + intento + " intentos");
            if (intento < record) {
                record = intento;
                System.out.println("Has superado el record, Nuevo record: " + record);
            }
            System.out.println("¿Jugar de nuevo? S/N");
            respuesta = lector.next().toLowerCase();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("Juego terminado");
        System.out.println("El record de la sesion es " + record + " intentos");

    }

    public void ejercicioBanco() {
        Cajero cajero = new Cajero();
        Scanner lector = new Scanner(System.in);
        int opcion;
        System.out.println("Saldo inicial: " + cajero.getSaldo() + "€");
        do {
            System.out.println("\n--MENU --");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir ");
            System.out.println("Elige una opcion ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Saldo inicial: " + cajero.getSaldo() + "€");
                case 2 -> {
                    System.out.println("¿Cuanto quieres retirar?");
                    int sacar = lector.nextInt();
                    if (sacar < 1 || cajero.getSaldo() < sacar) {
                        System.out.println("Fallo en el proceso");
                    } else {
                        cajero.retirarDinero(sacar);
                    }
                }
                case 3 -> {
                    System.out.println("¿Cuanto deseas ingresar?");
                    int ingreso = lector.nextInt();
                    if (ingreso < 1) {
                        System.out.println("Error al introducir el dinero");
                    } else {
                        cajero.ingresarDinero(ingreso);
                    }

                }
                case 4 -> System.out.println("Sesion cerrada");

            }
        } while (opcion != 4);


    }

    public void ejercicioDecimal() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero que quieres pasar");
        String numeroBase = lector.next(); //1101
        System.out.println("Indica la base en la que esta el numero (2,8,16)");
        int base = lector.nextInt(); // 2
        System.out.printf("Procedemos a sacar el numero %s en una base %d a decimal\n", numeroBase, base);
        int sumatorio = 0;
        for (int i = 0; i < numeroBase.length(); i++) {
            int posicion = numeroBase.length() - i - 1;
            char letra = numeroBase.charAt(i);
            int numero = Integer.parseInt(String.valueOf(letra));
            sumatorio += (int) (numero * Math.pow(base, posicion));
        }
        System.out.println("El numero en base 10 es " + sumatorio);
    }

    public void ejercicioNumerica() {

        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un numero en base decimal");
        int decimal = lector.nextInt();
        System.out.println("Dime a que base quieres pasar");
        int base = lector.nextInt();
        System.out.printf("Prodecemos a pasar el numero decimal %s a una base %d\n ", decimal, base);
        int original = decimal;

        int binario = 0;
        int posicion = 1;
        int copia = decimal;

        if (base == 2) {
            while (copia > 0) {
                int resto = copia % 2;
                binario = binario + resto * posicion;
                posicion = posicion * 10;
                copia = copia / 2;
            }
            System.out.println("Base 2 :" + binario);
        } else if (base == 8) {
            int octal = 0;
            posicion = 1;
            copia = decimal;

            while (copia > 0) {
                int resto = copia % 8;
                octal = octal + resto + posicion;
                posicion = posicion * 10;
                copia = copia / 8;
            }
            System.out.println("Base 8: " + octal);
        } else if (base == 16) {
            copia = decimal;
            String hexadecimal = "";
            String digitos = "0123456789ABCDEF";

            if (copia == 0) {
                hexadecimal = "0";
            }

            while (copia > 0) {
                int resto = copia % 16;
                hexadecimal = digitos.charAt(resto) + hexadecimal;
                copia = copia / 16;
            }

            System.out.println("Base 16: " + hexadecimal);
        }  else {
            System.out.println("introduce una base correcta");
        }
        lector.close();
    }

    public void ejercicoSueldos(){}
}
