/*Se introducen los 5 dígitos de un número
(decenas de mil, unidades de mil, centenas, decenas y unidades),
y se obtiene el número correspondiente. (Numero)
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("Indica dmillar");
        int dmillar = lector.nextInt() ;
        System.out.println("Indica umillar");
        int umillar = lector.nextInt() ;
        System.out.println("Indica centenas");
        int centenas = lector.nextInt() ;
        System.out.println("Indica decenas");
        int decenas = lector.nextInt() ;
        System.out.println("Indica unidades");
        int unidades = lector.nextInt();

        System.out.println("Numero introducido "+dmillar+umillar+centenas+decenas+unidades);
        System.out.println(dmillar+umillar+centenas+decenas+unidades); // me los suma
        System.out.println(""+dmillar+umillar+centenas+decenas+unidades); // asi lo concatena
        System.out.println("ahora indica un numero completo");
        int numeroUsuario = lector.nextInt(); // 56789
        dmillar = numeroUsuario/10000 ;
        umillar = (numeroUsuario%10000)/1000;
        centenas = ((numeroUsuario%10000)%1000)/100;
        decenas = ((numeroUsuario%10000)%1000)%100/10;
        unidades = ((numeroUsuario%10000)%1000)%100%10;
        lector.close();
    }
}
