package Ejercicio6;

public class Entrada {
    public static void main(String[] args) {
        Estudiante estidante1 = new Estudiante("Alex", "1º DAM");
        Estudiante estidante2 = new Estudiante("Alex", "1º DAM", true);
        System.out.println("Estudainte 1: " + estidante1.nombre + " - " + estidante1.curso + "Matriculado: " + estidante1.matricula);
        System.out.println("Estudainte 2: " + estidante2.nombre + " - " + estidante2.curso + "Matriculado: " + estidante2.matricula);
    }
}