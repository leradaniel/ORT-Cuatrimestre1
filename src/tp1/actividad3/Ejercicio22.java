/*
 * Actividad N� 3: Flujo de repetici�n.
22.Realiz� un programa que muestre todos los n�meros enteros del 1 al 5, y luego los mismos
n�meros pero en orden inverso.
 */
package tp1.actividad3;

public class Ejercicio22 {

	public static void main(String[] args) {
		System.out.println("Se van a mostrar los n�meros enteros del 1 al 5:");
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
