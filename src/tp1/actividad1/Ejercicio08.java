/*
 * 8. Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
resultados para las 4 operaciones matemáticas básicas con los números ingresados.
 */
package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Se van a mostrar las 4 operaciones entre 2 números.");
		System.out.println("Ingrese un número Natural (entero mayor a 0): ");
		int numero1 = input.nextInt();
		System.out.println("Ingrese otro número Natural: ");
		int numero2 = input.nextInt();
		System.out.println("Suma: " + (numero1 + numero2));
		System.out.println("Resta: " + (numero1 - numero2));
		System.out.println("Multiplicación: " + (numero1 * numero2));
		System.out.println("División: " + (numero1 / numero2));
		input.close();
	}

}
