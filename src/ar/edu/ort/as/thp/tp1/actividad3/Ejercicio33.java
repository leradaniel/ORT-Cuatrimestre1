/*
 * 33.Realizá un programa que permita al usuario ingresar números hasta que se introduzca un 0. La computadora debe mostrar el número máximo y el número mínimo.
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Ingrese un valor. Para salir, ingrese 0");
		int valorIngresado = Integer.parseInt(input.nextLine());
		min = max = valorIngresado;
		while (valorIngresado != 0) {
			if (valorIngresado > max && valorIngresado != 0) {
				max = valorIngresado;
			}
			if (valorIngresado < min && valorIngresado != 0) {
				min = valorIngresado;
			}
			System.out.println("Ingrese un valor. Para salir, ingrese 0");
			valorIngresado = Integer.parseInt(input.nextLine());
		}

		if (min == 0 && max == 0) {
			System.out.println("No se ingresaron valores.");
		} else {
			System.out.println("El mínimo es: " + min + ". El máximo es: " + max);
		}
		input.close();
	}

}
