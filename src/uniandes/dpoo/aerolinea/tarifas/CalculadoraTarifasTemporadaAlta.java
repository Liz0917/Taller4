package uniandes.dpoo.aerolinea.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class  CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas{
	protected int COSTO_POR_KM= 1000;
	
	
	public Integer calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return (int) (super.calcularCostoBase(vuelo, cliente) * (1 + IMPUESTO));
	}
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return super.calcularPorcentajeDescuento(cliente);
	}
}
