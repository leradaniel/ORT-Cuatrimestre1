/*
 * 30.Realiz� un programa que permita realizar varias operaciones matem�ticas ingresando un caracter por cada una la operaci�n a realizar (�+�, �-�, �*�, �/�, �F�) y dos n�meros enteros en el caso que no haya elegido �F�. La computadora debe mostrar el resultado para la operaci�n ingresada. Considerar que no se puede dividir por cero. Cuando la operaci�n ingresada sea �F� nos indicar� que no se desean calcular m�s operaciones.
 */
package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		final char SUMA = '+';
		final char RESTA = '-';
		final char MULTIPLICACION = '*';
		final char DIVISION = '/';
		final char SALIR = 'F';
		final Scanner input = new Scanner(System.in);
		System.out.println("Se van a realizar varias operaciones matem�ticas.");

		System.out.println("Ingrese una operaci�n (+ | - | * | /). Para salir ingrese \"F\"");
		int num1 = 0, num2 = 0;
		double resultado = 0;
		boolean errorActivo = false;
		char valorIngresado = input.nextLine().toUpperCase().charAt(0);
		while (valorIngresado != SALIR) {
			if (valorIngresado == SUMA || valorIngresado == RESTA || valorIngresado == MULTIPLICACION
					|| valorIngresado == DIVISION) {
				System.out.println("Ingrese el primer valor:");
				num1 = Integer.parseInt(input.nextLine());
				System.out.println("Ingrese el segundo valor:");
				num2 = Integer.parseInt(input.nextLine());
				switch (valorIngresado) {
				case SUMA:
					resultado = num1 + num2;
					break;
				case RESTA:
					resultado = num1 - num2;
					break;
				case MULTIPLICACION:
					resultado = num1 * num2;
					break;
				case DIVISION:
					if (num2 != 0) {
						resultado = (double) num1 / num2;
					} else {
						System.out.println("Error. No se puede dividir por 0.");
						errorActivo = true;
					}
					break;
				default:
					System.out.println("ERROR");
					errorActivo = true;
					break;
				}

			} else {
				System.out.println("Error. No se ingres� una operaci�n v�lida.");
				errorActivo = true;
			}
			if (!errorActivo) {
				System.out.println("El valor de la operaci�n es de:" + resultado);
			} else {
				errorActivo = false;
			}
			System.out.println("Ingrese una operaci�n (+ | - | * | /). Para salir ingrese \"F\"");
			valorIngresado = input.nextLine().toUpperCase().charAt(0);
		}
		System.out.println("Fin del programa.");
		input.close();
	}

}
