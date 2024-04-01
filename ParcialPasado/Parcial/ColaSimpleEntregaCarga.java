package Parcial;

import java.util.Scanner;

public class ColaSimpleEntregaCarga extends ColaEntregaCarga {
	ColaSimpleEntregaCarga() {
		super();
	}

	boolean esVacia() {
		return (fr == fi);
	}

	boolean esLlena() {
		return (fi == max - 1);
	}

	void adicionar(EntregaCarga x) {
		if (!esLlena()) {
			fi++;
			v[fi] = x;
		} else {
			System.out.println("Cola Simple llena!");
		}

	}

	EntregaCarga eliminar() {
		EntregaCarga x = new EntregaCarga();
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
			EntregaCarga x = new EntregaCarga();
			x.leer();
			adicionar(x);
		}
	}

	void vaciar(ColaSimpleEntregaCarga Z) {
		while (!Z.esVacia()) {
			adicionar(Z.eliminar());
		}
	}

	int nroElementos() {
		return (fi - fr);
	}

	void mostrar() {
		int n = nroElementos();
		System.out.println("Cola simple EntregaCarga:");
		for (int i = 0; i < n; i++) {
			EntregaCarga x = eliminar();
			x.mostrar();
			adicionar(x);
		}
		System.out.println("....");
	}

}