package uniandes.dpoo.aerolinea.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;


public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas{
	
	protected int COSTO_POR_KM_NATURAL=600;
	protected int COSTO_POR_KM_CORPORATIVO=900;
	protected double DESCUENTO_PEQ=0.02;
	protected double DESCUENTO_MEDIANAS=0.1;
	protected double DESCUENTO_GRANDES=0.2;
	

	
	@Override
    public Integer calcularTarifa(Vuelo vuelo, Cliente cliente) {
        Integer costoBase = calcularCostoBase(vuelo, cliente);
        Integer distancia = calcularDistanciaVuelo(vuelo.getRuta());
        Integer impuestos = calcularValorImpuestos(costoBase);
        return costoBase + (distancia * (cliente.getTipoCliente().equals("Pequeña") ? COSTO_POR_KM_NATURAL : COSTO_POR_KM_CORPORATIVO)) + impuestos;
    }

    @Override
    protected Integer calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        return (int) (super.calcularCostoBase(vuelo, cliente) * (1 - calcularPorcentajeDescuento(cliente)));
    }

    @Override
    protected double calcularPorcentajeDescuento(Cliente cliente) {
        if (cliente.getTipoCliente().equals("Pequeña")) {
            return DESCUENTO_PEQ;
        } else if (cliente.getTipoCliente().equals("Mediana")) {
            return DESCUENTO_MEDIANAS;
        } else if (cliente.getTipoCliente().equals("Grande")) {
            return DESCUENTO_GRANDES;
        } else {
            return 0.0;
        }
    }
}
