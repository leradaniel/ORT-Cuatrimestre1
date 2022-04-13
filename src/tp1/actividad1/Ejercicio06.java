/*
 * 6. Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
cobrar por el vendedor.

 */
package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el monto total de las ventas del vendedor: ");
		double montoVentas = input.nextDouble();
		double gananciasVentas = 16 * montoVentas / 100;
		double montoACobrar = 44000 + gananciasVentas;
		System.out.println("El vendedor cobró: $" + montoACobrar
				+ ". Su sueldo fue de $44000 y las ganancias fueron de $" + gananciasVentas);
		input.close();
	}

}
