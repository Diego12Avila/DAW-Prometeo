package Ejercicio6;

public class Estudiante {

    String nombre, curso;
    boolean matricula;

    public Estudiante(String nombre, String curso)
    {
        this.nombre=nombre;
        this.curso=curso;
        this.matricula=false;
    }

    public Estudiante(){}

    public Estudiante(String nombre, String curso, boolean matricula)
    {
     this.nombre=nombre;
     this.curso=curso;
     this.matricula=matricula;
    }



}
