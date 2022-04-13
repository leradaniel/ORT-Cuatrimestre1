/*
 * Actividad Nº 2: Tipos de datos lógicos y flujo de selección
 * 11.Realizá un programa que permita ingresar un número entero e indique si se trata de un
número par o impar.
 */
package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un número entero");
		int numero = Integer.parseInt(input.nextLine());
		if (numero % 2 == 0) {
			System.out.println("El número ingresado es par");
		} else {
			System.out.println("El número ingresado es impar");
		}
		input.close();
	}

}
