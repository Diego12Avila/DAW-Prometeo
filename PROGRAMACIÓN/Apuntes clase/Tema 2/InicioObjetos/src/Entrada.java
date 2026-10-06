import model.Jugador;

public class Entrada {


    public static void main(String[] args) {
        System.out.println("Iniciando programa de juego");
        // jugadores -> nombre, nHabilidad, nVidas
        Jugador jugador1 = new Jugador("Jugador1", "clan1",10,100);
            // nombre=null, clan=null, estrella=false, vidas=0, habilidad=0
        Jugador jugador2 = new Jugador("Jugador2", "clan2",10,100);
            // nombre=null, clan=null, estrella=false, vidas=0, habilidad=0
        Jugador jugador3 = new Jugador("Jugador3","Clan3",10,100);
            // nombre=null, clan=null, estrella=false, vidas=0, habilidad=0
        Jugador jugador4 = new Jugador("Jugador4","Clan4",10,100);
         // nombre=null, clan=null, estrella=false, vidas=0, habilidad=0

        System.out.println("el clan del jugador 2 es "+jugador2.clan);

    }

}
