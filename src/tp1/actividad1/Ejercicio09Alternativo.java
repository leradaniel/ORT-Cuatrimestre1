/*Realiz� un programa que permita ingresar dos n�meros que representan las medidas en grados
de dos �ngulos interiores de cierto tri�ngulo. A partir de los valores de estos dos �ngulos
el programa debe mostrar el valor en grados del �ngulo restante. Record� que la
suma de los �ngulos interiores de todo tri�ngulo es de 180�*/

package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio09Alternativo {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		
		double primerAngulo, segundoAngulo,tercerAngulo;
		final int anguloT = 180; 
		
		System.out.println("Ingrese el primer angulo");
		primerAngulo = Double.parseDouble (input.nextLine());
		
		System.out.println("Ingrese el segundo angulo");
		segundoAngulo = Double.parseDouble (input.nextLine());
		
		input.close();
		
		tercerAngulo = anguloT - (primerAngulo + segundoAngulo);
		 
		 System.out.println("El valor del tercer angulo es: " + tercerAngulo + "�");
		
	}
}