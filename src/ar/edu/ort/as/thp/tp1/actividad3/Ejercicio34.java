/*
 * 34.Realizá un programa que permita ingresar la estatura (en metros con decimales) de cada jugador de un equipo de baloncesto. La carga finalizará al ingresar cero. Calcular y mostrar la estatura promedio del equipo.
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		double estaturaIngresada = 0;
		double estaturaTotal = 0;
		int cantidad = 0;
		double promedio = 0;

		do {
			cantidad++;
			System.out.println("Ingrese una estatura. Para salir ingrese 0:");
			estaturaIngresada = Integer.parseInt(input.nextLine());
			estaturaTotal += estaturaIngresada;
		} while (estaturaIngresada != 0);
		
		cantidad--;
		
		if (estaturaTotal != 0) {
			promedio = estaturaTotal / cantidad;
			System.out.println("El promedio de estatura en el equipo en metros es de: " + promedio);
		} else {
			System.out.println("No se ingresaron valores");
		}

		input.close();
	}

}
