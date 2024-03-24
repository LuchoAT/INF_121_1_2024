package Ejercicio4;

import java.util.Scanner;

public class PilaCarrera extends VectorCarrera {
	private int tope;

	PilaCarrera() {
		tope = -1;
	}

	boolean esVacia() {
		return tope == -1;
	}

	boolean esLlena() {
		return tope == max - 1;
	}

	void adicionar(Carrera x) {
		if (!esLlena()) {
			tope++;
			v[tope] = x;
		} else {
			System.out.println("Pila llena!");
		}
	}

	Carrera eliminar() {
		Carrera x = new Carrera();
		if (!esVacia()) {
			x = v[tope];
			tope--;
		} else {
			System.out.println("Pila vacia!");
		}
		return x;
	}

	void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			// adicionar() n-veces
			Carrera x = new Carrera();
			x.leer();
			adicionar(x);
		}
	}

	void vaciar(PilaCarrera aux) {
		while (!aux.esVacia()) {
			adicionar(aux.eliminar());
		}
	}

	void mostrar() {
		System.out.println("Pila Carreras:");
		PilaCarrera aux = new PilaCarrera();
		while (!esVacia()) {
			Carrera x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}

	int nroElem() {
		return tope + 1;
	}

}
