package Ejercicio_4;

import java.util.Scanner;


public class ColaSimpleLibro extends ColaLibro{
	ColaSimpleLibro(){
		super();
	}	
	
	
	boolean esVacia() {
		return (fr==fi);
	}
	
	boolean esLlena() {
		return (fi==max-1);
	}
	
	
	void adicionar(Libro x) {
		if(!esLlena()) {
			fi++;
			v[fi]=x;			
		}else {
			System.out.println("Cola Simple llena!");
		}
		
	}
	
	
	Libro eliminar() {
		Libro x=new Libro();
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
			Libro x=new Libro();
			x.leer();
			adicionar(x);
		}		
	}
	
	
	void vaciar(ColaSimpleLibro Z) {
		while(!Z.esVacia()) {
			adicionar(Z.eliminar());
		}		
	}
	
	
	int nroElementos() {
		return (fi-fr);
	}
	
	void mostrar() {
		int n=nroElementos();
		System.out.println("Cola simple Libro:");
		for(int i=0;i<n;i++) {
			Libro x=eliminar();
			x.mostrar();
			adicionar(x);
		}		
		System.out.println("....");
	}
	
	
	
	
}