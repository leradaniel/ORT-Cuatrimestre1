/*
 * 9. Realizá un programa que permita ingresar dos números que representan las medidas en
grados de dos ángulos interiores de cierto triángulo. A partir de los valores de estos dos
 */
package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingresando dos ángulos interiores de un triángulo se calculará el tercero.");
		System.out.println("Ingrese un ángulo: ");
		double angulo1 = input.nextDouble();
		System.out.println("Ingrese otro ángulo: ");
		double angulo2 = input.nextDouble();
		double angulo3 = 180 - angulo1 - angulo2;
		System.out.println("Valor del ángulo restante: " + angulo3);
		input.close();
	}

}
