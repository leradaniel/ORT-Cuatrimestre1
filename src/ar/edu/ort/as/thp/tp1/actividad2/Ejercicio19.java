/*
 * 19.Existen dos reglas que identifican dos conjuntos de valores:
a. El n�mero es de un solo d�gito.
b. El n�mero es impar.
A partir de estas reglas, realiz� un programa que permita ingresar un n�mero entero. Debe
asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
estaEnAmbos y noEstaEnNinguno el valor Verdadero o Falso, seg�n corresponda, para indicar si
el valor n�mero ingresado pertenece o no a cada conjunto. Defin� un lote de prueba de varios
n�meros y prob� el algoritmo, escribiendo los resultados tal como se hizo en los ejercicios
anteriores.
 */
package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;

		System.out.println("Ingrese un n�mero entero:");
		int numero = Integer.parseInt(input.nextLine());
		input.close();

		if (numero > -10 && numero < 10) {
			esDeUnSoloDigito = true;
		}

		if (numero % 2 != 0) {
			esImpar = true;
		}

		if (esDeUnSoloDigito && esImpar) {
			estaEnAmbos = true;
		} else if (!esDeUnSoloDigito && !esImpar) {
			noEstaEnNinguno = true;
		}

		System.out.println("Resultados del n�mero ingresado: " + numero);
		System.out.println("esDeUnSoloDigito = " + esDeUnSoloDigito);
		System.out.println("esImpar = " + esImpar);
		System.out.println("estaEnAmbos = " + estaEnAmbos);
		System.out.println("noEstaEnNinguno = " + noEstaEnNinguno);
	}

}
