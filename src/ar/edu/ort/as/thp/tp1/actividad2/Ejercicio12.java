/*
 * 12.Realizá un programa que permita ingresar dos números enteros e indique cuál de ellos es el
mayor
 */
package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Se va a comparar dos números enteros para saber cuál es el mayor");
		System.out.println("Ingrese el primer número entero:");
		int numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo número entero:");
		int numero2 = Integer.parseInt(input.nextLine());
		if (numero1 > numero2) {
			System.out.println("El número más grande es: " + numero1);

		} else if (numero1 < numero2) {
			System.out.println("El número más grande es: " + numero2);

		} else {
			System.out.println("Los números son iguales");
		}
		input.close();
	}
}
