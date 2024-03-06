package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    private String horaSalida;
    private String horaLlegada ;
    private String codigoRuta;
    private Aeropuerto origen;
    private Aeropuerto destino;

    
    public Ruta(Aeropuerto nOrigen , Aeropuerto nDestino, String nHoraSalida , String nHoraLlegada, String nCodigoRuta) {
    	this.horaSalida= nHoraSalida;
    	this.horaLlegada = nHoraLlegada;
    	this.codigoRuta= nCodigoRuta;
    	this.destino= nDestino;
    	this.origen= nOrigen;
    	
    }
    
    

    public String getHoraSalida() {
		return horaSalida;
	}


	public String getHoraLlegada() {
		return horaLlegada;
	}


	public String getCodigoRuta() {
		return codigoRuta;
	}


	public Aeropuerto getOrigen() {
		return origen;
	}


	public Aeropuerto getDestino() {
		return destino;
	}


	/**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    public int getDuracion() {
    	//TODO getDuracion()
    	int horasSalida = getHoras(horaSalida);
        int minutosSalida = getMinutos(horaSalida);
        int horasLlegada = getHoras(horaLlegada);
        int minutosLlegada = getMinutos(horaLlegada);

        // Calcular la diferencia en minutos entre la hora de llegada y la hora de salida
        int minutosDuracion = (horasLlegada * 60 + minutosLlegada) - (horasSalida * 60 + minutosSalida);

        return minutosDuracion;
    }
    
    
    
    
    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
