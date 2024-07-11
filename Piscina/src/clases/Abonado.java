package clases;

import java.util.Objects;

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
	private String fecha;
	private double precio;
	private double pagoTaquilla = 0;
	
	
	public Abonado(String nombreCompleto) {
		if(!nombreCompleto.equals("")) {
			this.nombreCompleto = nombreCompleto;			
		}
	}
	
	public Abonado(String nombreCompleto, String fecha) {
		this(nombreCompleto);
		comprobarFecha(fecha);
		}


	public Abonado(String nombreCompleto, String duracion, String tipo, boolean bonoVigente, String fecha,
			double precio, double pagoTaquilla) {
		this(nombreCompleto);
		comprobarDuracion(duracion);
		comprobarTipo(tipo);
		this.bonoVigente = bonoVigente;
		if(comprobarFecha(fecha)) {
			this.fecha = fecha;
		}
		this.precio = precio;
		this.pagoTaquilla = pagoTaquilla;
	}
	
	

	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public duracionBono getDuracion() {
		return duracion;
	}


	public tipoBono getTipo() {
		return tipo;
	}


	public boolean isBonoVigente() {
		return bonoVigente;
	}


	public String getFecha() {
		return fecha;
	}


	public double getPrecio() {
		return precio;
	}


	public double getPagoTaquilla() {
		return pagoTaquilla;
	}

	
	public boolean comprobarFecha(String fecha) {
		boolean correcto = false;
		String guardar[] = null;
		guardar = fecha.split("/");
		int dia = Integer.parseInt(guardar[0]);
		int mes = Integer.parseInt(guardar[1]);
		int anio = Integer.parseInt(guardar[2]);

		if (dia > 0 && dia < 31) {
			correcto = true;
		}

		if (mes > 0 && mes < 13) {
			correcto = true;
		}

		if (anio > 0) {
			correcto = true;
		}

		return correcto;
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
	public boolean equals(Object obj) {
		boolean res = false;
		Abonado a = (Abonado) obj;
		if(this.nombreCompleto.equals(a.nombreCompleto)) {
			if(this.fecha.equals(a.fecha)) {
				res = true;
			}
		}
		return res;
	}


	@Override
	public String toString() {
		String res = "";
		res += "Nombre: " + nombreCompleto + "\n" +  "Duración: " + duracion + "\n" +  "Tipo: " + tipo + "\n" +  "Vigente: " + (bonoVigente? "Si" : "No") + "\n" +  "Fecha: " + fecha + "\n" + "Precio: " + precio + "\n" + "Pago en Taquilla: " + pagoTaquilla + "\n";
		return res;
	}
	
	
	
	
	
}
