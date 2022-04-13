/*
 * 31.Realiz� un programa que permita validar una opci�n ingresada. Se le preguntar� al usuario si desea continuar con alguna operaci�n de la forma "�Dese�s continuar? [S/N]". Se espera que el usuario ingrese una 'S' o una 'N' (incluir las min�sculas). La opci�n debe ser ingresada tanto como sea necesario hasta que quede comprendida dentro de las posibilidades esperadas. Realiz� este ejercicio en dos versiones (A y B): con ciclo while y con ciclo do-while.
 */
package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio31B {
	// Versi�n con Do While
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		boolean stop = false;
		
		do {
			System.out.println("�Dese�s continuar? [S/N]");
			char response = input.nextLine().toUpperCase().charAt(0);
			stop = (response == 'N');
			if (response != 'S' && response != 'N') {
				System.out.println("Error. Debe ingresar S o N.");
			}
		} while (!stop);
		
		input.close();
		System.out.println("Fin del programa.");
	}

}
