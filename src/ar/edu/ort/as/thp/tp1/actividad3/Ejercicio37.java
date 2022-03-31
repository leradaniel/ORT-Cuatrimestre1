/*
 * 37.Realizá un programa que permita al usuario ingresar hasta 12 valores, de a uno por vez, que representan los sueldos mensuales que percibió un empleado durante un año calendario. Si durante la carga de los sueldos mensuales se detecta un valor negativo, esto indica que aún no se ha cobrado el mes en curso, y en ese caso se debe dejar de ingresar datos. Al finalizar mostrar el monto percibido por el empleado hasta ese momento (total o parcial).
 */
package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio37 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		final int CANTMAX_VALORES = 12;
		System.out.println("Se le va a pedir hasta 12 sueldos para calcular su total");
		int i = 0;
		Double valorIngresado = 0.0;
		Double valorTotal = 0.0;
		while (i < CANTMAX_VALORES && valorIngresado >= 0) {
			System.out.println("Ingrese un valor:");
			valorIngresado = Double.parseDouble(input.nextLine());
			if (valorIngresado >= 0) {
				valorTotal += valorIngresado;
				i++;
			}
		}

		if (i == CANTMAX_VALORES) {
			System.out.println("Se ingresó la cantiad máxima de sueldos.");
			System.out.println("El total es de: " + valorTotal);

		} else {
			System.out.println("Se terminó el programa antes de tiempo.");
			System.out.println("La suma parcial es de:" + valorTotal);
		}
		input.close();

	}
}
