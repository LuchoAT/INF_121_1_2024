package Ejercicio10;

import java.util.Scanner;

public class ColaSimpleCliente extends ColaCliente {
	ColaSimpleCliente() {
		super();
	}

	boolean esVacia() {
		return (fr == fi);
	}

	boolean esLlena() {
		return (fi == max - 1);
	}

	void adicionar(Cliente x) {
		if (!esLlena()) {
			fi++;
			v[fi] = x;
		} else {
			System.out.println("Cola Simple llena!");
		}

	}

	Cliente eliminar() {
		Cliente x = new Cliente();
		if (!esVacia()) {
			fr++;
			x = v[fr];
			if (fr == fi) {
				fr = fi = -1;
			}
		} else {
			System.out.println("Cola Simple vacia!");
		}
		return x;
	}

	void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			Cliente x = new Cliente();
			x.leer();
			adicionar(x);
		}
	}

	void vaciar(ColaSimpleCliente Z) {
		while (!Z.esVacia()) {
			adicionar(Z.eliminar());
		}
	}

	int nroElementos() {
		return (fi - fr);
	}

	void mostrar() {
		int n = nroElementos();
		System.out.println("Cola simple Cliente:");
		for (int i = 0; i < n; i++) {
			Cliente x = eliminar();
			x.mostrar();
			adicionar(x);
		}
		System.out.println("....");
	}

}