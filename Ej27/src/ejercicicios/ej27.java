package ejercicicios;

import java.time.LocalDate;
import java.util.Scanner;

public class ej27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		LocalDate fechaUsuario = Funciones.dimeFecha("Introduce tu fecha de nacimiento", sc);
		do {
		
			System.out.println("1.Calcular edad en d�as");
			System.out.println("2.Calcular edad en meses");
			System.out.println("3.Mostrar edad completa (a�os, meses y d�as)");
			System.out.println("4.Calcula d�as al pr�ximo cumplea�os");
			System.out.println("0.Salir");
			opcion = Funciones.dimeEntero("Elige una opci�n", sc);

			switch (opcion) {
			case 1:
				System.out.println(Funciones.edadDias(fechaUsuario));
				break;

			case 2://calcula la edad en meses
				System.out.println(Funciones.edadMeses(fechaUsuario));
				break;
			case 3:
				System.out.println(Funciones.edadCompleta(fechaUsuario));
				break;

			case 4:
				System.out.println(Funciones.proxCumplea�os(fechaUsuario));
				break;

			case 0:
				break;
				default:
					System.out.println("Opci�n no valida");
			}

		} while (opcion != 0);

	}

}
