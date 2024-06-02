package Ejercicio10;


import java.util.Scanner;

public class ListaDobleNormalExamen extends ListaDobleExamen {

	public ListaDobleNormalExamen() {
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

	void adicionarFinal(Examen x) {
		// Creo un nodo y asigno x
		nodoExamen nodoAux = new nodoExamen();
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
			nodoExamen r = getP();
			// recorremos usando r
			while (r.getSig() != null) {
				r = r.getSig();
			}
			// conectamos donde se quedo r con nodoAux
			r.setSig(nodoAux);
			nodoAux.setAnt(r);
		}
	}

	void llenarFinal(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			Examen x=new Examen();
			x.leer();
			adicionarFinal(x);
		}
	}

	void mostrar() {
		nodoExamen r = getP();
		System.out.println("ListaDobleNormal:");
		while (r != null) {
			r.getX().mostrar();
			r = r.getSig();
		}
	}

	int nroElementos() {
		int cnt = 0;
		nodoExamen r = getP();
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		return cnt;
	}

	void adicionarPrincipio(Examen x) {
		nodoExamen nodoAux = new nodoExamen();
		nodoAux.setX(x);
		if (p == null) {
			setP(nodoAux);
		} else {
			nodoAux.setSig(getP());
			getP().setAnt(nodoAux);
			setP(nodoAux);
		}
	}

	void llenarPrincipio(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			Examen x=new Examen();
			x.leer();
			adicionarPrincipio(x);
		}
	}

}
