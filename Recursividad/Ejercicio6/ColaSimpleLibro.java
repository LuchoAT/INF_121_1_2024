package Ejercicio6;

public class ColaSimpleLibro extends ColaLibro {
	ColaSimpleLibro() {
		super();
	}

	// Para ver si una cola esta vacia
	boolean esVacia() {
		if (fr == fi) {
			return true;
		} else {
			return false;
		}
	}

	// Para ver si una cola esta llena
	boolean esLlena() {
		if (fi == max - 1) {
			return true;
		} else {
			return false;
		}
	}

	void adicionar(Libro x) {
		if (esLlena()) {
			System.out.println("Cola simple llena!");
		} else {
			fi++;
			v[fi] = x;
		}
	}

	Libro eliminar() {
		Libro x = new Libro();
		if (esVacia()) {
			System.out.println("Cola simple vacia!");
		} else {
			fr++;
			x = v[fr];
		}
		return x;
	}

	void llenar(int n) {
		for (int i = 0; i < n; i++) {
			Libro x=new Libro();
			x.leer();
			adicionar(x);
		}
	}

	int nroElem() {
		return fi - fr;
	}

	void vaciar(ColaSimpleLibro Z) {
		while (!Z.esVacia()) {
			adicionar(Z.eliminar());
		}
	}

	void mostrar() {
		if (esVacia()) {
			System.out.println("Cola simple vacia");
		} else {
			System.out.println("Datos de la cola simple:");
			ColaSimpleLibro colaAux = new ColaSimpleLibro();
			while (!esVacia()) {
				Libro x = eliminar();
				x.mostrar();
				colaAux.adicionar(x);
			}
			vaciar(colaAux);
		}

	}

}
