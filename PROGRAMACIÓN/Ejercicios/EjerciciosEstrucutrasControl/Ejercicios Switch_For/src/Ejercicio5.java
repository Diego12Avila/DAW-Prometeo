import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Dime el numero del mes (1-12)");
        Scanner lector = new Scanner(System.in);
        int mes = lector.nextInt();

        switch(mes){
            case 1, 12, 2 :
                System.out.printf("El mes %d corresponde al Invierno", mes);
                break;
            case 3, 4, 5 :
                System.out.printf("El mes %d corresponde a la Primavera", mes);
                break;
            case 6, 7 ,8:
                System.out.printf("El mes %d corresponde al Verano", mes);
                break;
            case 9, 10, 11:
                System.out.printf("el mes %d corresponde al Otoño");
            default:
                System.out.println("Introduce un numero de mes correcto");
                break;
        }
        lector.close();
    }
}
