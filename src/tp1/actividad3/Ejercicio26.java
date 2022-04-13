/*
 * 26.Realizá un programa que permita al usuario ingresar un número natural n. La computadora
debe mostrar los primeros n múltiplos de 3 excepto aquellos que sean a la vez múltiplos de
5.
 */

// Los numeros naturales son enteros > 0 (no negativos)
package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		final int NUM1 = 3;
		final int NUM2 = 5;

		System.out.println("Ingrese un número natural (entero mayor a 0)");
		int n = Integer.parseInt(input.nextLine());
		while (n <= 0) {
			System.out.println("Error. El número ingresado no es un entero mayor a 0. Intente de nuevo.");
			n = Integer.parseInt(input.nextLine());
		}

		System.out.println("Se van a mostrar los primeros " + n + " múltiplos de "+NUM1);
		System.out.println("A su vez, son múltiplos de "+NUM2);
		int i = 0, resultado = 0;
		while (i < n) {
			i++;
			resultado = NUM1 * i;
			if (resultado%NUM2==0) {
				System.out.println(NUM1 + " x " + i + " = " + resultado);
			}
		}

		input.close();
	}

}
