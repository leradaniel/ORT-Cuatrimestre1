/*
 * 9. Realiz� un programa que permita ingresar dos n�meros que representan las medidas en
grados de dos �ngulos interiores de cierto tri�ngulo. A partir de los valores de estos dos
 */
package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingresando dos �ngulos interiores de un tri�ngulo se calcular� el tercero.");
		System.out.println("Ingrese un �ngulo: ");
		double angulo1 = input.nextDouble();
		System.out.println("Ingrese otro �ngulo: ");
		double angulo2 = input.nextDouble();
		double angulo3 = 180 - angulo1 - angulo2;
		System.out.println("Valor del �ngulo restante: " + angulo3);
		input.close();
	}

}
