/*
 * 3. Realiz� un programa que permita ingresar un n�mero entero. Debe mostrarse el n�mero
ingresado:
a. Multiplicado por 5.
b. Dividido por 2.
 */
package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		int numero = input.nextInt();
		System.out.println("N�mero ingresado multiplicado por 5: " + (numero*5));
		System.out.println("N�mero ingresado dividido por 2: " + (numero/2.00)); //Sin casteo
		//System.out.println("N�mero ingresado dividido por 2: " + ((double)numero/2)); //Con casteo
		input.close();
	}
}
