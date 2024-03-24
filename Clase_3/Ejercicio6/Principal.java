package Ejercicio6;

import java.util.Scanner;

public class Principal {
	
	//inciso a)
	static int contar(MC_ColaSimpleMascota A, String X) {
		int cnt=0;
		for(int i=0;i<A.getN();i++) {
			//Para cada cola simple:
			int n=A.nroElementos(i);
			for(int j=0;j<n;j++) {
				//Para cada mascota:
				Mascota x=A.eliminar(i);
				if(x.getTipo().equals(X) && x.getSexo().equals("Hembra")) {
					cnt++;
				}			
				A.adicionar(i, x);				
			}			
		}		
		return cnt;
	}
	
	//Inciso b)
	static void eliminarMenores(MC_ColaSimpleMascota A) {
		for(int i=0;i<A.getN();i++) {
			int n=A.nroElementos(i);
			for(int j=0;j<n;j++) {
				Mascota x=A.eliminar(i);
				if(!(x.getEdad()<2)) {
					A.adicionar(i, x);
				}
			}			
		}		
	}
	
	//Inciso c)
	static void agruparGatos(MC_ColaSimpleMascota A) {
		for(int i=0;i<A.getN();i++) {
			ColaSimpleMascota aux=new ColaSimpleMascota();
			int n=A.nroElementos(i);
			for(int j=0;j<n;j++) {
				Mascota x=A.eliminar(i);
				if(x.getTipo().equals("Gato")) {
					A.adicionar(i, x);
				}else {
					aux.adicionar(x);
				}
			}	
			A.vaciar(i, aux);
		}		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MC_ColaSimpleMascota A = new MC_ColaSimpleMascota();
		A.llenar(sc.nextInt());
		A.mostrar();
		
		//Inciso a)
		//System.out.println("Hay "+contar(A,"Gato")+" mascotas que cumplen las condiciones requeridas");
		//Inciso b)
		//eliminarMenores(A);
		//A.mostrar();
		//Inciso c)
		agruparGatos(A);
		A.mostrar();
	
	}

}
