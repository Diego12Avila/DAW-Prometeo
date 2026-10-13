package model;

public class Jugador {

    // representa el "molde" de lo que sera un jugador real
    // atributos que cualifican -> nombre, nVidas, nHabilidad,

    private String nombre, clan;

    private int vidas, habilidad;

    private boolean estrella;

    // constructor -> la manera en la que se inicia el jugador -> 1(de momento el vacio) a n
        //si creas más de 1 contructor -> SOBRECARGA
    //mod_acc (public) Jugador (tipo p1, tipo p2, tipo p3) { }
    public Jugador(){}

    public Jugador(String nombre, String clan, int vidas){
        this.nombre = nombre;
        this.clan = clan;
        this.vidas = vidas;
        habilidad = (int) (Math.random() * 101);

    }


    public Jugador (String nombre, String clan,
                   int vidas, int habilidad ) {

        this.nombre = nombre;
        this.clan = clan;
        this.vidas = vidas;
        this.habilidad = habilidad;
        estrella = true;
    }

    // metodos -> las funcionalidades del elemento cuando sea real
    //mod_acc (public/public/protected) retorno(void/int/double) nombre( param ) {  }

    public void saludar()
    {
        System.out.println("Hola, ni mobre es "+this.nombre);
        System.out.println("Tengo un cantidad de habilidad "+habilidad);
        System.out.printf("Tengo %d vidas\n",vidas);
    }

    public void lanzarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void recibirImpacto(){
        vidas--;
        System.out.printf("Mierda, me han dado, me quedan %d vidas\n",vidas);
    }

    public boolean estaMuerto(){
        System.out.println("Entro en el hospital, voy a comprobar si estoy muerto");
        return vidas <= 0;
    }

    // metodo getter -> aquel que da acceso a un elemento privado

    public String getNombre(){
        return this.nombre;
    }
    public String getClan(){
        return this.clan;
    }
    public int getVidas (){
        return this.vidas;
    }
    public int getHabilidad (){
        return this.habilidad;
    }
    public boolean isEstrella (){
        return estrella;
    }

    public void setNombre (String nombre){
        this.nombre=nombre;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}



