package beans;


public class Movimiento {
     private double cantidad;
     private String fecha;
     private String tipo;
     
	public Movimiento(double cantidad,String fecha,String tipo) {
    	 this.cantidad=cantidad;
    	 this.fecha=fecha;
    	 this.tipo=tipo;
     }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
    public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
