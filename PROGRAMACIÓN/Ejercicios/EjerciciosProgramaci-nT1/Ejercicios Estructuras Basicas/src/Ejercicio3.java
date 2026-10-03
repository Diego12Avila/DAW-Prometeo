/*
Define cinco variables con diferentes tipos de datos
(String, int, boolean, double, char)
y muestra tanto su valor como su tipo.

Ejemplo de salida por consola:

Nombre: Carlos - Tipo: String
Edad: 30 - Tipo: int
¿Es estudiante?: true - Tipo: boolean
Altura: 1.75 - Tipo: double
Inicial: C - Tipo: char
*/

public class Ejercicio3 {

    public static void main(String[] args) {
     String name = "Sandra";
     int edad = 25;
     boolean acierto = true;
     double altura = 1.68;
     char inicial = 'S';
        System.out.println("Nombre: "+ name +" - Tipo: String ");
        System.out.println("Edad: " +edad +" - Tipo: int");
        System.out.println("¿Es inteligente?: " +acierto +" - Tipo: boolean");
        System.out.println("Estatura: " +altura +" - Tipo: double");
        System.out.println("Inicial: " +inicial +"  - Tipo: char") ;
    }
}
