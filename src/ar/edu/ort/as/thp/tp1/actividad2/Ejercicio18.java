/*
 * 18.Realizá un programa que permita al usuario ingresar dos números enteros. La computadora
debe indicar si el mayor es divisible por el menor. (Un número entero a es divisible por un
número entero b cuando el resto de la división entre a y b es 0
 */
package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Se va a comprobar que dados 2 números el mayor sea divisible por el menor.");
		System.out.println("Ingrese el primer número entero:");
		int numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo número entero:");
		int numero2 = Integer.parseInt(input.nextLine());

		int mayor;
		int menor;
		if (numero1 > numero2) {
			menor = numero2;
			mayor = numero1;

		} else {
			menor = numero1;
			mayor = numero2;
		}

		if (menor == 0) {
			System.out.println("Error. No se puede dividir por 0.");

		} else if (mayor % menor == 0) {
			System.out.println("El número mayor " + mayor + " es disivisible por el número menor " + menor);
		} else {
			System.out.println("El número mayor " + mayor + " NO es disivisible por el número menor " + menor);
		}

		input.close();
	}

}
