/*
 * Actividad N� 2: Tipos de datos l�gicos y flujo de selecci�n
 * 11.Realiz� un programa que permita ingresar un n�mero entero e indique si se trata de un
n�mero par o impar.
 */
package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un n�mero entero");
		int numero = Integer.parseInt(input.nextLine());
		if (numero % 2 == 0) {
			System.out.println("El n�mero ingresado es par");
		} else {
			System.out.println("El n�mero ingresado es impar");
		}
		input.close();
	}

}
