package com.coderhouse;

public class OperadorTernario {

	public static void main(String[] args) {
		/*
		String mensaje1 = "Hola Mundo";
		String mensaje2 = "Adiós Mundo";
		boolean condicion = true;
		String mensaje;
		
		mensaje = condicion ? mensaje1 : mensaje2;
		
		System.out.println("mensaje = " + mensaje);
*/
		int valorA = 10;
		int valorB = 20;
		int resultado;
		boolean condicion = true; 
		resultado = condicion 
				? //if 
				valorA 
				: //else
				valorB; /*true : false hablando buleanos*/
		
		System.out.println("resultado = " + resultado);
		
	}

}
