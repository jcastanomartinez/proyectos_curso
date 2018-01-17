package principal;

import java.util.Collection;
import java.util.Scanner;

import beans.Contacto;
import modelo.GestionContactos;

public class Test {
	static Integer  opcion=0;
	static GestionContactos gc = new GestionContactos();
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 		
		do {
			mostrarMenu();	
		}while (opcion!=7);
	}
	
	public static void mostrarMenu() {
		
		System.out.println("");
		System.out.println("");
		System.out.println("1.- Añadir contacto ");
		System.out.println("2.- Buscar contacto ");
		System.out.println("3.- Eliminar contacto ");
		System.out.println("4.- Mostrar todas los contactos ");
		System.out.println("5.- Buscar por teléfono ");
		System.out.println("6.- Cambiar dominio de los contactos ");
		System.out.println("7.- Salir");
		System.out.println("");
		System.out.println("");
		System.out.println("Seleccione la opción deseada: ");
		try {
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
				System.out.println("Introduzca la dirección del contacto: ");
				contactoAnadido.setDireccion(sc.nextLine());
				System.out.println("Introduzca el teléfono del contacto: ");
				contactoAnadido.setTelefono(Long.parseLong(sc.nextLine()));
				if (gc.anadirContacto(contactoAnadido)) {System.out.println("Contacto añadido.");} else {System.out.println("El contacto ya existe, no se añade.");};					
				System.out.println("");
				System.out.println("¿Desea añadir otro contacto? (s/n)");					
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
				    	System.out.println("La dirección del contacto  es: " + contactoBuscado.getDireccion());
				    	System.out.println("El teléfono del contacto  es: " + contactoBuscado.getTelefono());
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
				System.out.println("La información de los contactos introducidos es: \n");
				for (Contacto n:contactos) {
					 System.out.println("");
					 System.out.println("Email: " + n.getEmail() + " \nNombre: " + n.getNombre() + " \nDirección: " +n.getDireccion() + "\nTeléfono: " + n.getTelefono());
				 
				}
				System.out.print("");
				break;

		case 5: System.out.println("--------------------------------------------------------------------------------------------------------");
				System.out.println("Introduzca el teléfono a buscar: ");
				String telBuscado= sc.nextLine();					
				if (gc.buscarPorTelefono(Integer.parseInt(telBuscado)) == true) {
					System.out.println("Teléfono encontrado.");
				}else {System.out.println("El teléfono no existe.");};
				break;

		case 6: System.out.println("--------------------------------------------------------------------------------------------------------");
				System.out.println("Introduzca el nuevo dominio: ");
				String nuevoDominio= sc.nextLine();
				gc.cambiarDominio(nuevoDominio);
				break;
				
		case 7: break;
		
		
		default: 
		//	System.out.println("La opción introducida no es correcta.");
			
	}
	
} catch(NumberFormatException ex) {
      System.out.println("La opción introducida es incorrecta.");
	}

	}
}
