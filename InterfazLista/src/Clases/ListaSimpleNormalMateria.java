package Clases;

import java.util.Scanner;

public class ListaSimpleNormalMateria extends ListaSimpleMateria {

	public ListaSimpleNormalMateria() {
		super();
	}

	// Para ver si la lista esta vacia
	public boolean esVacia() {
		if (p == null) {
			return true;
		} else {
			return false;
		}
	}

	public void adicionarFinal(Materia x) {
		// Creo un nodo y asigno x
		nodoMateria nodoAux = new nodoMateria();
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
			nodoMateria r = getP();
			// recorremos usando r
			while (r.getSig() != null) {
				r = r.getSig();
			}
			// conectamos donde se quedo r con nodoAux
			r.setSig(nodoAux);
		}
	}

	
	
	public int nroElementos() {
		int cnt = 0;
		nodoMateria r = getP();
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		return cnt;
	}

	public void adicionarPrincipio(Materia x) {
		nodoMateria nodoAux = new nodoMateria();
		nodoAux.setX(x);
		if (p == null) {
			setP(nodoAux);
		} else {
			nodoAux.setSig(getP());
			setP(nodoAux);
		}
	}

	

}
