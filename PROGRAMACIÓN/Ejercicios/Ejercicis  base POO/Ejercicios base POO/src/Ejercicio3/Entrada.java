package Ejercicio3;

public class Entrada {
    public static void main(String[] args) {
        Libro libro1 =new Libro ("El principito", "Antonie de Saint Exupéry", 96);
        Libro libro2 =new Libro ();


        System.out.println("Libro 1: "+ libro1.titulo +" - " + libro1.autor + " - "+ libro1.paginas + " páginas ");
        System.out.println("Libro 2: "+ libro2.titulo +" - " + libro2.autor + " - "+ libro2.paginas + " páginas ");


    }
}
