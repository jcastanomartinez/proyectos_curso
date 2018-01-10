package principal;
import java.util.Random;

public class Primitiva {

	
	public static void main(String[] args) {
	   //definimos el array de los 6 números
		
		
		
		int [] primitiva= new int[6];
		int generados=0;
		while (generados<6) {
			int n=(int)(Math.random()*49+1);
			if (!existe(n,generados,primitiva)) {
				primitiva[generados]=n;
				generados++;
			}
		}
		ordenarNumeros(primitiva);
		mostrarResultado(primitiva);

	/*
		introducirAleatoriosMath(primitiva);
		ordenarNumeros(primitiva);
			mostrarResultado(primitiva);*/
		}
		
	public static boolean existe(int n,int total,int[] actual) {
		//comentario versión 3
		//comprueba si el número está en el array
		boolean res=false;
		for (int i=0;i<total;i++) {
			if(n==actual[i]) {
				res=true;
				break;
			}
		}
		return res;
	}
	
		 
/*	private static void introducirAleatoriosRandom(int[] aleatorios) {
		Random rand = new Random();
		
		int numAleatorio=0;
		for (int i=0;i<6;i++) {
			numAleatorio=rand.nextInt(49) + 1;			
			for (int j=i+1;j<aleatorios.length;j++) {
				if (aleatorios[j] != numAleatorio) {
					aleatorios[j]=numAleatorio;
					
				}
			}
				
		}
		
	}	
	
	private static void introducirAleatoriosMath(int[] aleatorios) {
		
		
		int numAleatorio=0;
		int cont=1;
		//int [] numeros = null;
		
		for (int i=0;i<6;i++) {
			
			numAleatorio=(int) Math.floor(Math.random()*49+1);
			System.out.println(numAleatorio);
			if (i==0) {
				aleatorios[i]= numAleatorio;
			}else {
				if (i < aleatorios.length) {
					if ((aleatorios[i-1] != numAleatorio) ){
						aleatorios[i]=numAleatorio;
					}else {
						 	break;}
				}else {aleatorios[aleatorios.length-1]=numAleatorio;}
				
				
			}
			}	
			
		}
	*/

	
	  private static void ordenarNumeros(int [] numeros) {
		  
		  int numAct = 0;
		  for (int i=0;i<numeros.length;i++) {
			  for (int j=i+1;j<numeros.length;j++) {
				  if (numeros[j]<numeros[i]) {
					  numAct=numeros[i];
					  numeros[i]=numeros[j];
					  numeros[j]=numAct;
				  }
			  }
			}	  
				  
			  
		  }
	  
	  private static void mostrarResultado(int [] resultados) {
		  for (int n:resultados) {
			  System.out.print(n + "\t");
		  }
		  
	  }
}
