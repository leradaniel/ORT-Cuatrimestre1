/*
 * 24.Realiz� un programa que permita al usuario ingresar dos n�meros enteros num1 y num2,
donde el primero siempre deber� ser menor o igual al segundo. La computadora debe
mostrar la secuencia de n�meros existentes entre ambos:
a. Incluy�ndolos;
b. Excluy�ndolos.
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingrese 2 n�meros. El primero debe ser menor o igual al segundo.");
		int num1 = 0, num2 = 0;
		boolean primeroMenor = false;

		while (!primeroMenor) {
			System.out.println("Ingrese el primer n�mero entero: ");
			num1 = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese el segundo n�mero entero: ");
			num2 = Integer.parseInt(input.nextLine());
			if (num1 <= num2) {
				primeroMenor = true;
			} else {
				System.out.println("Error. El primer n�mero debe ser menor al segundo. Intente de nuevo.");
			}
		}

		System.out.println("Se van a mostrar los n�meros entre " + num1 + " y " + num2 + ", INCLUY�NDOLOS");
		int i = num1;
		while (i <= num2) {
			System.out.println(i);
			i++;
		}
		System.out.println("Se van a mostrar los n�meros entre " + num1 + " y " + num2 + ", EXCLUY�NDOLOS");
		i = num1;
		while (i < num2-1) {
			i++;
			System.out.println(i);
		}

		input.close();

	}

}
