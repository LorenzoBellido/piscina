package excepciones;

public class TipoEntradaException extends Exception{
	@Override
	public String toString() {
		String res = "Tipo de Entrada Erróneo (NIÑO_1, NIÑO_2, ADULTO_1, ADULTO_2)"; 
		return res;
	}
	
	public String getMessage() {
		String res = "Tipo de Entrada Erróneo (NIÑO_1, NIÑO_2, ADULTO_1, ADULTO_2)"; 
		return res;
	}
}
