package ejercicicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Funciones {
	public static LocalDate dimeFecha(String Texto, Scanner sc) {

		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do {
			try {

				System.out.println(Texto);
				String fechaTexto = sc.nextLine();
				LocalDate fecha = LocalDate.parse(fechaTexto, formato1);

				return fecha;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Introduce una fecha coherente");
			}

		} while (true);
	}

	public static int edadDias(LocalDate fecha, Scanner sc) {
		LocalDate ld1 = LocalDate.now();
		int dias = (int) ChronoUnit.DAYS.between(fecha, ld1);
		return Math.abs(dias);
	
	}
	public static int edadMeses(LocalDate fecha ,Scanner sc) {
		LocalDate ld1 = LocalDate.now();
		int meses = (int) ChronoUnit.MONTHS.between(fecha, ld1);

		return Math.abs(meses);
	}
	
}
