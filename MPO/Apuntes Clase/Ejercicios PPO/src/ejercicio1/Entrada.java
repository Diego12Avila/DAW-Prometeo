package ejercicio1;

public class Entrada {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Pepe", "Es341561416841",1.45, 1000);

        Cuenta c2 = new Cuenta();

        c1.setCliente("Juan");
        System.out.println(c1.getCliente());

    }
}
