package Ejercicio10;

import java.util.Scanner;

public class PilaEstudiante extends VectorEstudiante{
	private int tope;
	PilaEstudiante(){
		tope=-1;
	}
	
	boolean esVacia() {
		return tope==-1;
	}
	boolean esLlena() {
		return tope==max-1;
	}
	
	void adicionar(Estudiante x) {
		if(!esLlena()) {
			tope++;
			v[tope]=x;
		}else {
			System.out.println("Pila llena!");
		}
	}
	
	Estudiante eliminar() {
		Estudiante x=new Estudiante();
		if(!esVacia()) {
			x=v[tope];
			tope--;
		}else {
			System.out.println("Pila vacia!");
		}
		return x;
	}
	
	
	void llenar(int n) {
		for(int i=1;i<=n;i++) {
			//adicionar() n-veces
			Estudiante x=new Estudiante();
			x.leer();
			adicionar(x);
		}		
	}
	
	void vaciar(PilaEstudiante aux) {
		while(!aux.esVacia()) {
			adicionar(aux.eliminar());
		}		
	}
	
	void mostrar() {
		System.out.println("Pila Estudiantes:");
		PilaEstudiante aux=new PilaEstudiante();
		while(!esVacia()) {
			Estudiante x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);		
	}
	
	int nroElem() {
		return tope+1;
	}
	

}
