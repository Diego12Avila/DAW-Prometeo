package Ejercicio2;

public class Entrada {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Luna","gato ",3);
        Mascota mascota2 = new Mascota("Canelo","gato",7);

        System.out.println("Mascota1: "+mascota1.nombre +" - "+ mascota1.especie +" - "+mascota1.edad + " años" );
        System.out.println("Mascota2: "+mascota2.nombre +" - "+ mascota2.especie +" - "+mascota2.edad + " años");
    }
}
