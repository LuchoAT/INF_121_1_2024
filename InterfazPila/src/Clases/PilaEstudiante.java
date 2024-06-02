package Clases;

import java.util.Scanner;

public class PilaEstudiante extends VectorEstudiante {
	private int tope;

	public PilaEstudiante() {
		tope = -1;
	}

	public boolean esVacia() {
		return tope == -1;
	}

	public boolean esLlena() {
		return tope == max - 1;
	}

	public void adicionar(Estudiante x) {
		if (!esLlena()) {
			tope++;
			v[tope] = x;
		} else {
			System.out.println("Pila llena!");
		}
	}

	public Estudiante eliminar() {
		Estudiante x = new Estudiante();
		if (!esVacia()) {
			x = v[tope];
			tope--;
		} else {
			System.out.println("Pila vacia!");
		}
		return x;
	}

	public void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			// adicionar() n-veces
			Estudiante x = new Estudiante();
			x.leer();
			adicionar(x);
		}
	}
	
	//llenar por defecto
	public void llenar() {
		this.adicionar(new Estudiante("Luis", 2850, 15, 25, 10));
		this.adicionar(new Estudiante("Ana", 2123, 32, 8, 30));
		this.adicionar(new Estudiante("Juan", 2536, 20, 12, 5));
		this.adicionar(new Estudiante("María", 2999, 28, 30, 20));
		this.adicionar(new Estudiante("Pedro", 2311, 19, 16, 7));
		this.adicionar(new Estudiante("Laura", 2777, 23, 5, 25));
		this.adicionar(new Estudiante("Diego", 2654, 29, 18, 12));
		this.adicionar(new Estudiante("Sofía", 2045, 31, 22, 15));
		this.adicionar(new Estudiante("Jesus", 1000, 31, 22, 15));
		this.adicionar(new Estudiante("Gustavo", 1001, 31, 22, 15));
		this.adicionar(new Estudiante("Andres", 1002, 3, 22, 15));
		this.adicionar(new Estudiante("Nestor", 1003, 35, 35, 100));
		this.adicionar(new Estudiante("Ivan", 1004, 3, 2, 0));
		this.adicionar(new Estudiante("Gersy", 1005, 31, 22, 15));
		this.adicionar(new Estudiante("Elena", 2943, 27, 10, 28));
		this.adicionar(new Estudiante("Carlos", 2765, 16, 30, 3));
		this.adicionar(new Estudiante("Isabel", 2222, 21, 7, 17));
		this.adicionar(new Estudiante("Gabriel", 2812, 24, 29, 9));
		this.adicionar(new Estudiante("Carmen", 2956, 33, 14, 22));
		this.adicionar(new Estudiante("Javier", 2433, 18, 2, 18));
		this.adicionar(new Estudiante("Raquel", 2637, 26, 23, 11));
		this.adicionar(new Estudiante("Mario", 2098, 22, 6, 29));
		this.adicionar(new Estudiante("Natalia", 2888, 30, 19, 14));
		this.adicionar(new Estudiante("Pablo", 2276, 17, 13, 27));
		this.adicionar(new Estudiante("Marta", 2975, 34, 4, 21));
		this.adicionar(new Estudiante("Alejandro", 2557, 25, 27, 8));
	}

	public void vaciar(PilaEstudiante aux) {
		while (!aux.esVacia()) {
			adicionar(aux.eliminar());
		}
	}

	public void mostrar() {
		System.out.println("Pila Estudiantes:");
		PilaEstudiante aux = new PilaEstudiante();
		while (!esVacia()) {
			Estudiante x = eliminar();
			x.mostrar();
			aux.adicionar(x);
		}
		vaciar(aux);
	}

	public int nroElem() {
		return tope + 1;
	}

}
