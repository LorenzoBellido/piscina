package clases;

import java.util.ArrayList;

import fichero.Fichero;
import fichero.FicheroA1;

public class GestionAbonado {
	
	public static ArrayList<Abonado> abonados= FicheroA1.leer();
	
	public static boolean anyadirAbonado(Abonado a) {
		boolean res = false;
		if(!abonados.contains(a)) {
			abonados.add(a);
			res = true;
		}
		return res;
	}
	
	public static void listar() {
		for(Abonado a : abonados) {
			System.out.println(a);
		}
	}
	
	public static boolean borrarEntrada(Abonado a) {
		boolean res = false;
		if(abonados.contains(a)) {
			abonados.remove(a);
			res = true;
		}
		return res;
	}
	
	public static void guardar() {
		FicheroA1.escribir(abonados);

	}

}
