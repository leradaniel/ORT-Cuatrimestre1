/*
 * 1. Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir
una salida con un mensaje de bienvenida que incluya el nombre ingresado. 
 */
package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nombre;
		System.out.println("Ingrese su nombre: ");
		nombre = input.nextLine();
		System.out.println("Bienvenido " + nombre);
		input.close();
	}

}