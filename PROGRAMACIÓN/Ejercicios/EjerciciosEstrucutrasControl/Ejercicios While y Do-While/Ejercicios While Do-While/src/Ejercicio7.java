import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas calificaciones vas a introducir");
        int cantidad = lector.nextInt();

        double suma = 0;
        int i = 1;


        while (i <= cantidad) {
            System.out.println("Introduce la calificacion " + i + ":");
            double nota = lector.nextDouble();

            suma = suma + nota;
            i++;
        }
        if (cantidad > 0) {
            double promedio = suma /cantidad;
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio de calificaciones : " + promedio);
        } else {
            System.out.println("Debes introducir al menos una calificacion");
        }
        lector.close();
    }
}
