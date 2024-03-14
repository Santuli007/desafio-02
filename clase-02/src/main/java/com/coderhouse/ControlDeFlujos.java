package com.coderhouse;

public class ControlDeFlujos {

	public static void main(String[] args) {
		float NroA = 4;
		float NroB = 0;
		
		float division = NroA / NroB;
		
		if (NroB > 0) { 
			System.out.println("Operación con números positivos = " + division);
		} else if (NroB < 0){
			System.out.println("Operación con números negativos = " + division);
		} else {
			System.out.println("No se puede dividir por 0");
		}
		
	}

}
