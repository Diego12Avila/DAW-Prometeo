import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String [] animales = {"gato","perro","gato","pájaro","gato","pez","perro","gato","conejo","perro"};
            System.out.println(Arrays.toString(animales));
        System.out.println("introduce la palabra a buscar");
        String busqueda = scanner.next();
        int contador = 0;
        for (String item : animales) {
            if(item.equalsIgnoreCase(busqueda)){
                contador++;
            }
        }
        System.out.println("la palabra " + busqueda + " aparece " + contador + " veces en el array");

    }
}
