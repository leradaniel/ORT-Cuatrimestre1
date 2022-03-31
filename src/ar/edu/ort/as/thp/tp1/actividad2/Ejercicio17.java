/*
 * 17.Realizá un programa que permita ingresar una edad (entre 1 y 120 años) y un género ('F'
para mujeres, 'M' para hombres). En caso de haber ingresado valores erróneos (edad fuera
de rango o género inválido), informar tal situación. Si los datos están bien ingresados el
programa debe indicar, sabiendo que las mujeres se jubilan con 60 años o más y los hombres
con 65 años o más, si la persona está en edad de jubilarse.
 */
package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		final char SEXO_M = 'M';
		final char SEXO_F = 'F';
		final int EDAD_MINIMA = 1;
		final int EDAD_MAXIMA = 120;
		final int EDAD_JUBLICACION_M = 65;
		final int EDAD_JUBLICACION_F = 60;

		System.out.println("Ingrese su edad: ");
		int edad = Integer.parseInt(input.nextLine());
		if (edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA) {
			System.out.println("Ingrese su género (M o F)");
			char genero = input.nextLine().charAt(0);
			if (genero == SEXO_M) {
				if (edad >= EDAD_JUBLICACION_M) {
					System.out.println("Ya podría jubilarse.");
				} else {
					System.out.println("Todavía no está en edad de jubilarse.");
				}

			} else if (genero == SEXO_F) {
				if (edad >= EDAD_JUBLICACION_F) {
					System.out.println("Ya podría jubilarse.");
				} else {
					System.out.println("Todavía no está en edad de jubilarse.");
				}
			} else {
				System.out.println("Error: Género inválido. El sexo debe ser \"M\" o \"F\"");
			}

		} else {
			System.out.println("Error: Edad fuera de rango. La edad debe ser entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA);
		}
		input.close();
	}
}
