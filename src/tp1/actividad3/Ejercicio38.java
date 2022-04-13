/*
 * 38.Realizá un programa que permita controlar con validación el ingreso a un sitio web.
 * 
 *  
 *  Teniendo
ya precargados un nombre de usuario ("admin") y una contraseña ("123456"), el programa
debe permitir al usuario ingresar sus credenciales. Si las mismas son erróneas, se volverán a
pedir hasta un máximo de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
siguientes mensajes según sea el caso: "Acceso concedido" o "Se ha bloqueado la
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
			System.out.println("Ingrese su contraseña: ");
			String contrasenaIngresada = input.nextLine();

			if (usuarioIngresado.equals(USUARIO) && contrasenaIngresada.equals(CONTRASENA)) {
				logueoSatisfactorio = true;
			} else {
				System.out.println("El usuario o contraseña son incorrectos");
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