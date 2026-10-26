import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime un numero");
        int operando1 = lector.nextInt();
        System.out.println("Dime un segundo numero");
        int operando2 = lector.nextInt();
        System.out.println("Introduce la operacion que quires hacer");
        String operador =  lector.next();

        int i;


        switch (operador){
            case "+" :
                 i = operando1 + operando2;
                System.out.printf("el resultado de %d + %d es %d\n",operando1, operando2, i);
                break;
            case "-" :
                 i = operando1 - operando2;
                System.out.printf("el resultado de %d - %d es %d\n",operando1, operando2, i);
                break;
            case "*" :
                i = operando1 * operando2;
                System.out.printf("el resultado de %d * %d es %d\n",operando1, operando2, i);
                break;
            case "/" :
                i= operando1 / operando2;
                System.out.printf("el resultado de %d / %d es %d\n",operando1, operando2, i);
                break;
            default:
                System.out.println("Introduce operando correcto");
                break;
        }
        lector.close();
    }
}
