package listarPersonasSanchezSantiago;

public class persona {
		private String nombre;
		private String apellido;
		//clases privadas para proteccion de datos
		public persona() {
			//clase publica para poder utilizar los atributos string del objeto en otra clase
			super();
			
		}
			//Aquí defino getters and setters
		public String getNombre() {
			return this.nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return this.apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
	    @Override
	    public String toString() {
	        return "[Nombre y apellido= " + nombre + " " + apellido + "]\n";
	    }
	    //El override sirve para imprimir los nombres de la forma que quiero. 
	    //De no usarlo imprime la ubicación del objeto
}
