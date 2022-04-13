/*Realizá un programa que permita ingresar dos números que representan las medidas en grados
de dos ángulos interiores de cierto triángulo. A partir de los valores de estos dos ángulos
el programa debe mostrar el valor en grados del ángulo restante. Recordá que la
suma de los ángulos interiores de todo triángulo es de 180º*/

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
		 
		 System.out.println("El valor del tercer angulo es: " + tercerAngulo + "°");
		
	}
}