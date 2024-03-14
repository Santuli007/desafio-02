package com.coderhouse.clases;

public class TestVehiculo2 {

	public static void main(String[] args) {

		vehiculos auto = new vehiculos ();
		auto.setCantidadDeRuedas(4);
		auto.setColor("Verde");
		auto.setMarca("Chevrolet");
		auto.setPrecio(2000);
		auto.setEsElectrico(false);
		System.out.println("auto = " + auto);
		System.out.println("Enciende el auto?");
		auto.encender();
	}

}
