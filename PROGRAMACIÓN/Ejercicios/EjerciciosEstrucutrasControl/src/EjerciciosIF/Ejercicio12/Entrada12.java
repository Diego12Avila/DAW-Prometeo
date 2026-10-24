package EjerciciosIF.Ejercicio12;

import java.util.Scanner;

public class Entrada12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica la contraseña a validar");
        String pass = lector.next();
        System.out.println("Procedemos a validar la pass");
        boolean longitudValida = pass.length() >= 8;
        boolean contenidoValido = !pass.equalsIgnoreCase("12345678") && !pass.equalsIgnoreCase("password");
        int contador = 0;

        for (int i = 0; i < pass.length(); i++) {

            if (Character.isDigit(pass.charAt(i))){
                contador++;
            }
        }
        boolean numeroValida= contador>=1;
        boolean valida = numeroValida && contenidoValido && longitudValida;
        if(valida){
            System.out.println("La pass cumple todos los requisitos");
        }else{
            System.out.println("La pass es invalida");
        }
        lector.close();
    }
}