/*
 * 18.Realiz� un programa que permita al usuario ingresar dos n�meros enteros. La computadora
debe indicar si el mayor es divisible por el menor. (Un n�mero entero a es divisible por un
n�mero entero b cuando el resto de la divisi�n entre a y b es 0
 */
package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Se va a comprobar que dados 2 n�meros el mayor sea divisible por el menor.");
		System.out.println("Ingrese el primer n�mero entero:");
		int numero1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo n�mero entero:");
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
			System.out.println("El n�mero mayor " + mayor + " es disivisible por el n�mero menor " + menor);
		} else {
			System.out.println("El n�mero mayor " + mayor + " NO es disivisible por el n�mero menor " + menor);
		}

		input.close();
	}

}
