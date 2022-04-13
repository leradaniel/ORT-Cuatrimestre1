/*
 * 27.Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el promedio de todas
las edades ingresadas y cuántas edades fueron valores impares mayores que 18.
 */
package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		int edadIngresada;
		int totalEdades = 0;
		double promedio;
		int cantidadImpares = 0;

		System.out.println("Se le va a solicitar 5 edades.");
		int i = 0;
		while (i < 5) {
			System.out.println("Ingrese una edad: ");
			edadIngresada = Integer.parseInt(input.nextLine());
			if (edadIngresada > 18 && edadIngresada%2!=0) {
				cantidadImpares++;
			}
			totalEdades += edadIngresada;
			i++;
		}

		promedio = totalEdades / 5.0;
		System.out.println("El promedio de las 5 edades es de: " + promedio);
		System.out.println("La cantidad de edades impares mayores a 18 es de: " + cantidadImpares);
		input.close();

	}

}
