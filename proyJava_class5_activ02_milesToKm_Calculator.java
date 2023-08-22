/*
     Conversor de millas a kilómetros:
		proyJava_class5_activ02_milesToKm_Calculator
     ------------------------------------------------------
    Pídele al usuario que ingrese una distancia en millas.
    Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
    Muestra la distancia en kilómetros al usuario.

* */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingresa la distancia en millas ??");
        Double  millas = cargaDeDatos.nextDouble();

        Double  distancia_Km = millas * 1.60934;

        System.out.println(millas + " millas equivale a " + distancia_Km + " Kilómetros");

    }
}


