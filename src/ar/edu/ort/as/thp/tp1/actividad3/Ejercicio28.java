/*
 * 28.Realiz� un programa que a partir de un n�mero entero cant ingresado por el usuario permita cargar por teclado cant n�meros enteros. La computadora debe mostrar cu�l fue el mayor n�mero y en qu� posici�n apareci�.

 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		int cant = -1;
		while (cant <= 0) {
			System.out.println("Ingrese la cantidad de n�meros que se van a pedir:");
			cant = Integer.parseInt(input.nextLine());
			if (cant <= 0)
				System.out.println("Error, el n�mero debe ser mayor a 0.");
		}

		int num, mayor = Integer.MIN_VALUE, posicion = 0, i = 0;

		while (i < cant) {
			System.out.println("Ingrese un n�mero:");
			num = Integer.parseInt(input.nextLine());
			if (num > mayor) {
				mayor = num;
				posicion = i + 1;
			}
			i++;
		}
		System.out.println("El n�mero m�s grande fue: " + mayor + ". Su posici�n es: " + posicion);

		input.close();
	}

}
