/*
=============================================================================
4) Calculadora de propinas/ tipCalculator:

Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.

Calcula el monto de la propina utilizando la fórmula:
    propina = totalCuenta * (porcentajePropina / 100).

=============================================================================
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingresa el total de la cuenta (del restaurante)?");
        Double  totalCuenta = cargaDeDatos.nextDouble();

        System.out.println("Ingresa el % de propina que desaas dejar?");
        Double  porcentajePropina = cargaDeDatos.nextDouble();

        Double propina = totalCuenta * (porcentajePropina / 100);

        System.out.println("El monto de la propina es: " + propina);
    }
}