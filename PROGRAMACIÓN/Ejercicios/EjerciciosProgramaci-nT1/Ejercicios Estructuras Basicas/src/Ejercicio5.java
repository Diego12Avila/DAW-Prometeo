/*
Crea un programa que use constantes para almacenar información que no debe cambiar
(como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar.
Muestra todos los valores.

Ejemplo de salida por consola:
Aplicación: MiApp
Versión: 1.0.0
Valor de PI: 3.14159
Usuario actual: Laura
Nivel: 1
Puntuación: 0
Usuario actualizado: Miguel
Nivel actualizado: 2
Puntuación actualizada: 150
*/

public class Ejercicio5 {
    public static void main(String[] args) {
    final String nameApp = "Ejercicio5";
    String version = "1.0.0";
    final double PI = 3.14159;
    String name = "Diego";
    int nivel = 1;
    int point = 0;
        System.out.println("Aplicación: " +nameApp);
        System.out.println("Versión: " +version);
        System.out.println("Valor de PI: " +PI);
        System.out.println("Usuario actual: " +name);
        System.out.println("nivel: " +nivel);
        System.out.println("Puntuación: " +point);

        name = "Sandra";
        nivel = 2;
        point = 150;

        System.out.println("Usuario actualizado: " +name);
        System.out.println("Nivel actualizado: " +nivel);
        System.out.println("Puntuación actualizada: " +point);
    }
}
