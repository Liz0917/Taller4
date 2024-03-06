package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Cliente {
	
	private ArrayList<Tiquete> tiquetesSinUsar= new ArrayList<Tiquete>() ;
	private ArrayList<Tiquete> tiquetesUsados= new ArrayList<Tiquete>() ;
	
	
	public  Cliente() {}
	public String getTipoCliente() {
		return null;
		
	}
	
	public String getIdentificador(){
		return null;
	} 
	
	public void agregarTiquete(Tiquete tiquete) {
		
	}
	
	
	public Integer calcularValorTotal() {
		return  null;
	}
	
	public void usarTiquetes ( Vuelo vuelo) {
		
	}
	public Collection<Tiquete> getTiquetesSinUsar() {
		return this.tiquetesSinUsar;
	}
	public Collection<Tiquete> getTiquetesUsados() {
		return this.tiquetesUsados;
	}
	
}	
	
