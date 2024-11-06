package ejercicicios;

import java.time.LocalDate;
import java.util.Scanner;



public class ej27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		do {
	    LocalDate fechaUsuario = Funciones.dimeFecha("Introduce tu fecha de nacimiento", sc);
		System.out.println("1.Calcular edad en días");
		System.out.println("2.Calcular edad en meses");
		System.out.println("3.Mostrar edad completa (años, meses y días)");
		System.out.println("4.Calcula días al próximo cumpleaños");
		System.out.println("0.Salir");
		opcion =Funciones.dimeEntero("Elige una opción", sc);
		

		
		switch(opcion) {
		case 1:
			System.out.println( Funciones.edadDias(fechaUsuario));
			break;
		
		case 2:
			System.out.println( Funciones.edadMeses(fechaUsuario));
			break;
		case 3:
			System.out.println(Funciones.edadCompleta(fechaUsuario));
		break;
			
		case 4:
			System.out.println(Funciones.proxCumpleaños(fechaUsuario));
		break;
		
		case 0:
			
		}
	
		
		}while(opcion!=0);

	}
	

}
