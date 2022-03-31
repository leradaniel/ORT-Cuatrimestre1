/*
 * 32.Realizá un programa que permita validar la nota de un examen de la misma manera que el ejercicio 28 pero con las siguientes nuevas directivas:
_ Las notas 1 y 3 no usan nunca.
_ La nota 0 se reserva para los ausentes
En resumen, las notas válidas pueden ser un 2 o un valor entre 4 y 10.
(Nota mía: Creo que hace referencia al ejercicio 29 y no al 28)
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {

		final Scanner input = new Scanner(System.in);
		System.out.println("Se van a ingresar notas entre 1 y 10. 0 es para ausentes, 1y3 no se usan");
		int nota = -1;

		while (nota <= 1 || nota == 3 || nota > 10) {
			System.out.println("Ingrese una nota entre 0 y 10:");
			nota = Integer.parseInt(input.nextLine());
			if (nota < 0 || nota == 1 || nota == 3 || nota > 10) {
				System.out.println("Error, nota inválida. Intente de nuevo.");
			} else if (nota == 0) {
				System.out.println("Error, la nota 0 está reservada para ausentes.");
			}
		}
		System.out.println("La nota ingresada es: " + nota);
		input.close();

	}

}
