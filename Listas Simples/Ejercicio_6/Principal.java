package Ejercicio_6;

import java.util.Scanner;

public class Principal {

	static void mostrarMasCostosas(ListaSimpleComputadora A) {
		double maxPrecio = 0;
		// recorremos la lista A
		nodoComputadora r = A.getP();
		while (r != null) {
			if (r.getX().getPrecio() > maxPrecio) {
				maxPrecio = r.getX().getPrecio();
			}
			r = r.getSig();
		}

		// el maximo valor de una computadora estara en maxPrecio

		r = A.getP();
		while (r != null) {
			if (r.getX().getPrecio() == maxPrecio) {
				r.getX().mostrar();
			}
			r = r.getSig();
		}
	}

	// c) Eliminar la primera computadora de marca X
	static void eliminarMarcaX(ListaSimpleNormalComputadora A, String X) {
		nodoComputadora r = A.getP();
		nodoComputadora prev = A.getP();
		// recorremos la lista
		while (r != null) {
			if (r.getX().getMarca().equals(X)) {
				// eliminamos el nodo que apunta actualmente r de la lista
				if (r == A.getP()) {
					A.setP(r.getSig());
					// desconectamos r de la lista
					r.setSig(null);
				} else {
					prev.setSig(r.getSig());
					r.setSig(null);
				}
				r = null;
			} else {
				prev = r;
				r = r.getSig();
			}
		}
	}

	static void insertarIesimo(ListaSimpleNormalComputadora A, int i, Computadora X) {
		int c = 0;
		nodoComputadora r = A.getP();
		nodoComputadora prev = r;
		nodoComputadora aux = new nodoComputadora();
		aux.setX(X);
		while (r != null) {
			c++;
			if (c == i) {
				// insertarmos el objeto en lo pos i

				if (i == 1) {
					// es el primer nodo de la lista
					aux.setSig(A.getP());
					A.setP(aux);
				} else {
					prev.setSig(aux);
					// prev->r
					// prev->aux->r
					aux.setSig(r);
				}
				r = null;
			} else {
				prev = r;
				r = r.getSig();
			}
		}

		if (aux.getSig() == null) {
			prev.setSig(aux);
		}
	}

	// ordenar
	static void insertarNodoIesimo(ListaSimpleNormalComputadora A, int i, nodoComputadora nodoExterno) {
		int c = 0;
		nodoComputadora r = A.getP();
		nodoComputadora prev = r;
		int check = 0;
		while (r != null) {
			c++;
			if (c == i) {
				// insertarmos el objeto en lo pos i
				check = 1;
				nodoExterno.setSig(r);
				if (i == 1) {
					A.setP(nodoExterno);
				} else {
					prev.setSig(nodoExterno);
					// prev->r
					// prev->nodexterno->r
				}
				r = null;
			} else {
				prev = r;
				r = r.getSig();
			}
		}

		if (check == 0) {
			if (A.getP() == null) {
				A.setP(nodoExterno);
			} else {
				prev.setSig(nodoExterno);
			}
		}
	}

	static double menorPrecio(nodoComputadora r) {
		double minPrecio = 10000;
		while (r != null) {
			if (r.getX().getPrecio() < minPrecio) {
				minPrecio = r.getX().getPrecio();
			}
			r = r.getSig();
		}
		return minPrecio;
	}

	static void ordenar(ListaSimpleNormalComputadora A) {
		int n = A.nroElementos();
		for (int i = 1; i <= n; i++) {
			nodoComputadora r1 = A.getP();
			nodoComputadora prev = A.getP();
			int c = 0;
			while (c < i - 1) {
				prev = r1;
				r1 = r1.getSig();
				c++;
			}
			nodoComputadora aux = r1;
			double minValor = menorPrecio(r1);
			r1 = aux;
			// quitamos al primer nodo con el valor minValor
			while (r1 != null) {
				if (r1.getX().getPrecio() == minValor) {
					// eliminamos r1 de la lista
					if (r1 == A.getP()) {
						A.setP(r1.getSig());
						r1.setSig(null);
					} else {
						prev.setSig(r1.getSig());
						r1.setSig(null);
					}
					insertarNodoIesimo(A, i, r1);
					r1 = null;
				} else {
					prev = r1;
					r1 = r1.getSig();
				}
			}
		}
	}

	static void insertarOrdenamente(ListaSimpleComputadora A, Computadora X) {
		nodoComputadora nodoExterno = new nodoComputadora();
		nodoExterno.setX(X);

		nodoComputadora r = A.getP();
		nodoComputadora prev = r;
		while (r != null) {
			if (r.getX().getPrecio() > nodoExterno.getX().getPrecio()) {
				// prev->nodoExterno->r
				nodoExterno.setSig(r);
				if (r == A.getP()) {
					A.setP(nodoExterno);
				} else {
					prev.setSig(nodoExterno);
				}
				r = null;
			} else {
				prev = r;
				r = r.getSig();
			}
		}
		if (nodoExterno.getSig() == null) {
			// nunca se conecto a la lista
			prev.setSig(nodoExterno);
		}
	}
	
	
	//invertir lista
	
	static void invertirLista(ListaSimpleNormalComputadora A) {
		int n=A.nroElementos();
		for(int i=1;i<=n-1;i++) {
			nodoComputadora r=A.getP();
			nodoComputadora prev=r;
			//para eliminar el ultimo nodo debemos recorrer
			while(r.getSig()!=null) {
				prev=r;
				r=r.getSig();
			}
			//r estara en el ultimo nodo y prev en el penultimo
			prev.setSig(null);
			insertarNodoIesimo(A, i, r);			
		}		
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ListaSimpleNormalComputadora A = new ListaSimpleNormalComputadora();
		A.adicionarFinal(new Computadora("HP", "h1", 6));
		A.adicionarFinal(new Computadora("HP", "h2", 10));


		// A.mostrar();

		// Inciso b)
		// mostrarMasCostosas(A);

		// Inciso c)
		// eliminarMarcaX(A, "HP");
		// A.mostrar();

		// Inciso d)
		// insertarIesimo(A,1,new Computadora("HPNUEVA", "HN",100));
		ordenar(A);

		A.mostrar();
		// //Inciso e)
		// insertarOrdenamente(A, new Computadora("nose1","nose2",7));
		// A.mostrar();

		// inciso f)
		invertirLista(A);
		A.mostrar();
	}
}
