package clases;

public class Entrada {
	
	enum tipoEntrada {
		NIÑO, ADULTO, NIÑO_F, ADULTO_F
	}

	private int id;
	private int cantidad;
	private String fecha;
	private tipoEntrada tipo;
	private boolean especial = false;
	private double precio;
	
	public Entrada(int id, int cantidad, String tipo, boolean especial) {
		if(id > 0) {
			this.id = id;
		}
		if(cantidad > 0) {
			this.cantidad = cantidad;
		}
		
		comprobarTipo(tipo);
		this.especial = especial;
	}

	public Entrada(int id, int cantidad, String fecha, String tipo, boolean especial, double precio) {
		if(id > 0) {
			this.id = id;
		}
		if(cantidad > 0) {
			this.cantidad = cantidad;
		}
		if(comprobarFecha(fecha)) {
			this.fecha = fecha;
		}
		comprobarTipo(tipo);
		this.especial = especial;
		if(precio > 0) {
			this.precio = precio;
		}
		
	}
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public tipoEntrada getTipo() {
		return tipo;
	}

	public void setTipo(tipoEntrada tipo) {
		this.tipo = tipo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	private void comprobarTipo(String tipoE) {
		try {
			this.tipo = tipoEntrada.valueOf(tipoE);
		} catch (IllegalArgumentException e) {
			this.tipo = tipo.ADULTO;
		}
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

	@Override
	public String toString() {
		String res = "";
		res += "Entrada: " + this.id + "\n" +
				"Cantidad: " + this.cantidad + "\n" +
				"Fecha: " + this.fecha + "\n" +
				"Tipo: " + this.tipo + "\n" +
				"Especial: " + (this.especial ? "Si" : "No") + "\n" +
				"Precio: " + this.precio + "\n";
		return res;
	}
	
	
	
}
