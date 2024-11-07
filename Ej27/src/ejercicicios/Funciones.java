package ejercicicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class Funciones {
	private static final Temporal ld1 = null;
	private static final Temporal cumpleEsteAño = null;
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
		return ("Días: " + dias + ", Meses: " + meses + " , Años: " + años);

	}

	public static int proxCumpleaños(LocalDate fecha) {
		LocalDate ld1 = LocalDate.now();

		LocalDate cumpleEsteAño = LocalDate.of(ld1.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth());
		if(cumpleEsteAño.isAfter(ld1)){
			System.out.println("Futuro");
		}
		else {
			cumpleEsteAño=cumpleEsteAño.plusYears(1);
			System.out.println("Pasado");
		}
	
		int dias= (int) ChronoUnit.DAYS.between(ld1, cumpleEsteAño);
		return Math.abs(dias);
		
	}
}
