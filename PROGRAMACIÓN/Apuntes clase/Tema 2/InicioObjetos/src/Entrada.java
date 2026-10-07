import model.Jugador;

public class Entrada {


    public static void main(String[] args) {
        System.out.println("Iniciando programa de juego");
        // jugadores -> nombre, nHabilidad, nVidas
        Jugador jugador1 = new Jugador("Jugador1", "clan1",10,100);

            // nombre=null, clan=clan1, estrella=false, vidas=0, habilidad=0
        Jugador jugador2 = new Jugador("Jugador2", "clan2",10,100);
            // nombre=null, clan=clan2, estrella=false, vidas=0, habilidad=0
        Jugador jugador3 = new Jugador("Jugador3","Clan3",10,100);

            // nombre=null, clan=clan3, estrella=false, vidas=0, habilidad=0
        Jugador jugador4 = new Jugador("Jugador4","Clan4",10,100);
         // nombre=null, clan=clan4, estrella=false, vidas=0, habilidad=0
        Jugador jugador6 = new Jugador("jugador6 ", "clan6 ",8);

        jugador1.saludar();
        jugador1.saludar();
        System.out.println("El jugador 1 esta muerto "+jugador1.estaMuerto());; // true o false
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        jugador1.recibirImpacto();
        System.out.println("El jugador 1 esta muerto "+jugador1.estaMuerto());; // true o false
        jugador1.recibirImpacto();
        System.out.println("El jugador 1 esta muerto "+jugador1.estaMuerto());; // true o false
        jugador1.saludar();
        jugador2.recibirImpacto();

        // jugador1.lanzarMensaje("Este juego lo voy a ganar");

        // jugador2.lanzarMensaje("Ni de coña, lo gano yo");
        // jugador2.saludar();
        // jugador3.saludar();
        // jugador5.saludar();

        // nombre=Lucas, clan=clan4, estrella=false, vidas=8, habilidad=0

        // nombre=null, clan=null, estrella=false, vidas=0, habilidad=0

        // System.out.println("Es estrella el jugador 1 es " +jugador1.estrella);

    }

}
