package modelo;

public class Cuenta {
	private double saldo;
	
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}
	
	public void ingresar(double cant) {
		saldo+=cant;
	}
	
	public void sacar(double cant) {
		saldo-=cant;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
