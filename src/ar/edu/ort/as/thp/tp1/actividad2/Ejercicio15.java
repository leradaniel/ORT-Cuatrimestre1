/*
 * 15.Para entrar a la monta�a rusa Miedo a las alturas, algo m�s chica y tranquila que la anterior,
alcanza con que se cumpla solamente una de las siguientes condiciones: ser mayor de 6 a�os
o medir m�s de 1,50 metros. Realiz� el mismo procedimiento que con el ejercicio anterior
pero con los nuevos requisitos.
Nombre	Edad	Altura
Juan	5		1.45
Mar�a	7		1.23
Luis	8		1.51
Ana		9		1.39

 */
package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		final int EDAD_MINIMA = 6;
		final double ALTURA_MINIMA = 1.50;
		final Scanner input = new Scanner(System.in);

		System.out.println("Se requiere tener al menos " + EDAD_MINIMA + " a�os o medir " + ALTURA_MINIMA
				+ "m para ingresar a la monta�a rusa MIEDO A LAS ALTURAS");
		System.out.println("Ingrese su edad:");
		int edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese su altura:");
		double altura = Double.parseDouble(input.nextLine());

		if (edad > EDAD_MINIMA || altura > ALTURA_MINIMA) {
			System.out.println("Puede pasar :)");
		} else {
			System.out.println("No puede pasar :(");
		}

		input.close();

	}

}
