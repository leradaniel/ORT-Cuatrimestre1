/*
 * Actividad Nº 3: Flujo de repetición.
22.Realizá un programa que muestre todos los números enteros del 1 al 5, y luego los mismos
números pero en orden inverso.
 */
package tp1.actividad3;

public class Ejercicio22 {

	public static void main(String[] args) {
		System.out.println("Se van a mostrar los números enteros del 1 al 5:");
		int i = 0;
		while (i < 5) {
			i++;
			System.out.println(i);
			
		}
		System.out.println("Ahora se van a mostrar en el orden inverso:");
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

	}

}
