/*
 * 23.Realizá un programa que permita ingresar un número entero n. Debe mostrar los primeros
10 múltiplos de n (desde 1 x n).
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		int n = Integer.parseInt(input.nextLine());
		int i = 0;
		int resultado;
		while (i < 10) {
			i++;
			resultado = i * n;
			System.out.println(i + " x " + n + " = " + resultado);
		}
		input.close();
	}

}
