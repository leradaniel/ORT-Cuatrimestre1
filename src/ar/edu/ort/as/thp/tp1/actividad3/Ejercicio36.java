/*
 * 36.Realizá un programa que permita ingresar números mientras el promedio entre todos los ingresados sea menor a 20. Al terminar el ingreso indicar la cantidad de valores leídos.
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio36 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		System.out.println("Se van a ingresar valores hasta que el promedio sea mayor a 20.");
		double valorTotal = 0;
		int i = 0;
		double promedio = 0;
		while (promedio < 20) {
			System.out.println("Ingrese un valor:");
			valorTotal += Double.parseDouble(input.nextLine());
			i++;
			promedio = valorTotal / i;
			System.out.println("El valor actual es: " + promedio);

		}
		System.out.println("La cantidad de valores leídos fue de: " + i);

		input.close();
	}

}
