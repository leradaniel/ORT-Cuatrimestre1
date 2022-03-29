/*
 * 14.Para entrar a la monta�a rusa Infierno en las alturas se requiere tener al menos 7 a�os y medir
m�s de 1,50 metros. Complet� el siguiente cuadro a mano seg�n los requisitos y luego haz el
programa que permita, seg�n las edades y estaturas ingresadas por el usuario, obtener los
mismos resultados seg�n los siguientes datos:
Nombre	Edad	Altura
Juan 	5		1.45
Mar�a 	7		1.23
Luis	8		1.51
Ana		9		1.39

 */
package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		final int EDAD_MINIMA = 7;
		final double ALTURA_MINIMA = 1.50;
		final Scanner input = new Scanner(System.in);
		
		System.out.println("Se requiere tener al menos "+EDAD_MINIMA+" a�os y medir "+ALTURA_MINIMA+"m para ingresar a la monta�a rusa INFIERNO");
		System.out.println("Ingrese su edad:");
		int edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese su altura:");
		double altura = Double.parseDouble(input.nextLine());
		
		if (edad >= EDAD_MINIMA && altura > ALTURA_MINIMA ) {
			System.out.println("Puede pasar :)");
		}
		else {
			System.out.println("No puede pasar :(");
		}
		
		input.close();
	}
}
