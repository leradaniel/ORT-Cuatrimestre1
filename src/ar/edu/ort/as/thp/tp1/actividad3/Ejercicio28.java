/*
 * 28.Realizá un programa que a partir de un número entero cant ingresado por el usuario permita cargar por teclado cant números enteros. La computadora debe mostrar cuál fue el mayor número y en qué posición apareció.

 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		int cant = -1;
		while (cant <= 0) {
			System.out.println("Ingrese la cantidad de números que se van a pedir:");
			cant = Integer.parseInt(input.nextLine());
			if (cant <= 0)
				System.out.println("Error, el número debe ser mayor a 0.");
		}

		int num, mayor = Integer.MIN_VALUE, posicion = 0, i = 0;

		while (i < cant) {
			System.out.println("Ingrese un número:");
			num = Integer.parseInt(input.nextLine());
			if (num > mayor) {
				mayor = num;
				posicion = i + 1;
			}
			i++;
		}
		System.out.println("El número más grande fue: " + mayor + ". Su posición es: " + posicion);

		input.close();
	}

}
