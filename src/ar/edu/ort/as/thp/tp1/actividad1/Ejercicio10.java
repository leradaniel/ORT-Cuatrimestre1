/*
 * 10.Realizá un programa que permita resolver el siguiente problema: Tres personas aportan
diferente capital a una sociedad y desean saber el valor total aportado y qué porcentaje
aportó cada una (indicando nombre y porcentaje). Solicitar la carga por teclado del nombre
de cada socio, su capital aportado y a partir de esto calcular e informar lo requerido
previamente
 */
package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el nombre del primer socio: ");
		String nombre1 = input.nextLine();
		System.out.println("Ingrese el monto aportado por " + nombre1 + ": ");
		double monto1 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el nombre del segundo socio: ");
		String nombre2 = input.nextLine();
		System.out.println("Ingrese el monto aportado por " + nombre2 + ": ");
		double monto2 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el nombre del tercer socio: ");
		String nombre3 = input.nextLine();
		System.out.println("Ingrese el monto aportado por " + nombre3 + ": ");
		double monto3 = Double.parseDouble(input.nextLine());
		double montoTotal = monto1 + monto2 + monto3;
		double porcentaje1 = monto1 * 100 / montoTotal;
		double porcentaje2 = monto2 * 100 / montoTotal;
		double porcentaje3 = monto3 * 100 / montoTotal;
		System.out.println("El valor total aportado es de $" + montoTotal);
		System.out.println(nombre1 + " aportó el %" + porcentaje1 + " con $" + monto1);
		System.out.println(nombre2 + " aportó el %" + porcentaje2 + " con $" + monto2);
		System.out.println(nombre3 + " aportó el %" + porcentaje3 + " con $" + monto3);
		input.close();
	}

}
