package model;

public class Entrada {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana",20);
        Persona persona2 = new Persona();

        System.out.println("Nombre: " +persona1.nombre);
        System.out.println("Edad: " +persona1.edad);


    }
}
