package Ejercicio_8;

import java.util.Scanner;

public class ColaCircularEstudiante extends ColaEstudiante{
	ColaCircularEstudiante() {
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
	
	
	public void adicionar(Estudiante elem) {
		if(!esLlena()) {
			fi = (fi + 1) % max;
			v[fi] = elem;
		}else {
			System.out.println("cola circular llena!!!");
		}
	}
	public Estudiante eliminar() {
		Estudiante elem=new Estudiante();
		if(!esVacia()) {
			fr = (fr + 1) % max;
			elem = v[fr];
		}else {
			System.out.println("Cola circular vacia!!");
		}
		return elem;
	}
	
	public void vaciar(ColaCircularEstudiante z) {
		while(!z.esVacia()) {
			adicionar(z.eliminar());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Estudiante x=new Estudiante();
			x.leer();
			adicionar(x);
		}
	}
	public void mostrar() {
		ColaCircularEstudiante aux = new ColaCircularEstudiante();
		System.out.println("Cola Circular Estudiante:");
		while(!esVacia()) {
			Estudiante elem = eliminar();
			elem.mostrar();
			aux.adicionar(elem);
		}
		vaciar(aux);
	}
	
}
