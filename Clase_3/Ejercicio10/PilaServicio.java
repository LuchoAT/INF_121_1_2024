package Ejercicio10;

import java.util.Scanner;

public class PilaServicio extends VectorServicio {
	private int tope;

	PilaServicio() {
		tope = -1;
	}

	boolean esVacia() {
		return tope == -1;
	}

	boolean esLlena() {
		return tope == max - 1;
	}

	void adicionar(Servicio x) {
		if (!esLlena()) {
			tope++;
			v[tope] = x;
		} else {
			System.out.println("Pila llena!");
		}
	}

	Servicio eliminar() {
		Servicio x = new Servicio();
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
			Servicio x = new Servicio();
			x.leer();
			adicionar(x);
		}
	}

	void vaciar(PilaServicio aux) {
		while (!aux.esVacia()) {
			adicionar(aux.eliminar());
		}
	}

	void mostrar() {
		System.out.println("Pila Servicios:");
		PilaServicio aux = new PilaServicio();
		while (!esVacia()) {
			Servicio x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}

	int nroElem() {
		return tope + 1;
	}

}
