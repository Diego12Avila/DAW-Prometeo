/*Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€.
El camarero les pregunta cuántas bebidas y bocadillos quieren.
Calcula el coste de la consumición, mostrando primero el coste de las bebidas
y de los bocadillos. (Bar)
 */


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double bebida = 1.25;
        final double  bocata = 2.05;
        System.out.println("¿Cuantas bebidas quieren?");
        int numBebida= lector.nextInt();
        System.out.println("¿Cuantas bocatas quieren");
       int numBocata = lector.nextInt();
       lector.close();
       double costeBebidas = bebida*numBebida;
       double costeBocata= bocata*numBocata;
       double costeTotal= costeBebidas+costeBocata;
        System.out.printf("El coste de las bebidas es de %.2f\n",costeBebidas);
        System.out.printf("El coste de los bocatas es de %.2f\n",costeBocata);
        System.out.printf("El coste total es de %.2f\n",costeTotal);




    }
}
