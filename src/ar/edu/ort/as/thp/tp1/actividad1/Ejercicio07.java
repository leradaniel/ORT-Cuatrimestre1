/*
 * 7. Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
metros de alambre para cercarlo completamente a tres alturas distintas.

 */
package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el ancho del terreno en metros: ");
		double ancho = input.nextDouble();
		System.out.println("Ingrese el largo del terreno en metros: ");
		double largo = input.nextDouble();
		System.out.println("Ingrese el valor por metro cuadrado: ");
		double precioM2 = input.nextDouble();
		double valor = ancho * largo * precioM2;
		double perimetro = ancho * 2 + largo * 2;
		System.out.println("El valor del terreno es de $" + valor);
		System.out.println("Metros de alambre necesarios para cercarlo 3 veces: " + (perimetro * 3));
		input.close();
	}

}
