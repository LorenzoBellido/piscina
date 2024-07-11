package principal;

import clases.Abonado;
import clases.GestionAbonado;
import fichero.FicheroA1;

public class Main {

	public static void main(String[] args) {
		
		
		Abonado a = new Abonado("Lorenzo Bellido Barrena", "TEMPORADA_0", "INDIVIDUAL_1", false, "11/07/2024", 55, 55);

		
		GestionAbonado.anyadirAbonado(a);
		GestionAbonado.listar();
		GestionAbonado.guardar();
	}

}
