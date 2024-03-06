package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
	
	public String NATURAL;
	private String nombre;
	
	
	
	public ClienteNatural ( String nNombre) {
		
		this.nombre= nNombre;
		this.NATURAL= "Natural";	
	}
	
	@Override
	
	public String getIdentificador() {
		return super.getIdentificador();
		}
	public String getTipoCliente() {
		return super.getTipoCliente();
		}
}
