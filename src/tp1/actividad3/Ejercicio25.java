/*
 * 25.Realizá un programa que permita ingresar dos números enteros que representen el ancho y
el alto de una matriz de cruces. El programa debe dibujar dicha matriz.
 */
package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		int alto, ancho;
		System.out.println("Se va a dibujar una matriz de cruces.");
		System.out.println("Ingrese el ancho de la matriz:");
		do {
			ancho = Integer.parseInt(input.nextLine());

		} while (ancho <= 0);
		System.out.println("Ingrese el alto de la matriz:");
		do {
			alto = Integer.parseInt(input.nextLine());

		} while (alto <= 0);
		int i = 0;
		int j = 0;
		String matriz = "";

		while (i < alto) {
			while (j < ancho) {
				matriz += "x ";
				j++;
			}
			matriz += "\n";
			j = 0;
			i++;
		}
		System.out.println("Su matriz es:");
		System.out.println(matriz);

		input.close();
	}

}
