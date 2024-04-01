package Parcial;

import java.util.Scanner;

public class PilaCarga extends VectorCarga {
	private int tope;

	PilaCarga() {
		tope = -1;
	}

	boolean esVacia() {
		return tope == -1;
	}

	boolean esLlena() {
		return tope == max - 1;
	}

	void adicionar(Carga x) {
		if (!esLlena()) {
			tope++;
			v[tope] = x;
		} else {
			System.out.println("Pila llena!");
		}
	}

	Carga eliminar() {
		Carga x = new Carga();
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
			Carga x = new Carga();
			x.leer();
			adicionar(x);
		}
	}

	void vaciar(PilaCarga aux) {
		while (!aux.esVacia()) {
			adicionar(aux.eliminar());
		}
	}

	void mostrar() {
		System.out.println("Pila Cargas:");
		PilaCarga aux = new PilaCarga();
		while (!esVacia()) {
			Carga x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}

	int nroElem() {
		return tope + 1;
	}

}
