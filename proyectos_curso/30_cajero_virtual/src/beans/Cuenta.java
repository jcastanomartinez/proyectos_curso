package beans;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
  private double saldo;
  private final double limite=600;
  private List<Movimiento>	movimientos= new ArrayList<Movimiento>();
  
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public List<Movimiento> getMovimientos() {
	return movimientos;
}
public void setMovimientos(List<Movimiento> movimientos) {
	this.movimientos = movimientos;
}
public double getLimite() {
	return limite;
}
}
