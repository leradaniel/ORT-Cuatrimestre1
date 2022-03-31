/*
 * 29.Realizá un programa que permita validar la nota de un examen. Se espera que la nota que el usuario ingrese sea un número comprendido entre 0 y 10. La misma debe ser ingresada tantas veces como sea necesario hasta que quede comprendida dentro del rango indicado.
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		int nota = -1;

		while (nota < 0 || nota > 10) {
			System.out.println("Ingrese una nota entre 0 y 10:");
			nota = Integer.parseInt(input.nextLine());
			if (nota < 0 || nota > 10)
				System.out.println("Error, la nota debe ser entre 0 y 10.");
		}
		System.out.println("La nota ingresada es: "+nota);
		input.close();
	}
}