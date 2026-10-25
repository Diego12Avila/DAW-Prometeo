import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime una letra de calificacion (A-F)");
        char nota = lector.next().charAt(0);
        switch (nota){
            case 'A' :
                System.out.println("Calificacion A: Excelente");
                break;
            case 'B' :
                System.out.println("Calificacion B: Muy bien");
                break;
            case 'C' :
                System.out.println("Calificacion C: Bien");
                break;
            case 'D' :
                System.out.println("Calificacion D: Suficiente");
                break;
            case 'F' :
                System.out.println("Calificacion F: Insuficiente");
                break;
            default:
                System.out.println("Calificacion no valida");
        }
        lector.close();
    }
}
