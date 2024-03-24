package Ejercicio8;

import java.util.Scanner;

public class PilaNota extends VectorNota {
	private int tope;

	PilaNota() {
		tope = -1;
	}

	boolean esVacia() {
		return tope == -1;
	}

	boolean esLlena() {
		return tope == max - 1;
	}

	void adicionar(Nota x) {
		if (!esLlena()) {
			tope++;
			v[tope] = x;
		} else {
			System.out.println("Pila llena!");
		}
	}

	Nota eliminar() {
		Nota x = new Nota();
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
			Nota x = new Nota();
			x.leer();
			adicionar(x);
		}
	}

	void vaciar(PilaNota aux) {
		while (!aux.esVacia()) {
			adicionar(aux.eliminar());
		}
	}

	void mostrar() {
		System.out.println("Pila Notas:");
		PilaNota aux = new PilaNota();
		while (!esVacia()) {
			Nota x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}

	int nroElem() {
		return tope + 1;
	}

}
