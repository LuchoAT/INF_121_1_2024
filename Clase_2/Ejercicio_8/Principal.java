package Ejercicio_8;

import java.util.Scanner;

public class Principal {
	
	static void ordenarPorEstudiante(ColaSimpleEvaluacion A, ColaCircularEstudiante B) {
		int n=B.nroElem();
		ColaSimpleEvaluacion aux=new ColaSimpleEvaluacion();
		for(int i=0;i<n;i++) {
			//Para cada estudiante agrupamos sus notas
			Estudiante x=B.eliminar();
			int m=A.nroElementos();
			for(int j=0;j<m;j++) {
				Evaluacion y=A.eliminar();
				if(x.getCi()==y.getCi()) {
					aux.adicionar(y);
				}else {
					A.adicionar(y);
				}				
			}
			B.adicionar(x);
		}
		A.vaciar(aux);		
	}
	
	static void mostrarEstudiantes(ColaSimpleEvaluacion A, ColaCircularEstudiante B) {
		int n=B.nroElem();
		int menorValor=100000;
		for(int i=0;i<n;i++) {
			Estudiante x=B.eliminar();
			int S=0;
			int m=A.nroElementos();
			for(int j=0;j<m;j++) {
				Evaluacion y=A.eliminar();
				if(x.getCi()==y.getCi()) {
					S+=y.getNota();
				}
				A.adicionar(y);
			}
			if(S<menorValor) {
				menorValor=S;
			}
			B.adicionar(x);
		}	
		
		n=B.nroElem();
		for(int i=0;i<n;i++) {
			Estudiante x=B.eliminar();
			int S=0;
			int m=A.nroElementos();
			for(int j=0;j<m;j++) {
				Evaluacion y=A.eliminar();
				if(x.getCi()==y.getCi()) {
					S+=y.getNota();
				}
				A.adicionar(y);
			}
			if(S==menorValor) {
				System.out.println(x.getNombre());
			}
			B.adicionar(x);
		}	
		
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ColaSimpleEvaluacion A=new ColaSimpleEvaluacion();
		A.llenar(sc.nextInt());
		A.mostrar();
		
		ColaCircularEstudiante B=new ColaCircularEstudiante();
		B.llenar(sc.nextInt());
		B.mostrar();
	}

}
