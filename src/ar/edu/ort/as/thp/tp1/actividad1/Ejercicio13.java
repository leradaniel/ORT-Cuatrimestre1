/*
 * 13.Realiz� un programa para ingresar tres n�meros enteros e indique cu�l de ellos es el mayor y
su valor
 */
package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Se van a comparar 3 n�meros enteros para saber cu�l es el mayor.");
		System.out.println("Ingrese el primer n�mero entero:");
		int n1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo n�mero entero:");
		int n2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el tercero n�mero entero:");
		int n3 = Integer.parseInt(input.nextLine());
		
		int max = n1;
		if (n2 > max) {
			max = n2;
		}
		if (n3 > max) {
			max = n3;
		}
		
		System.out.println("El n�mero m�s grande es: " + max);
		input.close();
	}

}
