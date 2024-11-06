package ejercicicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
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
				System.out.println("Introduce una fecha cohe" + "rente");
			}

		} while (true);
	}

	public static int edadDias(LocalDate fecha) {
		LocalDate ld1 = LocalDate.now();
		int dias = (int) ChronoUnit.DAYS.between(fecha, ld1);
		return Math.abs(dias);

	}

	public static int edadMeses(LocalDate fecha) {
		LocalDate ld1 = LocalDate.now();
		int meses = (int) ChronoUnit.MONTHS.between(fecha, ld1);

		return Math.abs(meses);
	}

	public static int dimeEntero(String texto, Scanner sc) { // para validar
		do {
			try {

				System.out.println(texto);
				String orden = sc.nextLine();
				int num = Integer.parseInt(orden);
				return num;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Introduce un número,no letras");
			}

		} while (true);
	}

	public static String edadCompleta(LocalDate fecha) {
		LocalDate ld1 = LocalDate.now();
		Period p = Period.between(fecha, ld1);
		int años = p.getYears();
		long dias = p.getDays();
		int meses = p.getMonths();
		return ("Días: " + dias + " Meses: " + meses + " Años: " + años);

	}

	public static int proxCumpleaños(LocalDate fecha) {
		LocalDate ld1 = LocalDate.now();

		LocalDate cumple = LocalDate.of(ld1.getYear(), fecha.getMonth(), fecha.getDayOfMonth());
		int dias= (int) ChronoUnit.DAYS.between(cumple, ld1);
		return Math.abs(dias);
		
	}
}
