import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Cuantos estudiantes vas a guardar");
            int numeroEstudiantes = scanner.nextInt();
            int[] calificaciones = new int[numeroEstudiantes];

            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Introduce la calificacion del estudiante" + (i + 1));
                int calificacion = scanner.nextInt();
                calificaciones[i] = calificacion;
            }
            System.out.println(Arrays.toString(calificaciones));

            int totalCalificaciones = 0;

            int numeroAP = 0, nAlta = calificaciones[0], nBaja = calificaciones[0];

            for (int item : calificaciones) {
                totalCalificaciones += item;
                numeroAP = item >= 5 ? numeroAP + 1 : numeroAP;
                nAlta = item > nAlta ? item : nAlta;
                nBaja = item < nBaja ? item : nBaja;
            }
            double media = Arrays.stream(calificaciones).asDoubleStream().average().getAsDouble();
            System.out.println("El promedio es de : " + media );
            System.out.println("La nota mas alta es : " + nAlta);
            System.out.println("La nota mas baja es : " + nBaja);
            System.out.println("El numeo de aprobados es de : " +numeroAP + " personas");
        }
    }
}