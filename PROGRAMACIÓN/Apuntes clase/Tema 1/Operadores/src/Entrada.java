import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Programa para explicar los operadores");
        // scanner permite realizar lecutras por teclado
        Scanner lector =new Scanner(System.in);
        System.out.println("Indicame tu nombre");
        // depende del tipo de dato que quieras leer, la variable lector tiene metodos para ello
        String nombre = lector.nextLine();
        System.out.println("En que ciclo te has matriculado");
        String ciclo = lector.nextLine();
        System.out.println("Que nota quieres sacar de media en "+ciclo);
        double media = lector.nextDouble();
        System.out.println("Nombre: "+nombre);
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Media: "+media);

        // Aritmeticos -> operaciones + - / * (cuidado con la suma de dos string)
        int operador1 = 5;
        int operador2 = 2;
        int suma = operador1+operador2;
        int resta = operador1-operador2;
        int multiplicacion = operador1*operador2;
        double division = (double) operador1/operador2;
        // % el resto de la division de dos numeros
        int resto = 5%2; // par // segundos entran en N minutos
        String numero1 = "5";
        String numero2 = "7";
        System.out.println("Concatenar string "+numero1 + numero2);
        System.out.println( "el resto es: "+resto);
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);


        // Asignacion -> da un valor = += -= *= /= %= ++ --
        operador1 = 10;
        operador2 = 11;
        operador1++; // 11
        operador1--; // 10
        // sumar 14 al operador 1
        operador1 += 14; //  15
        // restar 10 al operador 2
        operador2 -= 10; //  0
        //multiplicar por 2 al operador 1
        operador1 *= 2; //  30
        // resto de dividir operador 1 entre 2
        operador1 %= 2; // 0

        // Relacionales - Comparacion. comparan dos o mas variables entre si < <= > >= =0 != . Se obtiene un boolean
        operador1 = 10;
        operador2 = 10;
        boolean comparacion = operador1>operador2; // false
        System.out.println("la comparacion es "+comparacion);
        comparacion = operador1>=operador2; // true
        System.out.println("la comparacion es "+comparacion);
        comparacion = operador2<operador1; // false
        System.out.println("la comparacion es "+comparacion);
        comparacion = operador2<=operador1; // true
        System.out.println("la comparacion es "+comparacion);
        comparacion = operador1 == operador2; // true
        System.out.println("la comparacion es "+comparacion);
        comparacion = operador1 != operador2; // false
        System.out.println("la comparacion es "+comparacion);
        String palabra1 = "programacion";
        String palabra2 = "Programacion";
        boolean compararPalabrasIguales = palabra1.equals(palabra2); // false
        boolean compararPalabrasDiferentes = !palabra1.equalsIgnoreCase(palabra2); // true
        compararPalabrasIguales = palabra1.equalsIgnoreCase(palabra2); // true
        System.out.println("La comparacion de palabras es "+compararPalabrasIguales);

        // Logicos -> sentencias &&- > shift+6     || -> alt+1
        // && -> AND    || -> OR
        operador1 = 10;
        operador2 = 20;
        boolean comparacionAND = operador2 > 0 && operador1 < 10; // false
        boolean comparacionOR = operador1 > 10 || operador2 < 20 || operador1*2; // true




    }




}



