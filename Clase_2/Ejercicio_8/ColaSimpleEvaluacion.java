package Ejercicio_8;

import java.util.Scanner;


public class ColaSimpleEvaluacion extends ColaEvaluacion{
	ColaSimpleEvaluacion(){
		super();
	}	
	
	
	boolean esVacia() {
		return (fr==fi);
	}
	
	boolean esLlena() {
		return (fi==max-1);
	}
	
	
	void adicionar(Evaluacion x) {
		if(!esLlena()) {
			fi++;
			v[fi]=x;			
		}else {
			System.out.println("Cola Simple llena!");
		}
		
	}
	
	
	Evaluacion eliminar() {
		Evaluacion x=new Evaluacion();
		if(!esVacia()) {
			fr++;
			x=v[fr];
			if(fr==fi) {
				fr=fi=-1;
			}
		}else {
			System.out.println("Cola Simple vacia!");
		}
		return x;
	}
	
	void llenar(int n) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			Evaluacion x=new Evaluacion();
			x.leer();
			adicionar(x);
		}		
	}
	
	
	void vaciar(ColaSimpleEvaluacion Z) {
		while(!Z.esVacia()) {
			adicionar(Z.eliminar());
		}		
	}
	
	
	int nroElementos() {
		return (fi-fr);
	}
	
	void mostrar() {
		int n=nroElementos();
		System.out.println("Cola simple Evaluacion:");
		for(int i=0;i<n;i++) {
			Evaluacion x=eliminar();
			x.mostrar();
			adicionar(x);
		}		
		System.out.println("....");
	}
	
	
	
	
}