package principal;

import java.util.Collection;
import java.util.Scanner;

import beans.Contacto;
import modelo.GestionContactos;

public class Test {
	
	
	public static void main(String[] args) {
		int opcion=0;
		GestionContactos gc = new GestionContactos();
		Scanner sc=new Scanner(System.in); 
		
		do {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("1.- Añadir contacto ");
			System.out.println("2.- Buscar contacto ");
			System.out.println("3.- Eliminar contacto ");
			System.out.println("4.- Mostrar todas los contactos ");
			System.out.println("5.- Salir");
			System.out.println("");
			System.out.println("");
			System.out.println("Seleccione la opción deseada: ");	
			opcion=Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1: 
					
					Contacto contactoAnadido= new Contacto();
					System.out.println("Introduzca el mail del contacto: ");
					contactoAnadido.setEmail(sc.nextLine());				
					System.out.println("Introduzca el nombre del contacto: ");
					contactoAnadido.setNombre(sc.nextLine());
					
					gc.anadirContacto(contactoAnadido);
					break;
			case 2: 

					System.out.println("Introduzca el mail del contacto a buscar: ");
					String mailBuscado= sc.nextLine();
					if (gc.buscarContacto(mailBuscado)!=null) {
						   Contacto contactoBuscado = new Contacto();
						   contactoBuscado=gc.buscarContacto(mailBuscado);
					    	System.out.println("El nombre del contacto  es: " + contactoBuscado.getNombre());
					}else {
						System.out.println("El contacto a buscar no existe.");
					}
					
					break;
			case 3: System.out.println("Introduzca el mail del contacto a eliminar: ");
			   		String mailEliminado=sc.nextLine();
					if (gc.eliminarContacto(mailEliminado)) {
						System.out.println("El contacto ha sido eliminado.");
					}else { System.out.println("El contacto a eliminar no existe.");};
					break;
					
			case 4: 
					Collection<Contacto> contactos=gc.mostrarContactos().values();
					System.out.println("La información de los contactos introducidos es: \n");
					for (Contacto n:contactos) {
						 System.out.println("Email: " + n.getEmail() + " \nNombre: " + n.getNombre()+ " \n");
					 
					}
					System.out.print("");
					break;
					
			case 5: break;
			default: 
				System.out.println("La opción introducida no es correcta.");
				
		}
		
		}while (opcion!=5);
	}


}
