/**
 * Clase dedicada a la ejecucion del prgrama
.
 */

    // TODO. Realizar el metodo main
public class Entrada {
    // TODO. Definir una variable
    // definicion de un metodo
    /*
       el metodo main es la puerta
        de entrada del programa
     */
    // TODO. Realizar el metodo main
    // mod_acceso retorno nombre(argumentos) {
    // Ejecuciones del metodo
    //}

public static void main(String[] args){
    System.out.println("Mi primer programa.");
    System.out.println(98+" este numero es el mio ");
    // variable : guardar un dato y utilizarlo -> tipo nombre valor
    // segun el tipo de dato que tengo guardado: palabras-letras / numeros / boolean
    // segun el origen de dato que tengo guardado: primitivos / complejos
    // segun su posibilidad de cambiar el valor: mutables / no mutables (constante)
    // segun su scope : de clase o metodo

     final String DNI = "1234";
    String nombre = "Diego";
    nombre = "Diego A";
    String apellido1 = "Ávila";
    String apellido2 = "Guerrero";
    char letra =  'A';
    Character letraCompleta = 'B';
   // byte, short, long
    int edad = 31;
    Integer edadCompleta = edad;
    double altura = 1.68;
    float alturaFloat = 1.68f;
    boolean acierto = false;
    Object cosa = 1;


    
    // %s -> palabra
    // %d -> numero
    // %f -> numero con decimales

    System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años", nombre, apellido1, apellido2, edad);


}




}
