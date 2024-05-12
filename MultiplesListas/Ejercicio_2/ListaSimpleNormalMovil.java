package Ejercicio_2;


import java.util.Scanner;

public class ListaSimpleNormalMovil extends ListaSimpleMovil {

	public ListaSimpleNormalMovil() {
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

	void adicionarFinal(Movil x) {
		// Creo un nodo y asigno x
		nodoMovil nodoAux = new nodoMovil();
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
			nodoMovil r = getP();
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
			Movil x=new Movil();
			x.leer();
			adicionarFinal(x);
		}
	}

	void mostrar() {
		nodoMovil r = getP();
		System.out.println("ListaSimpleNormal:");
		while (r != null) {
			r.getX().mostrar();
			r = r.getSig();
		}
	}

	int nroElementos() {
		int cnt = 0;
		nodoMovil r = getP();
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		return cnt;
	}

	void adicionarPrincipio(Movil x) {
		nodoMovil nodoAux = new nodoMovil();
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
			Movil x=new Movil();
			x.leer();
			adicionarPrincipio(x);
		}
	}

}
