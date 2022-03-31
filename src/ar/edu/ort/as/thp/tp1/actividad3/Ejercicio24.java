/*
 * 24.Realizá un programa que permita al usuario ingresar dos números enteros num1 y num2,
donde el primero siempre deberá ser menor o igual al segundo. La computadora debe
mostrar la secuencia de números existentes entre ambos:
a. Incluyéndolos;
b. Excluyéndolos.
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingrese 2 números. El primero debe ser menor o igual al segundo.");
		int num1 = 0, num2 = 0;
		boolean primeroMenor = false;

		while (!primeroMenor) {
			System.out.println("Ingrese el primer número entero: ");
			num1 = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese el segundo número entero: ");
			num2 = Integer.parseInt(input.nextLine());
			if (num1 <= num2) {
				primeroMenor = true;
			} else {
				System.out.println("Error. El primer número debe ser menor al segundo. Intente de nuevo.");
			}
		}

		System.out.println("Se van a mostrar los números entre " + num1 + " y " + num2 + ", INCLUYÉNDOLOS");
		int i = num1;
		while (i <= num2) {
			System.out.println(i);
			i++;
		}
		System.out.println("Se van a mostrar los números entre " + num1 + " y " + num2 + ", EXCLUYÉNDOLOS");
		i = num1;
		while (i < num2-1) {
			i++;
			System.out.println(i);
		}

		input.close();

	}

}
