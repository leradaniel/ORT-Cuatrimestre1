/*
 * 8. Realiz� un programa que permita ingresar dos n�meros naturales. Debes mostrar los
resultados para las 4 operaciones matem�ticas b�sicas con los n�meros ingresados.
 */
package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Se van a mostrar las 4 operaciones entre 2 n�meros.");
		System.out.println("Ingrese un n�mero Natural (entero mayor a 0): ");
		int numero1 = input.nextInt();
		System.out.println("Ingrese otro n�mero Natural: ");
		int numero2 = input.nextInt();
		System.out.println("Suma: " + (numero1 + numero2));
		System.out.println("Resta: " + (numero1 - numero2));
		System.out.println("Multiplicaci�n: " + (numero1 * numero2));
		System.out.println("Divisi�n: " + (numero1 / numero2));
		input.close();
	}

}
