package modelo;

import java.util.ArrayList;

public class GestionNotas {
	ArrayList<Double> notas = new ArrayList<>();
	
	public void agregarNota(double d) {
		notas.add(d);
	}
	
	public int aprobados() {
		int ap=0;
		for (Double n:notas) {
			if (n>=5) {
				ap++;
			}
		}
		return ap;
	}
	
	
	public double media() {
		double media=0;
		for (double n:notas) {
			media+=n;
		}
		return media/notas.size();
	}
	
	public Double[] devolverNotas() {
		//return (Double[]) notas.toArray();
		
		return notas.toArray(new Double[0]);
		
	}
	
}
