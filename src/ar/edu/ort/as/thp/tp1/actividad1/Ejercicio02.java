/*
 * 2. Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio
 */
package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Se va a calcular el promedio de sus 3 notas");
		System.out.println("Ingrese su primera nota: ");
		double nota1 = input.nextDouble();
		System.out.println("Ingrese su segunda nota: ");
		double nota2 = input.nextDouble();
		System.out.println("Ingrese su tercera nota: ");
		double nota3 = input.nextDouble();
		double promedio = (nota1 + nota2 + nota3) / 3;
		System.out.println("Su promedio es de " + promedio);
		input.close();
	}

}
