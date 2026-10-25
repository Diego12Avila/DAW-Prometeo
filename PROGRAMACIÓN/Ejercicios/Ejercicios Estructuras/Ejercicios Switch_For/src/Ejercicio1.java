import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime el dia de la semana en numero");
        int dia = lector.nextInt();

            switch (dia){
                case 1 :
                    System.out.println(" El dia 1 es: Lunes");;
                    break;
                case 2 :
                    System.out.println("El dia 2 es: Martes");
                    break;
                case 3 :
                    System.out.println("El dia 3 es: Miercoles");
                    break;
                case 4 :
                    System.out.println("El dia 4 es: Jueves");
                    break;
                case 5 :
                    System.out.println("El dia 5 es: Viernes");
                    break;
                case 6 :
                    System.out.println("El dia 6 es: Sabado");
                    break;
                case 7 :
                    System.out.println("El dia 7 es: Domingo");
                    break;
                default:
                    System.out.println("Dia no valido");
            }

        }

    }

