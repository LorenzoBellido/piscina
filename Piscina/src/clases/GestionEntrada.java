package clases;

import java.util.ArrayList;

import fichero.Fichero;

public class GestionEntrada {
	
	public static ArrayList<Entrada> entradas= new ArrayList<Entrada>();
	
	public static boolean anyadirEntrada(Entrada e) {
		boolean res = false;
		if(!entradas.contains(e)) {
			entradas.add(e);
			res = true;
		}
		return res;
	}
	
	public static void listar() {
		for(Entrada e : entradas) {
			System.out.println(e);
		}
	}
	
	public static boolean borrarEntrada(Entrada e) {
		boolean res = false;
		if(entradas.contains(e)) {
			entradas.remove(e);
			res = true;
		}
		return res;
	}
	
	public static void guardar() {
		Fichero.escribir(entradas);

	}

}
