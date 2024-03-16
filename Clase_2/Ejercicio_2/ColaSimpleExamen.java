package Ejercicio_2;

import java.util.Scanner;

public class ColaSimpleExamen extends ColaExamen{
	ColaSimpleExamen(){
		super();
	}	
	
	
	boolean esVacia() {
		return (fr==fi);
	}
	
	boolean esLlena() {
		return (fi==max-1);
	}
	
	
	void adicionar(Examen x) {
		if(!esLlena()) {
			fi++;
			v[fi]=x;			
		}else {
			System.out.println("Cola Simple llena!");
		}
		
	}
	
	
	Examen eliminar() {
		Examen x=new Examen();
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
			Examen x=new Examen();
			x.leer();
			adicionar(x);
		}		
	}
	
	
	void vaciar(ColaSimpleExamen Z) {
		while(!Z.esVacia()) {
			adicionar(Z.eliminar());
		}		
	}
	
	
	int nroElementos() {
		return (fi-fr);
	}
	
	void mostrar() {
		int n=nroElementos();
		System.out.println("Cola simple Examen:");
		for(int i=0;i<n;i++) {
			Examen x=eliminar();
			x.mostrar();
			adicionar(x);
		}		
		System.out.println("....");
	}
	
	
	
	
}
