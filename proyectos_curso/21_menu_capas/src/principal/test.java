package principal;

import java.util.Scanner;
import modelo.GestionNotas;

public class test {

	static Scanner sc= new Scanner(System.in);
	static int opcion;
	

	public static void main(String[] args) {
		GestionNotas gn=new GestionNotas();	
		do {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("1.- Añadir nota ");
			System.out.println("2.- Ver aprobados ");
			System.out.println("3.- Nota media ");
			System.out.println("4.- Mostrar todas las notas ");
			System.out.println("5.- Salir");
			System.out.println("");
			System.out.println("");
			System.out.println("Seleccione la opción deseada: ");	
			opcion=sc.nextInt();
			switch (opcion) {
			case 1: System.out.println("Introduzca la nota: ");
					Double nota=sc.nextDouble();
					gn.agregarNota(nota);
					break;
			case 2: System.out.println("El número de aprobados es: " + gn.aprobados());
					break;
			case 3: System.out.println("La media calculada es: " + gn.media());
					break;
					
			case 4: 
					System.out.println("Las notas introducidas son: "); 
					for (Double n:gn.devolverNotas()) {
						System.out.print(n+"\n");
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
