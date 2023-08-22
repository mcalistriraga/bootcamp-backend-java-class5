import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // IMC: Indice de masa corporal
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Que altura tiene tu cuerpo (en metros) ??");
        Float  altura = cargaDeDatos.nextFloat();

        System.out.println("Que peso tiene tu cuerpo (en Kg)??");
        Float  peso = cargaDeDatos.nextFloat();

        Float indiceMasaCorporal= peso/(altura*altura);

        System.out.println("Tu Indice de Masa Corporal es de: " + indiceMasaCorporal);

        // Mayor a 30 -> obesidad
        if (indiceMasaCorporal >=30) {
            System.out.println("condicion: Obesidad, (Mayor a 30)");
        }

        // Entre 25 y 30 -> sobrepeso
        if ( (indiceMasaCorporal >=25) && (indiceMasaCorporal < 30) ) {
            System.out.println("condicion: Sobrepeso, (Entre 25 y 30)");
        }

        // Entre 18.5 y 25 Normal
        if ( (indiceMasaCorporal >=18.5) && (indiceMasaCorporal < 25) ) {
            System.out.println("condicion: Normal, (Entre 18.5 y 25)");
        }

        // menor a 18.5 debajo del normal
        if (indiceMasaCorporal < 18.5){
            System.out.println("condicion: Sobrepeso, ( menor a 18.5)");
        }
    }
}
