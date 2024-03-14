package com.coderhouse;

public class EjerciciosSwitch {

	public static void main(String[] args) {
		int diaDeLaSemana = 4;
		String nombreDelDia;
		
		switch (diaDeLaSemana) {
		case 1: nombreDelDia = "Domingo";
				break;
		case 2: nombreDelDia = "Lunes";
				break;
		case 3: nombreDelDia = "Martes";
				break;
		case 4: nombreDelDia = "Miércoles";
				break;
		case 5: nombreDelDia = "Jueves";
				break;
		case 6: nombreDelDia = "Viernes";
				break;
		case 7: nombreDelDia = "Sábado";
				break;
		default: nombreDelDia = "Osvaldo";
				break;
		}
		System.out.println("Nombre del día " + nombreDelDia);

	}
}