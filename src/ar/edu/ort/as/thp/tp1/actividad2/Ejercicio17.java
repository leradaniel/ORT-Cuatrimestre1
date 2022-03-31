/*
 * 17.Realiz� un programa que permita ingresar una edad (entre 1 y 120 a�os) y un g�nero ('F'
para mujeres, 'M' para hombres). En caso de haber ingresado valores err�neos (edad fuera
de rango o g�nero inv�lido), informar tal situaci�n. Si los datos est�n bien ingresados el
programa debe indicar, sabiendo que las mujeres se jubilan con 60 a�os o m�s y los hombres
con 65 a�os o m�s, si la persona est� en edad de jubilarse.
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
			System.out.println("Ingrese su g�nero (M o F)");
			char genero = input.nextLine().charAt(0);
			if (genero == SEXO_M) {
				if (edad >= EDAD_JUBLICACION_M) {
					System.out.println("Ya podr�a jubilarse.");
				} else {
					System.out.println("Todav�a no est� en edad de jubilarse.");
				}

			} else if (genero == SEXO_F) {
				if (edad >= EDAD_JUBLICACION_F) {
					System.out.println("Ya podr�a jubilarse.");
				} else {
					System.out.println("Todav�a no est� en edad de jubilarse.");
				}
			} else {
				System.out.println("Error: G�nero inv�lido. El sexo debe ser \"M\" o \"F\"");
			}

		} else {
			System.out.println("Error: Edad fuera de rango. La edad debe ser entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA);
		}
		input.close();
	}
}
