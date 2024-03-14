package com.coderhouse.test;

public class ConstantesTest {

		static final double PI;
		static final int RADIO;
		static {
			PI = 3.141559265358979;
			RADIO = 4;
		}
		//calcular el area de un circulo
	public static void main(String[] args) {
		System.out.println("El área del círculo con RADIO " + RADIO + " es de: "
				+ calcularAreaCirculo (RADIO));
		
		
	
	}
private static double calcularAreaCirculo (int radio) {
	return PI * Math.pow(RADIO, 2); 
}
}
