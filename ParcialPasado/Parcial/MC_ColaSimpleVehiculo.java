package Parcial;



import java.util.Scanner;

public class MC_ColaSimpleVehiculo {
	private int n;
	private ColaCircularVehiculo nc[] = new ColaCircularVehiculo[100];

	public MC_ColaSimpleVehiculo() {
		for (int i = 0; i < 100; i++)
			nc[i] = new ColaCircularVehiculo();
	}

	public int nroElementos(int i) {
		return nc[i].nroElementos();
	}

	public boolean esVacia(int i) {
		return nc[i].esVacia();
	}

	public boolean esLlena(int i) {
		return nc[i].esLlena();
	}

	public void adicionar(int i, Vehiculo est) {
		nc[i].adicionar(est);
	}

	public Vehiculo eliminar(int i) {
		return nc[i].eliminar();
	}

	public void llenar(int i, int n) {
		nc[i].llenar(n);
	}

	public void llenar(int n) {
		this.n = n;
		Scanner lee = new Scanner(System.in);
		for (int i = 0; i < this.n; i++) {
			System.out.println("nro de Vehiculos de la cola");
			int nroEst = lee.nextInt();
			nc[i].llenar(nroEst);
		}
	}

	public void mostrar() {
		for (int i = 0; i < this.n; i++) {
			nc[i].mostrar();
		}
	}

	public void mostrar(int i) {
		nc[i].mostrar();
	}

	public void vaciar(int i, ColaCircularVehiculo z) {
		nc[i].vaciar(z);
	}

	public void vaciar(int i, int j) {
		nc[i].vaciar(nc[j]);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
