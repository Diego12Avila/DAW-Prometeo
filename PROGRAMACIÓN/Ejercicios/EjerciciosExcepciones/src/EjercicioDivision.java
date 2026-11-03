import java.util.Scanner;

public class EjercicioDivision {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
       try {
           System.out.println("Dime un numero a dividir");
           int op1 = lector.nextInt();
           System.out.println("Dime el otro numero");
           int op2 = lector.nextInt();
           int resultado = op1 / op2;
           System.out.println("Resultado: " + (double) resultado);
       } catch (ArithmeticException e){
           System.out.println("Error No se puede dividir por 0");
       }
       lector.close();
    }
}
