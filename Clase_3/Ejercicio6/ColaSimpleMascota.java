package Ejercicio6;

import java.util.Scanner;

public class ColaSimpleMascota extends ColaMascota {
	ColaSimpleMascota() {
		super();
	}

	boolean esVacia() {
		return (fr == fi);
	}

	boolean esLlena() {
		return (fi == max - 1);
	}

	void adicionar(Mascota x) {
		if (!esLlena()) {
			fi++;
			v[fi] = x;
		} else {
			System.out.println("Cola Simple llena!");
		}

	}

	Mascota eliminar() {
		Mascota x = new Mascota();
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
			Mascota x = new Mascota();
			x.leer();
			adicionar(x);
		}
	}

	void vaciar(ColaSimpleMascota Z) {
		while (!Z.esVacia()) {
			adicionar(Z.eliminar());
		}
	}

	int nroElementos() {
		return (fi - fr);
	}

	void mostrar() {
		int n = nroElementos();
		System.out.println("Cola simple Mascota:");
		for (int i = 0; i < n; i++) {
			Mascota x = eliminar();
			x.mostrar();
			adicionar(x);
		}
		System.out.println("....");
	}

}