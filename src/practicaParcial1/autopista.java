/*
 * Consigna:
 * Una concesionaria de peajes debe registrar al final del día la recaudación total de la empresa contabilizando lo ingresado por cada una de las cabinas en los tres turnos.

El programa debe solicitar al usuario el número de la autopista (entero >= 0) y la cantidad de cabinas que posee, si ingresa 0 (cero) como número de autopista se finaliza la carga.

Luego, por cada cabina se debe ingresar:
•	Numero de cabina (entero mayor que 0 y menor o igual a la cantidad de cabinas que posea esta autopista) (Suponer que no se repiten para una misma autopista)
•	Turno (1, 2 o 3) (Suponer que ingresa una unica vez un turno para cada cabina de cada autopista)
•	Total recaudado (>= a 0)

Al finalizar la carga de cada autopista se debe mostrar el total recaudado por la autopista y el número de cabina con mayor recaudación.

Finalizada la carga de todas las autopistas mostrar:
a) Total recaudado general.
b) Número de autopista con mayor recaudación y el total de la misma
c) Promedio de recaudación por turno de todas las autopistas

 */

package practicaParcial1;

import java.util.Scanner;

public class autopista {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		int numAutopista, cantCabinas, numCabina, numTurno, cabRecaudacion, autoRecaudacion = 0, cabMayor = 0,
				autoMayorRecaudacion = -1, cabRecaudacionMayor = -1, recaudacionTotal = 0, autoMayor = 0, cantT1 = 0,
				cantT2 = 0, cantT3 = 0, recaudacionT1 = 0, recaudacionT2 = 0, recaudacionT3 = 0;
		double promedioRecaudacionT1 = 0, promedioRecaudacionT2 = 0, promedioRecaudacionT3 = 0;

		do {
			System.out.println("Ingrese el número de autopista (0 para salir):");
			numAutopista = Integer.parseInt(input.nextLine());
		} while (numAutopista < 0);

		while (numAutopista != 0) {
			do {
				System.out.println("Ingrese la cantidad de cabinas:");
				cantCabinas = Integer.parseInt(input.nextLine());
			} while (cantCabinas <= 0);
			for (int i = 0; i < cantCabinas; i++) {
				do {
					System.out.println("Ingrese el número de cabina:");
					System.out.println("(Sin repetir)");
					numCabina = Integer.parseInt(input.nextLine());
				} while (numCabina <= 0 || numCabina > cantCabinas);

				do {
					System.out.println("Ingrese el turno (1, 2 o 3):");
					numTurno = Integer.parseInt(input.nextLine());
				} while (numTurno <= 0 || numTurno > 3);
				do {
					System.out.println("Ingrese el total recaudado (>= 0):");
					cabRecaudacion = Integer.parseInt(input.nextLine());
				} while (cabRecaudacion < 0);
				autoRecaudacion += cabRecaudacion;
				if (cabRecaudacion > cabRecaudacionMayor) {
					cabRecaudacionMayor = cabRecaudacion;
					cabMayor = i + 1;
				}
				switch (numTurno) {
				case 1:
					cantT1++;
					recaudacionT1 += cabRecaudacion;
					break;
				case 2:
					cantT2++;
					recaudacionT2 += cabRecaudacion;
					break;
				case 3:
					cantT3++;
					recaudacionT3 += cabRecaudacion;
					break;
				}
			}
			recaudacionTotal += autoRecaudacion;
			if (autoRecaudacion > autoMayorRecaudacion) {
				autoMayorRecaudacion = autoRecaudacion;
				autoMayor = numAutopista;
			}
			cabRecaudacionMayor = -1;
			System.out.println("El total recaudado por la autopista es de: $" + autoRecaudacion);
			System.out.println("La cabina con mayor recaudación fue la #" + cabMayor);

			System.out.println("--- Fin de la carga de la autopista. Se pasa a la siguiente ---");

			do {
				System.out.println("Ingrese el número de autopista (0 para salir):");
				numAutopista = Integer.parseInt(input.nextLine());
			} while (numAutopista < 0);
		}
		if (cantT1 != 0)
			promedioRecaudacionT1 = (double) recaudacionT1 / cantT1;
		if (cantT2 != 0)
			promedioRecaudacionT2 = (double) recaudacionT2 / cantT2;
		if (cantT3 != 0)
			promedioRecaudacionT3 = (double) recaudacionT3 / cantT3;

		System.out.println("--- Salida final ---");
		System.out.println("El total recaudado por todas las autopistas es de $" + recaudacionTotal);
		System.out.println("La autopista con mayor recaudación fue la #" + autoMayor);
		System.out.println("El promedio del Turno 1 es de $" + promedioRecaudacionT1);
		System.out.println("El promedio del Turno 2 es de $" + promedioRecaudacionT2);
		System.out.println("El promedio del Turno 3 es de $" + promedioRecaudacionT3);
		input.close();
	}

}
