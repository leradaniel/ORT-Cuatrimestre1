/*
 * 35.Realizá un programa que permita ingresar nombre y edad de un grupo de personas (para cada una, nombre y edad). La carga termina cuando en el nombre de la persona se ingresa un asterisco ('*'). Mostrar al final cómo se llama la persona más joven.

 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un nombre. Para salir, ingrese *");
		String nombreIngresado = input.nextLine();
		String nombreJoven = "";
		int edadJoven = Integer.MAX_VALUE;
		int edadIngresada;
		boolean programaSalteado = true;
		while (!nombreIngresado.equals("*")) {
			programaSalteado = false;
			System.out.println("Ingrese la edad:");
			edadIngresada = Integer.parseInt(input.nextLine());
			if (edadIngresada < edadJoven) {
				edadJoven = edadIngresada;
				nombreJoven = nombreIngresado;
			}
			System.out.println("Ingrese un nombre. Para salir, ingrese *");
			nombreIngresado = input.nextLine();
		}
		if (!programaSalteado) {
			System.out.println("La persona más joven se llama " + nombreJoven + " y tiene " + edadJoven + " años.");
		} else {
			System.out.println("No se ingresaron valores");
		}

		input.close();
	}

}
