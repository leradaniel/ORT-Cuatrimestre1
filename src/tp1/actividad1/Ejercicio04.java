/*
 * 4. Realizá un programa que permita ingresar el valor monetario de una hora de trabajo y la
cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario
semanal, sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los
sábados. (Todas las horas valen lo mismo.)
 */
package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Se va a calcular el salario semanal de un empleado");
		System.out.println("Ingrese el valor que gana por hora: ");
		double salarioPorHora = input.nextDouble();
		System.out.println("Ingrese cuántas horas trabaja por día: ");
		double horasPorDia = input.nextDouble();
		double salarioDiario = salarioPorHora * horasPorDia;
		double salarioSemanal = salarioDiario * 5 + salarioDiario / 2;
		System.out.println("Salario: " + salarioSemanal);
		input.close();
	}

}
