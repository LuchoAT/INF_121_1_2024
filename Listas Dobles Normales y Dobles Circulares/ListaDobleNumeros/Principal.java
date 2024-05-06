package ListaDobleNumeros;

public class Principal {

	// a) insertar un nodo en la posicion
	// i-esima
	static void insertarIesimo(ListaDobleNormalNum A, int i, nodoNum nodoX) {
		int c = 0;
		nodoNum r = A.getP();
		while (r != null) {
			c++;
			if (c == i) {
				if (i == 1) {
					nodoX.setSig(A.getP());
					A.getP().setAnt(nodoX);
					A.setP(nodoX);
				} else {
					nodoNum nodoPrev = r.getAnt();
					// nodoPrev->nodoX
					nodoPrev.setSig(nodoX);
					// nodoPrev<-nodoX
					nodoX.setAnt(nodoPrev);

					// nodoX -> r
					nodoX.setSig(r);
					// r <- nodoX
					r.setAnt(nodoX);
				}
				r = null;
			} else {
				r = r.getSig();
			}
		}
	}

	static int menorValor(nodoNum r) {
		int minVal = 1000000;
		while (r != null) {
			if (r.getX() < minVal) {
				minVal = r.getX();
			}
			r = r.getSig();
		}
		return minVal;
	}

	// b) ordenar una lista
	static void ordenar(ListaDobleNormalNum A) {
		int n = A.nroElementos();
		for (int i = 1; i <= n - 1; i++) {
			// a partir del nodo iesimo preguntamos por el valor mas
			// pequenio
			nodoNum r = A.getP();
			int c = 0;
			while (c < i - 1) {
				r = r.getSig();
				c++;
			}
			// preguntamos el menor valor a partir de donde
			// finalizo el while
			nodoNum aux = r;
			int minVal = menorValor(r);
			r = aux;

			// eliminamos el nodo con el valor igual a minVal
			while (r != null) {
				if (r.getX() == minVal) {
					// preguntamos si el r a retirar
					// es igual a aux osea donde empezamos
					if (r == A.getP()) {
						A.setP(r.getSig());
						r.setSig(null);
					} else {
						// eliminamos el nodo r
						nodoNum prev = r.getAnt();
						prev.setSig(r.getSig());
						if (r.getSig() != null) {
							r.getSig().setAnt(prev);
						}
						r.setSig(null);
						r.setAnt(null);
					}
					// el nodo r esta desconectado, lo insertarmos en
					// la posicion i
					insertarIesimo(A, i, r);
					r = null;
				} else {
					r = r.getSig();
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDobleNormalNum A = new ListaDobleNormalNum();
		A.adicionarFinal(5);
		A.adicionarFinal(100);
		A.adicionarFinal(1);
		A.adicionarFinal(5);
		A.adicionarFinal(0);
		A.mostrar();

		// ordenar
		//Inciso b)
		ordenar(A);
		A.mostrar();

	}

}
