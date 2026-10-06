package model;

public class Jugador {

    // representa el "molde" de lo que sera un jugador real
    // atributos que cualifican -> nombre, nVidas, nHabilidad,

    public String nombre, clan;

    public int vidas, habilidad;

    public boolean estrella;

    // constructor -> la manera en la que se inicia el jugador -> 1(de momento el vacio) a n
        //mod_acc (public) Jugador (tipo p1, tipo p2, tipo p3) {  }

    public Jugador (String nombreParametro, String clanParametro,
                   int vidasParametro, int habilidadParametro ) {

        nombre = nombreParametro;
        clan = clanParametro;
        vidas = vidasParametro;
        habilidad = habilidadParametro;

    }

    // metodos -> las funcionalidades del elemento cuando sea real
        //mod_acc (public/public/protected) retorno(void/int/double) nombre( param ) {  }



}
