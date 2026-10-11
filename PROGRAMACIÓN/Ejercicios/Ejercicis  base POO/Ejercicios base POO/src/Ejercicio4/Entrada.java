package Ejercicio4;

public class Entrada {
    public static void main(String[] args) {
        Producto producto1 =new Producto ("Cuaderno");
        Producto producto2 =new Producto ("Mochila",25.5);

        System.out.println("Producto 1 "+ producto1.nombre + " - " +producto1.precio + "€");
        System.out.println("Producto 2 "+ producto2.nombre + " - " +producto2.precio + "€");


    }
}
