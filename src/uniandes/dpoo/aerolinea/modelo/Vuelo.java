package uniandes.dpoo.aerolinea.modelo;

import java.util.ArrayList;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private String fecha;
	private Ruta ruta;
	private Avion avion ; 
	private ArrayList<Tiquete> tiquetes;
	
	
	public Vuelo (Ruta nRuta, String  nFecha, Avion nAvion ) {
		
		this.ruta= nRuta ;
		this.fecha= nFecha ;
		this.avion= nAvion;
		
	}
	
	
	public Avion getAvion() {
		return avion;
	}
	
	
	public String getFecha() {
		return this.fecha;
	}
	
	public Ruta getRuta() {
		return this.ruta;
	}


	public ArrayList<Tiquete> getTiquetes() {
		return tiquetes;
	}


	public Integer venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		int valorTotal = calculadora.calcularTarifa(this, cliente);
		
		for (int i = 0; i < cantidad; i++) {
			Tiquete nuevoTiquete = GeneradorTiquetes.generarTiquete(this, cliente, valorTotal);
			tiquetes.add(nuevoTiquete);
			GeneradorTiquetes.registrarTiquete(nuevoTiquete);
		}
		
		return valorTotal;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Vuelo other = (Vuelo) obj;
		return fecha.equals(other.fecha) && ruta.equals(other.ruta) && avion.equals(other.avion);
	}
}


