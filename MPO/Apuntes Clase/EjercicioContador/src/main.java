import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        Scanner lector =new Scanner(System.in);

        Contador c1 =new Contador();

        System.out.println("Introduzca el valor para inicializa el contador");

        n= lector.nextInt();

        c1.setCont(n);

        c1.incrementar();;

        System.out.println(c1.getCont());

        c1.decementar();

        System.out.println(c1.getCont());

        Contador c2 = new Contador(10);

        c2.incrementar();
        System.out.println(c2.getCont());
        c2.decementar();
        System.out.println(c2.getCont());



    }
}
