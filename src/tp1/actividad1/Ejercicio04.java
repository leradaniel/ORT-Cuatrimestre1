/*
 * 4. Realiz� un programa que permita ingresar el valor monetario de una hora de trabajo y la
cantidad de horas trabajadas por d�a por un trabajador. Debes mostrar el valor del salario
semanal, sabiendo que trabaja todos los d�as h�biles y la mitad de las horas del d�a h�bil los
s�bados. (Todas las horas valen lo mismo.)
 */
package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Se va a calcular el salario semanal de un empleado");
		System.out.println("Ingrese el valor que gana por hora: ");
		double salarioPorHora = input.nextDouble();
		System.out.println("Ingrese cu�ntas horas trabaja por d�a: ");
		double horasPorDia = input.nextDouble();
		double salarioDiario = salarioPorHora * horasPorDia;
		double salarioSemanal = salarioDiario * 5 + salarioDiario / 2;
		System.out.println("Salario: " + salarioSemanal);
		input.close();
	}

}
