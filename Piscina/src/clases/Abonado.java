package clases;

public class Abonado {
	
	enum duracionBono {
		TEMPORADA_1, TEMPORADA_2, MENSUAL_1, MENSUAL_2, QUINCENAL_1, QUINCENAL_2
		}
	
	enum tipoBono {
		FAMILIAR_1, FAMILIAR_2, INDIVIDUAL_1, INDIVIDUAL_2
	}

	private String nombreCompleto = "";
	private duracionBono duracion;
	private tipoBono tipo;  
}
