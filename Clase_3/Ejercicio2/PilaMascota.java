package Ejercicio2;


import java.util.Scanner;

public class PilaMascota extends VectorMascota{
	private int tope;
	PilaMascota(){
		tope=-1;
	}
	
	boolean esVacia() {
		return tope==-1;
	}
	boolean esLlena() {
		return tope==max-1;
	}
	
	void adicionar(Mascota x) {
		if(!esLlena()) {
			tope++;
			v[tope]=x;
		}else {
			System.out.println("Pila llena!");
		}
	}
	
	Mascota eliminar() {
		Mascota x=new Mascota();
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
			Mascota x=new Mascota();
			x.leer();
			adicionar(x);
		}		
	}
	
	void vaciar(PilaMascota aux) {
		while(!aux.esVacia()) {
			adicionar(aux.eliminar());
		}		
	}
	
	void mostrar() {
		System.out.println("Pila Mascotas:");
		PilaMascota aux=new PilaMascota();
		while(!esVacia()) {
			Mascota x=eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);		
	}
	
	int nroElem() {
		return tope+1;
	}
	

}
