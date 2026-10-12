package Ejercicio5;

public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Toyta", "Corolla");
        Coche coche3 = new Coche("Seat", "ibiza", 2020);

        System.out.println("Coche 1 : "+ coche1.marca + " - " +coche1.modelo +" - "+ coche1.anio);
        System.out.println("Coche 2 : "+ coche2.marca + " - " +coche2.modelo +" - "+ coche2.anio);
        System.out.println("Coche 1 : "+ coche3.marca + " - " +coche3.modelo +" - "+ coche3.anio);


    }
}
