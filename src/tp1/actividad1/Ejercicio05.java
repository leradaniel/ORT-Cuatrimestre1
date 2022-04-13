/*
 * 5. Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores (que
lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas.
 */
package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		int num1 = input.nextInt();
		System.out.println("Ingrese otro número entero: ");
		int num2 = input.nextInt();
		System.out.println("Valor de num1: " + num1 + " / Valor de num2: " + num2);
		int aux = num1;
		num1 = num2;
		num2 = aux;
		System.out.println("Los valores fueron invertidos.");
		System.out.println("Valor de num1: " + num1 + " / Valor de num2: " + num2);
		input.close();
	}

}
