package Ejercicio8;

import java.util.Scanner;

public class MP_PilaNota {
	private int n;
	private PilaNota c[] = new PilaNota[100];

	public MP_PilaNota() {
		for (int i = 0; i < 100; i++)
			c[i] = new PilaNota();
	}

	public int nroElem(int i) {
		return c[i].nroElem();
	}

	public boolean esVacia(int i) {
		return c[i].esVacia();
	}

	public boolean esLlena(int i) {
		return c[i].esLlena();
	}

	public void adicionar(int i, Nota est) {
		c[i].adicionar(est);
	}

	public Nota eliminar(int i) {
		return c[i].eliminar();
	}

	public void llenar(int i, int n) {
		c[i].llenar(n);
	}

	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			System.out.println("nro de Notas de la pila");
			int nroEst = lee.nextInt();
			c[i].llenar(nroEst);
		}
	}

	public void mostrar() {
		for (int i = 0; i < this.n; i++) {
			c[i].mostrar();
		}
	}

	public void mostrar(int i) {
		c[i].mostrar();
	}

	public void vaciar(int i, PilaNota z) {
		c[i].vaciar(z);
	}

	public void vaciar(int i, int j) {
		c[i].vaciar(c[j]);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
