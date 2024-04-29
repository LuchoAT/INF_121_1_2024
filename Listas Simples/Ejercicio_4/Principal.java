package Ejercicio_4;

import java.util.Scanner;
import java.util.Stack;

public class Principal {

	// Inciso a)
	static void unir(ListaSimpleNormalNombre A, ListaSimpleNormalNombre B) {
		nodoNombre r = A.getP();
		while (r.getSig() != null) {
			r = r.getSig();
		}
		//
		r.setSig(B.getP());
		B.setP(null);
	}

	// Inciso b)
	static void unirIesimo(ListaSimpleNormalNombre A, ListaSimpleNormalNombre B, int i) {
		if(i>A.nroElementos()) {
			unir(A,B);
		}else {
			int c = 0;
			nodoNombre r = A.getP();
			while (r != null) {
				c++;
				if (c == i) {
					// conectar B despues de r
					// r -> B -> s
					nodoNombre s = r.getSig();
					r.setSig(B.getP());
					// recorremos B hasta llegar
					// al ultimo nodo
					nodoNombre it = B.getP();
					while (it.getSig() != null) {
						it = it.getSig();
					}
					it.setSig(s);
					B.setP(null);
					r=null;
				} else {
					r = r.getSig();
				}
			}
		}
	}
	
	static void adicionarUltimo(ListaSimpleNormalNombre A, ListaSimpleNormalNombre B) {
		nodoNombre prev, r;
		r=B.getP();
		prev=r;
		while(r.getSig()!=null) {
			prev=r;
			r=r.getSig();
		}
		prev.setSig(null);
		r.setSig(A.getP());
		A.setP(r);
		
		
	}
	
	static void eliminarKultimos(ListaSimpleNormalNombre A, ListaSimpleNormalNombre B, int k) {
		if(k>=B.nroElementos()) {
			//todo de B se a A 
			// B-> A
			unir(A,B);
		}else {
			//repetimos el inciso c) k-veces
			for(int i=0;i<k;i++) {
				adicionarUltimo(A, B);
			}			
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaSimpleNormalNombre A = new ListaSimpleNormalNombre();
		ListaSimpleNormalNombre B = new ListaSimpleNormalNombre();
		A.adicionarFinal("x");
		A.adicionarFinal("y");
		A.adicionarFinal("z");

		B.adicionarFinal("a");
		B.adicionarFinal("b");
		B.adicionarFinal("c");
		B.adicionarFinal("d");

		A.mostrar();
		B.mostrar();
		//System.out.println("Inciso a)----");
		//unir(A, B);
		//A.mostrar();
		//B.mostrar();

		//System.out.println("Inciso b)---");
		//unirIesimo(A, B, 2);
		//A.mostrar();
		//B.mostrar();
		
		//System.out.println("Inciso c)");
		//adicionarUltimo(A, B);
		//A.mostrar();
		//B.mostrar();
		System.out.println("Inciso d)");
		eliminarKultimos(A, B, 2);
		A.mostrar();
		B.mostrar();
	}

}
