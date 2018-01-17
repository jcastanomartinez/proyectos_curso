package beans;


public class Ingreso extends Movimiento {

	 private final static String tipo="Ingreso";
	 
	public String getTipo() {
		return tipo;
	}

	public Ingreso(double cantidad,String fecha) {
		super(cantidad,fecha,tipo);
		
	}
}
