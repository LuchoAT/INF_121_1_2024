package Ejercicio_4;


import java.util.Scanner;

public class ListaSimpleNormalNombre extends ListaSimpleNombre {

	public ListaSimpleNormalNombre() {
		super();
	}

	// Para ver si la lista esta vacia
	boolean esVacia() {
		if (p == null) {
			return true;
		} else {
			return false;
		}
	}

	void adicionarFinal(String x) {
		// Creo un nodo y asigno x
		nodoNombre nodoAux = new nodoNombre();
		nodoAux.setX(x);
		if (p == null) {
			// entonces x estara en el primer nodo
			// Ponemos a nodoAux como el primer nodo de la
			// Lista
			setP(nodoAux);
		} else {
			// debemos poner a nodoAux como el ultimo
			// nodo
			// debemos recorrer toda la lista
			nodoNombre r = getP();
			// recorremos usando r
			while (r.getSig() != null) {
				r = r.getSig();
			}
			// conectamos donde se quedo r con nodoAux
			r.setSig(nodoAux);
		}
	}

	void llenarFinal(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			String x = sc.nextLine();
			adicionarFinal(x);
		}
	}

	void mostrar() {
		nodoNombre r = getP();
		System.out.println("ListaSimpleNormalNombre:");
		while (r != null) {
			System.out.println(r.getX());
			r = r.getSig();
		}
	}

	int nroElementos() {
		int cnt = 0;
		nodoNombre r = getP();
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		return cnt;
	}

	void adicionarPrincipio(String x) {
		nodoNombre nodoAux = new nodoNombre();
		nodoAux.setX(x);
		if (p == null) {
			setP(nodoAux);
		} else {
			nodoAux.setSig(getP());
			setP(nodoAux);
		}
	}

	void llenarPrincipio(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			String x = sc.nextLine();
			adicionarPrincipio(x);
		}
	}

}
