package beans;


public class Extraccion extends Movimiento {
	 private final static String tipo="Extracci�n";
			 
  public String getTipo() {
		return tipo;
	}

public Extraccion(double cantidad, String fecha) {
	  super(cantidad,fecha,tipo);
  }
}
