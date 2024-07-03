package clases;

import excepciones.TipoBonoException;

public class Abonado {
	
	enum duracionBono {
		TEMPORADA_1, TEMPORADA_2, MENSUAL_1, MENSUAL_2, QUINCENAL_1, QUINCENAL_2, QUINCENAL_3
		}
	
	enum tipoBono {
		FAMILIAR_1, FAMILIAR_2, INDIVIDUAL_1, INDIVIDUAL_2
	}

	private String nombreCompleto = "";
	private duracionBono duracion;
	private tipoBono tipo; 
	private boolean bonoVigente = true;
	private String fecha = "";
	private double precio;
	private double pagoTaquilla = 0;
	
	
	public Abonado(String nombreCompleto) {
		if(!nombreCompleto.equals("")) {
			this.nombreCompleto = nombreCompleto;			
		}
	}


	public Abonado(String nombreCompleto, String duracion, String tipo, boolean bonoVigente, String fecha,
			double precio, double pagoTaquilla) {
		this(nombreCompleto);
		comprobarDuracion(duracion);
		comprobarTipo(tipo);
		this.bonoVigente = bonoVigente;
		this.fecha = fecha;
		this.precio = precio;
		this.pagoTaquilla = pagoTaquilla;
	}

	private void comprobarTipo(String tipoB) {

		try {
			this.tipo = tipo.valueOf(tipoB);
		} catch (IllegalArgumentException e) {
			this.tipo = tipo.INDIVIDUAL_1;
		}
	}
	
	private void comprobarDuracion(String duracionB) {

		try {
			this.duracion = duracion.valueOf(duracionB);
		} catch (IllegalArgumentException e) {
			this.duracion = duracion.QUINCENAL_1;
		}
	}


	@Override
	public String toString() {
		return "Abonado [nombreCompleto=" + nombreCompleto + ", duracion=" + duracion + ", tipo=" + tipo
				+ ", bonoVigente=" + bonoVigente + ", fecha=" + fecha + ", precio=" + precio + ", pagoTaquilla="
				+ pagoTaquilla + "]";
	}
	
	
	
	
	
}
