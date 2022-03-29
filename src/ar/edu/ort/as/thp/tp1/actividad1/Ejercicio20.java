/*
 * 20.Realiz� un programa que permita ingresar dos n�meros enteros y la operaci�n a realizar
('+', '-', '*', '/'). Debe mostrarse el resultado para la operaci�n ingresada. Considerar
que no se puede dividir por cero (en ese caso mostrar el texto 'ERROR').
 */
package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		final char SUMA = '+';
		final char RESTA = '-';
		final char MULTIPLICACION = '*';
		final char DIVISION = '/';

		System.out.println("Ingrese el primer n�mero entero:");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo n�mero entero:");
		int num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la operaci�n a realizar ( + | - | / | * ):");
		char operacion = input.nextLine().charAt(0);

		double resultado;
		if (operacion == SUMA) {
			resultado = num1 + num2;
			System.out.println("El resultado de la suma es: " + resultado);
		} else if (operacion == RESTA) {
			resultado = num1 - num2;
			System.out.println("El resultado de la resta es: " + resultado);
		} else if (operacion == MULTIPLICACION) {
			resultado = num1 * num2;
			System.out.println("El resultado de la multiplicaci�n es: " + resultado);
		} else if (operacion == DIVISION) {
			if (num2 != 0) {
				resultado = (double) num1 / num2;
				System.out.println("El resultado de la divisi�n es: " + resultado);
			} else {
				System.out.println("Error. No se puede dividir por 0");
			}
		} else {
			System.out.println("Error. No se ingres� una de las 4 operaciones");
		}

		input.close();
	}

}
