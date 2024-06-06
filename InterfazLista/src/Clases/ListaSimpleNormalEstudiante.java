package Clases;

import java.util.Scanner;

public class ListaSimpleNormalEstudiante extends ListaSimpleEstudiante {

	public ListaSimpleNormalEstudiante() {
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

	public void adicionarFinal(Estudiante x) {
		// Creo un nodo y asigno x
		nodoEstudiante nodoAux = new nodoEstudiante();
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
			nodoEstudiante r = getP();
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
		nodoEstudiante r = getP();
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		return cnt;
	}

	public void adicionarPrincipio(Estudiante x) {
		nodoEstudiante nodoAux = new nodoEstudiante();
		nodoAux.setX(x);
		if (p == null) {
			setP(nodoAux);
		} else {
			nodoAux.setSig(getP());
			setP(nodoAux);
		}
	}

	

}
