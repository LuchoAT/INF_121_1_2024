package Ejercicio6;

import java.util.Scanner;

public class Principal {

	// a) Cuantas Libros con nroPaginas mayor a X existe.
	// v1
	static int contarIt(ColaSimpleLibro A, int X) {
		int c = 0;
		ColaSimpleLibro aux = new ColaSimpleLibro();
		while (!A.esVacia()) {
			Libro x = A.eliminar();
			if (x.getNroPag() > X) {
				c++;
			}
			aux.adicionar(x);
		}
		A.vaciar(aux);
		return c;
	}

	// v2

	static int contarRec(ColaSimpleLibro A, int X, ColaSimpleLibro aux) {
		int contar = 0;
		if (!A.esVacia()) {
			// caso rec.
			Libro x = A.eliminar();
			if (x.getNroPag() > X) {
				contar++;
			}
			aux.adicionar(x);
			return contarRec(A, X, aux) + contar;
		} else {
			// caso base
			A.vaciar(aux);
			return 0;
		}
	}

	
	// Verificar si existe el libro con título X. De no existir, añadir uno al principio de
	 //la cola.
	
	
	static boolean verificar(ColaSimpleLibro A, ColaSimpleLibro aux, String X, int existe) {
		if(!A.esVacia()) {
			Libro x=A.eliminar();
			if(x.getTitulo().equals(X)) {
				existe=1;
			}
			aux.adicionar(x);
			return verificar(A, aux, X, existe);
		}else {
			A.vaciar(aux);
			if(existe==1) {
				return true;
			}else {
				return false;
			}			
		}		
	}
	
	static void moverElementos(ColaSimpleLibro A, int i) {
		if(i<A.nroElem()-1) {
			Libro x=A.eliminar();
			A.adicionar(x);
			moverElementos(A, i+1);
		}
	}
	
	
	static void mover(ColaSimpleLibro A, ColaSimpleLibro aux, String X) {
		int existe=0;
		if(!verificar(A,aux,X, existe)) {
			Libro nuevo=new Libro();
			nuevo.leer();
			A.adicionar(nuevo);
			//damos una cantidad de vueltas tal que el ultimo se
			//vuelva el primero
			int i=0;
			moverElementos(A, i);
		}		
	}
	
	
	
	public static void main(String[] args) {

		ColaSimpleLibro A = new ColaSimpleLibro();
		ColaSimpleLibro aux = new ColaSimpleLibro();
		A.adicionar(new Libro("t1", "g1", 43));
		A.adicionar(new Libro("t2", "g2", 5));
		A.adicionar(new Libro("t3", "g3", 100));
		A.mostrar();
		int X = 10;
		//Inciso a)
		System.out.println(contarRec(A,X,aux));
		//Inciso b)
		mover(A,aux,"tx");
		A.mostrar();
	}

}
