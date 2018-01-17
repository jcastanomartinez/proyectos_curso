package presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import modelo.GestionCuenta;

/* 
 Al iniciar el programa se solicita al usuario el saldo inicial y el límite de la cuenta(máx cantidad que se puede sacar).
 Aparece el siguiente menú:
  1. Ingresar
  2. Extraer
  3. Movimientos y saldo
  4. Salir
  
  1. Se solicita la cantidad a ingresar y se procede al ingreso.
  2. Se solicita la cantidad a sacar, si es inferior o igual al límite se saca la cantidad.
  3. Muestra los movimientos realizados en la cuenta y el saldo final. Cada movimiento se caracteriza por un tipo (ingreso o extracción) y una cantidad.
  
 */
public class Cajero {

	static int opcion;
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static GestionCuenta gc= new GestionCuenta();
	public static void main(String[] args) {
		
			do {
			mostrarMenu();
		
			}while(opcion != 4);
		}
	

	
public static void mostrarMenu(){
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("						CAJERO VIRTUAL																		");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("1.- Ingresar efectivo ");
		System.out.println("2.- Sacar efectivo ");
		System.out.println("3.- Consultar saldo y movimientos de la cuenta ");
		System.out.println("4.- Salir");
		System.out.println("");
		System.out.println("");
		System.out.println("Seleccione la opción deseada: ");
		try {
		opcion=Integer.parseInt(bf.readLine());
		
		switch (opcion) {
		case 1: 
			//	String resp="";
			//	do {
				System.out.println("Introduzca la cantidad a ingresar: ");
				gc.ingresar(Double.parseDouble(bf.readLine()));
				System.out.println("");
		//		System.out.println("¿Desea añadir otro contacto? (s/n)");					
		//		resp=sc.nextLine();
		//		}while (resp.equals("s"));
				break;
		case 2: 
				System.out.println("Introduzca la cantidad a sacar: ");
				double cantidadSacada=Double.parseDouble(bf.readLine());
				if(gc.sacar(cantidadSacada)) {
					System.out.println("Retirada de efectivo realizada correctamente.");
				} else {System.out.println("No se ha podido sacar la cantidad deseada. Compruebe que dicha cantidad sea inferior a su límite o que el saldo de su cuenta sea positivo.");}				
				System.out.println("");
				break;
				
		case 3: //System.out.println("--------------------------------------------------------------------------------------------------------");
				
				System.out.println("");
				System.out.println("Movimientos realizados en la cuenta " );
				System.out.println("-------------------------------------" );
				gc.consultarMovimientos().forEach((x)->{
				 if(x.getTipo().equals("Extracción")) {
					 System.out.println("Importe:       " + x.getCantidad() + "		Fecha del movimiento: " + x.getFecha() + "	Tipo: " + x.getTipo());
				 }else {
					System.out.println("Importe:       +" + x.getCantidad() + "		Fecha del movimiento: " + x.getFecha() + "	Tipo: " + x.getTipo());
				 }
				} );
				System.out.println("             ----------");
				System.out.println("Saldo final:   "+gc.getCuenta().getSaldo());
				break;
				
		case 4: break;
		
		default: 
		//	System.out.println("La opción introducida no es correcta.");
			
	}
		}
		catch(NumberFormatException ex) {
			System.out.println("La opción elegida es incorrecta");
		}
		
		catch(IOException ex) {
		  	ex.printStackTrace();
		}

	}
}
