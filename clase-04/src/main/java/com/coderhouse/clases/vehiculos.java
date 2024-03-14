package com.coderhouse.clases;

public class vehiculos {
	private static final int CANTIDAD_DE_RUEDAS = 4; // Constante 
	/*atributoos*/
	private int cantidadDeRuedas;
	private String marca;
	private String color;
	private float precio;
	private boolean esElectrico;
	
	
	/*metodos define el comportamiento de una clase*/
	
	public vehiculos() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getCantidadDeRuedas() {
		return this.cantidadDeRuedas;
	}


	public void setCantidadDeRuedas(int cantidadDeRuedas) {
		String mensaje = "La cantidad másxima de ruedas es " + CANTIDAD_DE_RUEDAS;
		if (cantidadDeRuedas > CANTIDAD_DE_RUEDAS) {
			System.out.println("Excede la cantidad permitida. " + mensaje);
		} else {
			
		
		this.cantidadDeRuedas = cantidadDeRuedas;
		}
	}


	public String getMarca() {
		return this.marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return this.color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getPrecio() {
		return this.precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public boolean isEsElectrico() {
		return this.esElectrico;
	}


	public void setEsElectrico(boolean esElectrico) {
		this.esElectrico = esElectrico;
	}


	public void encender () {
		System.out.println("El vehículo está encendido");
	}

	@Override
	public String toString() {
		return "vehiculos [cantidadDeRuedas=" + cantidadDeRuedas + ", marca=" + marca + ", color=" + color + ", precio="
				+ precio + ", esElectrico=" + esElectrico + "]";
	}
	
}
