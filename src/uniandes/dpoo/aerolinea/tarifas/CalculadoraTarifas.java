package uniandes.dpoo.aerolinea.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	
	public double IMPUESTO=0.28;
	

	//TODO
	public Integer calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return null;
	}
	
	protected Integer calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		return 0.1;
	}
	protected Integer calcularDistanciaVuelo(Ruta ruta) {
		return 0;
	}
	protected Integer calcularValorImpuestos (Integer costoBase) {
		 return (int) (costoBase * IMPUESTO);
		 }
}
