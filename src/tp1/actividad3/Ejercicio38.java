/*
 * 38.Realiz� un programa que permita controlar con validaci�n el ingreso a un sitio web.
 * 
 *  
 *  Teniendo
ya precargados un nombre de usuario ("admin") y una contrase�a ("123456"), el programa
debe permitir al usuario ingresar sus credenciales. Si las mismas son err�neas, se volver�n a
pedir hasta un m�ximo de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
siguientes mensajes seg�n sea el caso: "Acceso concedido" o "Se ha bloqueado la
cuenta"
 */
package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		final String USUARIO = "admin";
		final String CONTRASENA = "123456";

		int intentos = 3;
		boolean logueoSatisfactorio = false;

		while (intentos > 0 && !logueoSatisfactorio) {
			System.out.println("Ingrese su usuario: ");
			String usuarioIngresado = input.nextLine();
			System.out.println("Ingrese su contrase�a: ");
			String contrasenaIngresada = input.nextLine();

			if (usuarioIngresado.equals(USUARIO) && contrasenaIngresada.equals(CONTRASENA)) {
				logueoSatisfactorio = true;
			} else {
				System.out.println("El usuario o contrase�a son incorrectos");
				intentos--;
				if (intentos > 0)
				{
					System.out.println("Intente nuevamente.");
				}
			}
		}

		if (logueoSatisfactorio) {
			System.out.println("Acceso concedido.");
		} else {
			System.out.println("Se ha bloqueado la cuenta.");
		}
		input.close();
	}
}