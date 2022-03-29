/*
 * 16.Realizá un programa que permita ingresar la cantidad de inscriptos a una conferencia y la
cantidad de asientos disponibles en el auditorio. Debes indicar si alcanzan los asientos, Si los
asientos no alcanzaran indicar cuántos faltan para que todos los inscriptos puedan sentarse.
 */
package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Indique la cantidad de inscriptos: ");
		int inscriptos = Integer.parseInt(input.nextLine());
		System.out.println("Indique la cantidad de asientos disponibles: ");
		int asientos = Integer.parseInt(input.nextLine());
		
		if (asientos >= inscriptos) {
			System.out.println("Hay suficientes asientos para todos.");
		} else {
			int asientosFaltantes = inscriptos - asientos;
			System.out.println("Faltan asientos: "+asientosFaltantes);
		}
		
		input.close();
	}
}
