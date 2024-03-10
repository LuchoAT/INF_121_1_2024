package Ejercicio_2;

import java.util.Scanner;

public class PilaPractica extends VectorPractica{
	private int tope;
	PilaPractica(){
		tope=-1;
	}
	
	boolean esVacia() {
		return tope==-1;
	}
	boolean esLlena() {
		return tope==max-1;
	}
	
	void adicionar(Practica x) {
		if(!esLlena()) {
			tope++;
			v[tope]=x;
		}else {
			System.out.println("Pila llena!");
		}
	}
	
	Practica eliminar() {
		Practica x=new Practica();
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
			Practica x=new Practica();
			x.leer();
			adicionar(x);
		}		
	}
	
	void vaciar(PilaPractica aux) {
		while(!aux.esVacia()) {
			adicionar(aux.eliminar());
		}		
	}
	
	void mostrar() {
		System.out.println("Pila Practicas:");
		PilaPractica aux=new PilaPractica();
		while(!esVacia()) {
			Practica x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);		
	}
	
	int nroElem() {
		return tope+1;
	}
	

}
