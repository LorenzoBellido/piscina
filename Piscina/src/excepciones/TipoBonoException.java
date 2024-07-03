package excepciones;

public class TipoBonoException extends Exception{
	@Override
	public String toString() {
		String res = "Tipo de Bono Erróneo (FAMILIAR_1, FAMILIAR_2, INDIVIDUAL_1, INDIVIDUAL_2)"; 
		return res;
	}
	
	public String getMessage() {
		String res = "Tipo de Bono Erróneo (FAMILIAR_1, FAMILIAR_2, INDIVIDUAL_1, INDIVIDUAL_2)"; 
		return res;
	}
}
