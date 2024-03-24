package Ejercicio6;

import java.util.Scanner;

public class MC_ColaSimpleMascota {
	private int n;
	private ColaSimpleMascota c[] = new ColaSimpleMascota[100];

	public MC_ColaSimpleMascota() {
		for (int i = 0; i < 100; i++)
			c[i] = new ColaSimpleMascota();
	}

	public int nroElementos(int i) {
		return c[i].nroElementos();
	}

	public boolean esVacia(int i) {
		return c[i].esVacia();
	}

	public boolean esLlena(int i) {
		return c[i].esLlena();
	}

	public void adicionar(int i, Mascota est) {
		c[i].adicionar(est);
	}

	public Mascota eliminar(int i) {
		return c[i].eliminar();
	}

	public void llenar(int i, int n) {
		c[i].llenar(n);
	}

	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			System.out.println("nro de Mascotas de la cola");
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

	public void vaciar(int i, ColaSimpleMascota z) {
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
