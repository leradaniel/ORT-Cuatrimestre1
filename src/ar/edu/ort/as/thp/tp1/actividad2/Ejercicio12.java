/*
 * 12.Realiz� un programa que permita ingresar dos n�meros enteros e indique cu�l de ellos es el
mayor
 */
package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Se va a comparar dos n�meros enteros para saber cu�l es el mayor");
		System.out.println("Ingrese el primer n�mero entero:");
		int numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo n�mero entero:");
		int numero2 = Integer.parseInt(input.nextLine());
		if (numero1 > numero2) {
			System.out.println("El n�mero m�s grande es: " + numero1);

		} else if (numero1 < numero2) {
			System.out.println("El n�mero m�s grande es: " + numero2);

		} else {
			System.out.println("Los n�meros son iguales");
		}
		input.close();
	}
}
