package Ejercicio_2;

import java.util.Scanner;

public class Principal {
	
	//Inciso a)
	//-Crearnos una funcion para ver cual es la nota mayor
	//-Mover poco a poco el/los examen/es con mayor nota en ese rato
	//  y mover a otra cola
	
	static double notaMayor(ColaSimpleExamen A) {
		double mayor=0;
		int n=A.nroElementos();
		for(int i=0;i<n;i++) {
			Examen x=A.eliminar();
			if(x.getNota()>mayor) {
				mayor=x.getNota();
			}
			A.adicionar(x);
		}
		return mayor;		
	}
	
	
	static void ordenarNota(ColaSimpleExamen A) {
		ColaSimpleExamen ord=new ColaSimpleExamen();
		while(!A.esVacia()) {
			double mayor=notaMayor(A);
			int n=A.nroElementos();
			for(int i=0;i<n;i++) {
				Examen x=A.eliminar();
				if(x.getNota()==mayor) {
					ord.adicionar(x);
				}else {
					A.adicionar(x);
				}
			}			
		}
		A.vaciar(ord);		
	}
	
	
	
	//b. Mostrar la nota que más se repite
	
	//80 80 80 80 80 56 56 56 56 78
	
	static int contarNota(ColaSimpleExamen A, double X) {
		int cnt=0;
		int n=A.nroElementos();
		for(int i=0;i<n;i++) {
			Examen x=A.eliminar();
			if(x.getNota()==X) {
				cnt++;
			}
			A.adicionar(x);
		}
		return cnt;
	}
	
	static void mostrarNota(ColaSimpleExamen A) {
		
		int n=A.nroElementos();
		int mayor=0;
		for(int i=0;i<n;i++) {
			//Para cada examen:
			//contar cuantas veces los siguientes
			//examen tienen una nota igual a x
			Examen x=A.eliminar();
			int c=contarNota(A,x.getNota());
			if(c>mayor) {
				mayor=c;
			}
			A.adicionar(x);
		}		
		
		double notaRep=0;
		n=A.nroElementos();
		for(int i=0;i<n;i++) {
			Examen x=A.eliminar();
			int c=contarNota(A,x.getNota());
			if(c==mayor) {
				notaRep=x.getNota();
			}
			A.adicionar(x);
		}		
		System.out.println(notaRep);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ColaSimpleExamen A=new ColaSimpleExamen();
		A.llenar(sc.nextInt());
		A.mostrar();
		
		//Inciso a)
		ordenarNota(A);
		A.mostrar();

		
		//Inciso b)
		mostrarNota(A);
		
	}

}
