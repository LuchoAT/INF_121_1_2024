package Ejercicio_6;

import java.util.Scanner;

public class ColaCircularMichi extends ColaMichi{
	ColaCircularMichi() {
		super();
	}
	
	public int nroElem() {
		return (fi - fr + max) % max;
	}
	
	
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == max-1)
			return true;
		return false;
	}
	
	
	public void adicionar(Michi elem) {
		if(!esLlena()) {
			fi = (fi + 1) % max;
			v[fi] = elem;
		}else {
			System.out.println("cola circular llena!!!");
		}
	}
	public Michi eliminar() {
		Michi elem=new Michi();
		if(!esVacia()) {
			fr = (fr + 1) % max;
			elem = v[fr];
		}else {
			System.out.println("Cola circular vacia!!");
		}
		return elem;
	}
	
	public void vaciar(ColaCircularMichi z) {
		while(!z.esVacia()) {
			adicionar(z.eliminar());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Michi x=new Michi();
			x.leer();
			adicionar(x);
		}
	}
	public void mostrar() {
		ColaCircularMichi aux = new ColaCircularMichi();
		System.out.println("Cola Circular Michi:");
		while(!esVacia()) {
			Michi elem = eliminar();
			elem.mostrar();
			aux.adicionar(elem);
		}
		vaciar(aux);
	}
	
}
