/*
 * 21.Realiz� un programa que permita al usuario ingresar un n�mero entero entre 1 y 7. Debe
mostrarse por pantalla el nombre del d�a de la semana que representa tal n�mero tomando
como el primer d�a de la semana el Domingo. De ingresar un n�mero fuera de rango debe
mostrar error.
 */
package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un n�mero entero del 1 al 7");
		int dia = Integer.parseInt(input.nextLine());
		switch (dia) {
		case 1:
			System.out.println("El d�a que corresponde al #"+dia+" es: Domingo");
			break;
		case 2:
			System.out.println("El d�a que corresponde al #"+dia+" es: Lunes");
			break;
		case 3:
			System.out.println("El d�a que corresponde al #"+dia+" es: Martes");
			break;
		case 4:
			System.out.println("El d�a que corresponde al #"+dia+" es: Mi�rcoles");
			break;
		case 5:
			System.out.println("El d�a que corresponde al #"+dia+" es: Jueves");
			break;
		case 6:
			System.out.println("El d�a que corresponde al #"+dia+" es: Viernes");
			break;
		case 7:
			System.out.println("El d�a que corresponde al #"+dia+" es: S�bado");
			break;
		default:
			System.out.println("Error. El valor ingresado no est� en el rango 1~7.");
			break;
		}
		input.close();
	}

}
