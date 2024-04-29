package Ejercicio_2;

import java.util.Scanner;

public class Principal {

	// Eliminar los numeros pares de una lista

	static void eliPares(ListaSimpleNormalNum A) {
		nodoNum r = A.getP();
		nodoNum aux = A.getP();
		while (r != null) {
			if (r.getX() % 2 == 0) {
				// vamos a preguntar si r es el primer nodo
				if (r == A.getP()) {
					// ponemos al siguiente nodo como el primero
					A.setP(r.getSig());
					r.setSig(null);
					aux = r = A.getP();
				} else {
					// r tiene un valor par
					// procedemos a desconectar
					aux.setSig(r.getSig());
					r.setSig(null);
					// Para seguir recorriendo
					r = aux.getSig();
				}
			} else {
				// r tiene un valor impar
				aux = r;
				r = r.getSig();
			}
		}
	}

	// adicionar el valor x despues del nodo i-esimo
	static void adicionarX(ListaSimpleNormalNum A, int x, int i) {
		// creamos una variable para ver en que nodo estamos
		int c = 0;
		nodoNum r = A.getP();
		while (r != null) {
			c++;
			if (c == i) {
				// debemos adicionar un nodo
				nodoNum aux = new nodoNum();
				aux.setX(x);
				// conectamos
				aux.setSig(r.getSig());
				r.setSig(aux);
			}
			r = r.getSig();
		}

	}

	// Ejercicio 2)

	static void ordenarListas(ListaSimpleNormalNum A, ListaSimpleNormalNum B) {
		int m = B.nroElementos();
		for (int i = 0; i < m; i++) {
			nodoNum aux = B.getP();
			B.setP(aux.getSig());
			aux.setSig(null);
			// aux tiene que conectarse en A
			nodoNum r = A.getP();
			nodoNum prev = r;
			while (r != null) {
				if (r.getX() > aux.getX()) {
					// Preguntamos si adicionamos antes del primer elemento de A
					if (r == A.getP()) {
						aux.setSig(A.getP());
						A.setP(aux);
					} else {
						// prev-> aux ->r
						prev.setSig(aux);
						aux.setSig(r);
					}
					r = null;
				} else {
					prev = r;
					r = r.getSig();
				}
			}
			if(aux.getSig()==null) {
				prev.setSig(aux);
			}
		}

	}

	public static void main(String[] args) {
		ListaSimpleNormalNum A = new ListaSimpleNormalNum();
		ListaSimpleNormalNum B = new ListaSimpleNormalNum();
		Scanner sc = new Scanner(System.in);
		A.adicionarFinal(0);
		A.adicionarFinal(1);
		A.adicionarFinal(5);
		A.adicionarFinal(5);
		A.adicionarFinal(7);
		A.adicionarFinal(10);
		
		
		B.adicionarFinal(-5);
		B.adicionarFinal(-4);
		B.adicionarFinal(0);
		B.adicionarFinal(20);
		B.adicionarFinal(50);
		B.adicionarFinal(130);
		B.adicionarFinal(200);
		
		
		A.mostrar();
		B.mostrar();
		System.out.println("Inciso a)");
		ordenarListas(A,B);
		A.mostrar();
		B.mostrar();
		
		
	}

}
