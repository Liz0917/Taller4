package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	 private String nombre;
	 private int capacidad;
	 
	 public   Avion(String nNombre, int nCapacidad) {
		 this.nombre= nNombre;
		 this.capacidad= nCapacidad;
	 }

	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

}
