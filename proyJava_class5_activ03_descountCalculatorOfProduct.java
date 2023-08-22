/*
=============================================================================
3) Calculadora de descuento (Descount Calculator):
     ------------------------------------------------------

Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.

Calcula el precio final después de aplicar el descuento utilizando la fórmula:
        precioFinal = precioOriginal - (precioOriginal * descuento / 100).

Muestra el precio final al usuario.
=============================================================================
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingresa el precio original del producto?");
        Double  precioOriginal = cargaDeDatos.nextDouble();

        System.out.println("Ingresa el porcentaje % de descuento?");
        Double  descuento = cargaDeDatos.nextDouble();

        Double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
