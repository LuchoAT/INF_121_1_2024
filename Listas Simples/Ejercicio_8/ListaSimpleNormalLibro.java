package Ejercicio_8;



import java.util.Scanner;

public class ListaSimpleNormalLibro extends ListaSimpleLibro {

	public ListaSimpleNormalLibro() {
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

	void adicionarFinal(Libro x) {
		// Creo un nodo y asigno x
		nodoLibro nodoAux = new nodoLibro();
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
			nodoLibro r = getP();
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
			Libro x=new Libro();
			x.leer();
			adicionarFinal(x);
		}
	}

	void mostrar() {
		nodoLibro r = getP();
		System.out.println("ListaSimpleNormalLibro:");
		while (r != null) {
			r.getX().mostrar();
			r = r.getSig();
		}
	}

	int nroElementos() {
		int cnt = 0;
		nodoLibro r = getP();
		while (r != null) {
			cnt++;
			r = r.getSig();
		}
		return cnt;
	}

	void adicionarPrincipio(Libro x) {
		nodoLibro nodoAux = new nodoLibro();
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
			Libro x=new Libro();
			x.leer();
			adicionarPrincipio(x);
		}
	}

}
