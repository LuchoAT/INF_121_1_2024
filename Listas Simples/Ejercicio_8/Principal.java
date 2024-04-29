package Ejercicio_8;

import java.util.Scanner;


public class Principal {

	// ordenar
	static void insertarNodoIesimo(ListaSimpleNormalLibro A, int i, nodoLibro nodoExterno) {
		int c = 0;
		nodoLibro r = A.getP();
		nodoLibro prev = r;
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

	static int menorPrecio(nodoLibro r) {
		int minPrecio = 10000;
		while (r != null) {
			if (r.getX().getAnioPublicacion() < minPrecio) {
				minPrecio = r.getX().getAnioPublicacion();
			}
			r = r.getSig();
		}
		return minPrecio;
	}

	static void ordenar(ListaSimpleNormalLibro A) {
		int n = A.nroElementos();
		for (int i = 1; i <= n; i++) {
			nodoLibro r1 = A.getP();
			nodoLibro prev = A.getP();
			int c = 0;
			while (c < i - 1) {
				prev = r1;
				r1 = r1.getSig();
				c++;
			}
			nodoLibro aux = r1;
			int minValor = menorPrecio(r1);
			r1 = aux;
			// quitamos al primer nodo con el valor minValor
			while (r1 != null) {
				if (r1.getX().getAnioPublicacion() == minValor) {
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

	static void mostrarX(ListaSimpleNormalLibro A, String X) {
		nodoLibro r=A.getP();
		while(r!=null) {
			if(r.getX().getAutor().equals(X)) {
				r.getX().mostrar();
			}
			r=r.getSig();
		}
	}
	
	
	static void EliminarGenero(ListaSimpleNormalLibro A, String X) {
		nodoLibro prev,r;
		prev=A.getP();
		r=A.getP();
		while(r!=null) {
			if(r.getX().getGenero().equals(X)) {
				//elimino el nodo r de la lista
				if(r==A.getP()) {
					A.setP(r.getSig());
					r.setSig(null);
					r=A.getP();
				}else {
					prev.setSig(r.getSig());
					r.setSig(null);
					r=prev.getSig();
				}
			}else {
				prev=r;
				r=r.getSig();
			}			
		}
		
		
	}
	
	
	static void insertarLibro(ListaSimpleNormalLibro A, String X, Libro L) {
		nodoLibro r=A.getP();
		nodoLibro aux=new nodoLibro();
		aux.setX(L);
		while(r!=null) {
			if(r.getX().getAutor().equals(X)) {
				//r->aux->r.getSig()
				aux.setSig(r.getSig());
				r.setSig(aux);
				r=null;
			}else {
				r=r.getSig();
			}
		}	
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ListaSimpleNormalLibro A=new ListaSimpleNormalLibro();
		A.adicionarFinal(new Libro("L1","JK","accion",2024));
		A.adicionarFinal(new Libro("L2","JK","accion",1999));
		A.adicionarFinal(new Libro("L3","B1","comedia",2015));
		A.adicionarFinal(new Libro("L4","Autor1","accion",2020));
		A.adicionarFinal(new Libro("L5","B1","terror",2024));
		A.adicionarFinal(new Libro("L6","B1","accion",2016));
		A.adicionarFinal(new Libro("L7","XD","terror",2024));
		//A.mostrar();
		
		//Inciso a)Mostrar todos los libros del autor X. 
		//mostrarX(A,"Autor1");
		//Inciso b) Ordenar
		//ordenar(A);
		//A.mostrar();
	//	EliminarGenero(A, "accion");
		//A.mostrar();
		
		//d. Insertar un nuevo libro después del primer libro del año X.
		insertarLibro(A,"XD",new Libro("NUEVO","L","L",2021));
		A.mostrar();
		
	}
}
