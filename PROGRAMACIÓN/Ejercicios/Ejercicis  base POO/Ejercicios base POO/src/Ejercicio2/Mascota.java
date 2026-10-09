package Ejercicio2;

import com.sun.management.UnixOperatingSystemMXBean;

public class Mascota {

    public String nombre, especie;
    public int edad;

    public Mascota (){}

    public Mascota(String nombre, String especie, int edad)
    {
        this.nombre=nombre;
        this.especie=especie;
        this.edad=edad;

    }

}
