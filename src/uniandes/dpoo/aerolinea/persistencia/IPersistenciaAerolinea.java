package uniandes.dpoo.aerolinea.persistencia;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public interface IPersistenciaAerolinea {
	
	public void cargarAearolinea (String archivo , Aerolinea aerolinea);
	public void salvarAerolinea (String archivo , Aerolinea aerolinea);
	
}
