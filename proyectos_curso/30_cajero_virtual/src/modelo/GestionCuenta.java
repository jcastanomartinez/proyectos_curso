package modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import beans.Cuenta;
import beans.Extraccion;
import beans.Ingreso;
import beans.Movimiento;

public class GestionCuenta {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	Cuenta cuenta=new Cuenta();
	
	
	public void ingresar(double cant) {
		cuenta.setSaldo(cuenta.getSaldo()+(cant));	
		Movimiento ingreso = new Ingreso(cant,dateFormat.format(date));
		cuenta.getMovimientos().add(ingreso);
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public boolean sacar(double cant) {
	 if (cuenta.getSaldo() <= 0) {
		 return false;
		
	 } else {
		 if (cant <= cuenta.getLimite()){
			 cuenta.setSaldo(cuenta.getSaldo()-cant);
				Movimiento extracto = new Extraccion((cant*-1),dateFormat.format(date));
				cuenta.getMovimientos().add(extracto);
				return true;
		 }else {return false;}
		 
	}
	}
	public List<Movimiento> consultarMovimientos(){
		 return cuenta.getMovimientos();
	}
	
}
