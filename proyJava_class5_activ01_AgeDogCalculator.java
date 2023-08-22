//
//        Calculadora de edad de perros:
//        Pídele al usuario que ingrese la edad de su perro.
//        Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Cuantos años hace que nació el perro ??");
        Integer  ageHuman = cargaDeDatos.nextInt();

        // calculo de la edad del perro
        Integer  ageDog =ageHuman*7;

        System.out.println(ageHuman + " años humanos equivalen a " + ageDog +" años de perro");

    }
}