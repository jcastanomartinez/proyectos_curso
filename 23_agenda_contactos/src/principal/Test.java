package principal;

import java.util.Collection;
import java.util.Scanner;

import beans.Contacto;
import modelo.GestionContactos;

public class Test {
	
	
	public static void main(String[] args) {
		Integer opcion=0;
		GestionContactos gc = new GestionContactos();
		Scanner sc=new Scanner(System.in); 
		
		do {
			System.out.println("");
			System.out.println("");
			System.out.println("1.- A�adir contacto ");
			System.out.println("2.- Buscar contacto ");
			System.out.println("3.- Eliminar contacto ");
			System.out.println("4.- Mostrar todas los contactos ");
			System.out.println("5.- Salir");
			System.out.println("");
			System.out.println("");
			System.out.println("Seleccione la opci�n deseada: ");	
			opcion=Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: 
					String resp="";
					do {
					Contacto contactoAnadido= new Contacto();
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("Introduzca el mail del contacto: ");
					contactoAnadido.setEmail(sc.nextLine());				
					System.out.println("Introduzca el nombre del contacto: ");
					contactoAnadido.setNombre(sc.nextLine());
					System.out.println("Introduzca la direcci�n del contacto: ");
					contactoAnadido.setDireccion(sc.nextLine());
					System.out.println("Introduzca el tel�fono del contacto: ");
					contactoAnadido.setTelefono(Long.parseLong(sc.nextLine()));
					if (gc.anadirContacto(contactoAnadido)) {System.out.println("Contacto a�adido.");} else {System.out.println("El contacto ya existe, no se a�ade.");};
					System.out.println("");
					System.out.println("�Desea a�adir otro contacto? (s/n)");					
					resp=sc.nextLine();
					}while (resp.equals("s"));
					
					break;
			case 2: 
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("Introduzca el mail del contacto a buscar: ");
					String mailBuscado= sc.nextLine();
					if (gc.buscarContacto(mailBuscado)!=null) {
						   Contacto contactoBuscado = new Contacto();
						   contactoBuscado=gc.buscarContacto(mailBuscado);
						    System.out.println("");
					    	System.out.println("El nombre del contacto  es: " + contactoBuscado.getNombre());
					    	System.out.println("El email del contacto  es: " + contactoBuscado.getEmail());
					    	System.out.println("La direcci�n del contacto  es: " + contactoBuscado.getDireccion());
					    	System.out.println("El tel�fono del contacto  es: " + contactoBuscado.getTelefono());
					    	//System.out.println("El contacto  existe.");
					    	sc.nextLine();
					    		
							
					}else {
						System.out.println("El contacto a buscar no existe.");
					}
					
					break;
			case 3: System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("Introduzca el mail del contacto a eliminar: ");
			   		String mailEliminado=sc.nextLine();
					if (gc.eliminarContacto(mailEliminado)) {
						System.out.println("El contacto ha sido eliminado.");
					}else { System.out.println("El contacto a eliminar no existe.");};
					break;
					
			case 4: System.out.println("--------------------------------------------------------------------------------------------------------");
					Collection<Contacto> contactos=gc.mostrarContactos().values();
					System.out.println("La informaci�n de los contactos introducidos es: \n");
					for (Contacto n:contactos) {
						 System.out.println("");
						 System.out.println("Email: " + n.getEmail() + " \nNombre: " + n.getNombre() + " \nDirecci�n: " +n.getDireccion() + "\nTel�fono: " + n.getTelefono());
					 
					}
					System.out.print("");
					break;
					
			case 5: break;
			default: 
				System.out.println("La opci�n introducida no es correcta.");
				
		}
			
		}while (opcion!=5);
	}


}
