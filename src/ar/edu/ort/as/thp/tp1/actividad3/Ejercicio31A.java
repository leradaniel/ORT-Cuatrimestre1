/*
 * 31.Realizá un programa que permita validar una opción ingresada. Se le preguntará al usuario si desea continuar con alguna operación de la forma "¿Deseás continuar? [S/N]". Se espera que el usuario ingrese una 'S' o una 'N' (incluir las minúsculas). La opción debe ser ingresada tanto como sea necesario hasta que quede comprendida dentro de las posibilidades esperadas. Realizá este ejercicio en dos versiones (A y B): con ciclo while y con ciclo do-while.
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio31A {
	// Versión con While
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		boolean stop = false;
		while (!stop) {
			System.out.println("¿Deseás continuar? [S/N]");
			char response = input.nextLine().toUpperCase().charAt(0);
			if (response != 'S' && response != 'N') {
				System.out.println("Error. Debe ingresar S o N.");
			}
			stop = (response == 'N');
		}
		input.close();
		System.out.println("Fin del programa.");
	}
}