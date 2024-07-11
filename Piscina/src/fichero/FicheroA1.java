package fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import clases.Abonado;




public class FicheroA1 {

	private static final String ruta = "src/datos/abonos1.txt";
	private static BufferedReader br = null;
	private static BufferedWriter bw = null;
	
	public static ArrayList<Abonado> leer(){
	
		ArrayList<Abonado> lista =  new ArrayList<>();
			try {
				br = new BufferedReader(new FileReader(ruta));
				String linea;
				String[] valores;
				Abonado a;
				while((linea = br.readLine()) != null) {
					valores = linea.split(";");
					a = new Abonado(valores[0], valores[1], valores[2], Boolean.parseBoolean(valores[3]), valores[4], Double.parseDouble(valores[5]), Double.parseDouble(valores[6]));
					lista.add(a);
				}
			} catch (FileNotFoundException e) {
				System.out.println("Archivo no encontrado");
			} catch (IOException e) {
				System.out.println("Problema con la entrada o salida de datos");
			}
			
			return lista;		
	}
	
	public static void escribir(ArrayList<Abonado> lista) {
		try {
			bw = new BufferedWriter(new FileWriter(ruta));
			for(Abonado a : lista) {
				bw.write(a.getNombreCompleto()+ ";" +a.getDuracion()+ ";" +a.getTipo()+ ";" +(a.isBonoVigente() ? "Si" : "No")+ ";" + a.getFecha()+ ";" + a.getPrecio()+ ";" + a.getPagoTaquilla());
				bw.newLine();
				
			}
		} catch (IOException e) {
			System.out.println("Problema con la entrada o salida de datos");
		}finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("Problema con la entrada o salida de datos");
			}
			
		}
	}
}
