package EjercicioMultExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero ");
            double num1 = lector.nextDouble();
            System.out.println("Introduce el segundo numero");
            double num2 = lector.nextDouble();
            System.out.println("Introduce el tipo de operacion (+, -, *, /");
            String operacion = lector.next();
            double resultado = 0;
            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println("Resultado:"+ (int) resultado);
                    break;
                case "-":
                    resultado = num1 + num2;
                    resultado = num1 - num2;
                    System.out.println("Resultado:" + (int) resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println("Resultado:" +(int) resultado);
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero");
                    }
                    resultado = num1 / num2;
                    System.out.println("Resultado:" + resultado);
                    break;
                default:
                    System.out.println("Operacion no valida");
                    return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir numeros validos");
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato numerico incorrecto");
        } catch (ArithmeticException e ) {
            System.out.println("Error "+ e.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }
        lector.close();
    }
}
