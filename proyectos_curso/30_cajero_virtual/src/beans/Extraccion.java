package beans;


public class Extraccion extends Movimiento {
	 private final static String tipo="Extracción";
			 
  public String getTipo() {
		return tipo;
	}

public Extraccion(double cantidad, String fecha) {
	  super(cantidad,fecha,tipo);
  }
}
