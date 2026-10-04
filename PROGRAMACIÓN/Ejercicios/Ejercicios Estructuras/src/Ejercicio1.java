
/*Crea un programa que declare constantes locales con tu nombre completo, dirección de casa (solo calle),
número del portal, piso, letra del piso, código postal, localidad, provincia y país.
Muestra por consola estos datos almacenados
en las constantes como si fuera la dirección para enviar una carta. (Direccion)
 */


public class Ejercicio1 {


    public static void main(String[] args) {

        String nombre = "Diego Ávila Guerrero";
        String dire = "Corralizas";
        int num = 14;
        char bloque = 'A';
        int piso = 3;
        String ciudad = "Madrid";
        String pais = "España";
        int codigoPostal = 28370;

        System.out.println(nombre);
        System.out.println("C/ "+ dire + " Nº"+num +", " +piso+bloque);
        System.out.println(codigoPostal +  ciudad);
        System.out.println(pais);


    }
}
