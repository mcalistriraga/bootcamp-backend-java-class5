/*
=============================================================================
5) Juego de adivinar el número:
Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
=============================================================================
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Adivina el numero...  Ingresa un numero entre 1 y 100 ?");
        Integer  userNumber = cargaDeDatos.nextInt();

        Integer randomNumber = (int)(Math.random()*100+1);

        if (randomNumber == userNumber) {
            System.out.println("Correcto!!, Adivinaste!!, felicitaciones!!");
        }
        else {
            System.out.println("Incorrecto!!, el numero correcto era: " + randomNumber);
        }
    }
}


