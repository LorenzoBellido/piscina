package excepciones;

public class DuracionBonoException extends Exception{
	@Override
	public String toString() {
		String res = "Duración de Bono Errónea (TEMPORADA_1, TEMPORADA_2, MENSUAL_1, MENSUAL_2, QUINCENAL_1, QUINCENAL_2)"; 
		return res;
	}
	
	public String getMessage() {
		String res = "Duración de Bono Errónea (TEMPORADA_1, TEMPORADA_2, MENSUAL_1, MENSUAL_2, QUINCENAL_1, QUINCENAL_2)"; 
		return res;
	}
}
