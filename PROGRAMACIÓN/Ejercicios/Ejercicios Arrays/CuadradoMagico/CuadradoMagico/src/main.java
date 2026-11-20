/* Crea una aplicacion que permita al sistema generar una matriz 4x4 con numeros aleatorios
        Dicha matriz tendrá que ser magica
            los valores de cada columna, fila y matriz suman el mismo numero
        En caso de ser magico el cuadrado, se mostrará en pantalla, en caso de no serlo, el sistema deberá
        volvar a generar otro cuadrado */

public class main {
    public static void main(String[] args) {
        cuadradoMagico cuadradoMagico = new cuadradoMagico();

        int intento = 0;
        boolean encontrado = false;

        System.out.println("Buscando un cuadrado mágico de 4*4");

        while (!encontrado) {
            intento++;

            cuadradoMagico.generarAleatorio();

            if (cuadradoMagico.esMagico()) {
                encontrado = true;
            }
        }
        System.out.println("\n ¡Cuadrado mágico encontrado con éxito!");
        System.out.println("El cuadrado se ha encontrado en "+ intento + " intentos");

        System.out.println("El resultado es");
        cuadradoMagico.mostrar();
    }


}

