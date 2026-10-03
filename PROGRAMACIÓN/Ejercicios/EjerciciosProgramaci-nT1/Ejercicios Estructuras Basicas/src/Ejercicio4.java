/*
Crea un programa que simule la información de un libro
usando variables con nombres descriptivos.
Muestra toda la información del libro en la consola.

Ejemplo de salida por consola:

Título: Don Quijote de la Mancha
Autor: Miguel de Cervantes
Año de publicación: 1605
Número de páginas: 863
¿Disponible en biblioteca?: true
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        String titulo = "Los Juegos del Hambre";
        String autora = "Suzzane Collins";
        int anio = 2008;
        int tamanio = 400;
        boolean disp = true;
        System.out.println("Titulo: " +titulo);
        System.out.println("Escritora: " +autora);
        System.out.println("Año de publicación: " +anio);
        System.out.println("Número de páginas: " +tamanio);
        System.out.println("¿Esta disponible en biblioteca? " +disp);
    }
}
