import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuantos estudiantes hay en la clase?");
        int estudiantes = lector.nextInt();
        int nota1 = 0, nota2 = 0, nota3 = 0;
        int i = 1;

        while (i <= estudiantes) {
            System.out.println("introduce la nota del estudiante " + i + "(0-10)");
            int nota = lector.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota no valida. Introduce un valor de 0 a 10");
                continue;
            }
            switch (i) {
                case 1:
                    nota1 = nota;
                    break;
                case 2:
                    nota2 = nota;
                    break;
                case 3:
                    nota3 = nota;
                    break;
            }
            i++;
        }
        System.out.println("\n---REPORTE DE CALIFICACIONES---");
        for (int j =1; j<= estudiantes; j++){
            int nota = 0;

            switch (j) {
                case 1:
                    nota = nota1;
                    break;
                case 2:
                    nota = nota2;
                    break;
                case 3:
                    nota = nota3;
                    break;
            }

            System.out.print("Estudiante " + j + ": " + nota + " puntos = ");

            switch (nota) {
                case 9:
                case 10:
                    System.out.println("Calificación A");
                    break;
                case 7:
                case 8:
                    System.out.println("Calificación B");
                    break;
                case 5:
                case 6:
                    System.out.println("Calificación C");
                    break;
                case 3:
                case 4:
                    System.out.println("Calificación D");
                    break;
                case 0:
                case 1:
                case 2:
                    System.out.println("Calificación F");
                    break;
            }
            lector.close();
        }
    }
}
