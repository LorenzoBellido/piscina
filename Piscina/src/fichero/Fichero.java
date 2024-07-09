package fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

import clases.Entrada;

public class Fichero {

	private static final String ruta = "src/datos/entradas.txt";
	
	public static ArrayList<Entrada> leer(){
	
		ArrayList<Entrada> lista =  new ArrayList<>();
			try {
				BufferedReader br = new BufferedReader(new FileReader(ruta));
				String linea;
				String[] valores;
				Entrada e;
				while((linea = br.readLine()) != null) {
					valores = linea.split(";");
					e = new Entrada(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]),valores[2], String.valueOf(valores[3]), Boolean.parseBoolean(valores[4]), Double.parseDouble(valores[5]));
					lista.add(e);
				}
			} catch (FileNotFoundException e) {
				System.out.println("Archivo no encontrado");
			} catch (IOException e) {
				System.out.println("Problema con la entrada o salida de datos");
			}
			
			return lista;		
	}
	
	public static void escribir(ArrayList<Entrada> lista) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
			for(Entrada e : lista) {
				bw.write(e.getId() + ";" + e.getCantidad() + ";" + e.getFecha() + ";" + e.getTipo() + ";" + (e.isEspecial() ? "Sí" : "No")+ ";" + e.getPrecio());
				bw.newLine();
				
			}
		} catch (IOException e) {
			System.out.println("Problema con la entrada o salida de datos");
		}finally {
			try {
				BufferedWriter bw = null;
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("Problema con la entrada o salida de datos");
			}
			
		}
	}
}
