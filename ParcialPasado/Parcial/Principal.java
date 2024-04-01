package Parcial;

import java.util.Scanner;

public class Principal {

	// Inciso a)
	static double calcularCarga(PilaCarga x) {
		double s = 0;
		PilaCarga aux = new PilaCarga();
		while (!x.esVacia()) {
			Carga y = x.eliminar();
			s += y.getPesoKG();
			aux.adicionar(y);
		}
		x.vaciar(aux);
		return s;
	}

	static double calcularCargaTotal(EntregaCarga x) {
		double suma = 0;
		// Marzo en index = 2
		int n = x.getMc().nroElementos(2);
		for (int i = 0; i < n; i++) {
			Vehiculo y = x.getMc().eliminar(2);
			suma += calcularCarga(y.getPc());
			x.getMc().adicionar(2, y);
		}
		return suma;
	}

	static void mostrarMaxClientes(ColaSimpleEntregaCarga A) {
		double maxValor = 0;
		int n = A.nroElementos();
		for (int i = 0; i < n; i++) {
			//Recorremos las EntregaCarga
			EntregaCarga x = A.eliminar();
			double valorTotal = calcularCargaTotal(x);
			if (valorTotal > maxValor) {
				maxValor = valorTotal;
			}
			A.adicionar(x);
		}

		for (int i = 0; i < n; i++) {
			EntregaCarga x = A.eliminar();
			double valorTotal = calcularCargaTotal(x);
			if (valorTotal == maxValor) {
				System.out.println(x.getCliente());
			}
			A.adicionar(x);
		}
	}

	// Inciso b)

	static boolean existeCargaTipoX(PilaCarga A, String X) {
		int existe = 0;
		PilaCarga aux = new PilaCarga();
		while (!A.esVacia()) {
			Carga x = A.eliminar();
			if (x.getTipoCarga().equals(X)) {
				existe = 1;
			}
			aux.adicionar(x);
		}
		A.vaciar(aux);
		if (existe == 1) {
			return true;
		} else {
			return false;
		}
	}

	static void mostrarPais(ColaSimpleEntregaCarga A, String X, String Z) {
		int n = A.nroElementos();
		for (int i = 0; i < n; i++) {
			// Para cada entregaCarga mostramos el pais si y solo si:
			// - El conductor de nombre Z transporta una/alguna carga de tipo X
			int check = 0;
			EntregaCarga x = A.eliminar();
			int m = x.getMc().getN();
			for (int j = 0; j < m; j++) {
				// Recorremos los vehiculos de la multicola de entregaCarga
				Vehiculo y = x.getMc().eliminar(j);
				if (y.getConductor().equals(Z) && existeCargaTipoX(y.getPc(), X)) {
					// Si el conductor tiene un nombre igual a Z y tambien tiene alguna carga igual
					// a X
					// entonces mostramos el pais
					check = 1;
				}
				x.getMc().adicionar(j, y);
			}
			if (check == 1) {
				System.out.println(x.getPais());
			}
			A.adicionar(x);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ColaSimpleEntregaCarga A = new ColaSimpleEntregaCarga();
		int n = sc.nextInt();
		A.llenar(n);
		A.mostrar();

		// Inciso a)
		mostrarMaxClientes(A);
		// A.mostrar();
		// Inciso b)
		mostrarPais(A, "acero", "ivan");

	}

}
