package Ejercicio_2;


import java.util.Scanner;

public class ListaDobleNormalAsiento extends ListaDobleAsiento {

	public ListaDobleNormalAsiento() {
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

	void adicionarFinal(Asiento x) {
		// Creo un nodo y asigno x
		nodoAsiento nodoAux = new nodoAsiento();
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
			nodoAsiento r = getP();
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
			Asiento x=new Asiento();
			x.leer();
			adicionarFinal(x);
		}
	}

	void mostrar() {
		nodoAsiento r = getP();
		System.out.println("ListaDobleNormal:");
		while (r != null) {
			r.getX().mostrar();
			r = r.getSig();
		}
	}

	int nroElementos() {
		int cnt = 0;
		nodoAsiento r = getP();
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		return cnt;
	}

	void adicionarPrincipio(Asiento x) {
		nodoAsiento nodoAux = new nodoAsiento();
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
			Asiento x=new Asiento();
			x.leer();
			adicionarPrincipio(x);
		}
	}

}
