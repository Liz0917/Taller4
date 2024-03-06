package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	
	
	public Tiquete(String nCodigo, Vuelo nVuelo, Cliente nClienteComprador, int nTarifa ) {
		this.codigo= nCodigo;
		this.vuelo = nVuelo;
		this.cliente= nClienteComprador;
		this.tarifa = nTarifa;
	}


	public String getCodigo() {
		return codigo;
	}


	public int getTarifa() {
		return tarifa;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void marcarComoUsado() {
		this.usado = true;
	}

	public boolean esUsado() {
		return this.usado;
	}

	
	
}
