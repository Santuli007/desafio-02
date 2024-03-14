package com.coderhouse.test;

import com.coderhouse.clases.vehiculos;

public class TestVehiculos {

	public static void main(String[] args) {
		vehiculos auto = new vehiculos ();
		
		System.out.println("auto = " + auto);
		
		/*auto.cantidadDeRuedas = 4;
		auto.color = "Verde";
		auto.marca = "Chevrolet";
		auto.precio = 2000;
		auto.esElectrico = false;*/
		auto.setCantidadDeRuedas(4);
		auto.setColor("Verde");
		auto.setMarca("Chevrolet");
		auto.setPrecio(2000);
		auto.setEsElectrico(false);
		System.out.println("auto = " + auto);

	}

}

