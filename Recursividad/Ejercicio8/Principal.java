package Ejercicio8;

import java.util.Scanner;

public class Principal {

	static boolean verificar(nodoTelefono r, nodoTelefono raiz, int existe, int X) {
		if (r.getSig() != raiz) {
			if (r.getX().getNro() == X) {
				existe = 1;
			}
			return verificar(r.getSig(), raiz, existe, X);
		} else {
			// preguntamos en el ultimo nodo
			if (r.getX().getNro() == X) {
				existe = 1;
			}
			if (existe == 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	// adicionamos un telefono rec.

	static void adi(nodoTelefono r, nodoTelefono raiz, Telefono x) {
		if (r.getSig() != raiz) {
			adi(r.getSig(), raiz, x);
		} else {
			nodoTelefono nuevo = new nodoTelefono();
			nuevo.setX(x);
			// r->nuevo
			r.setSig(nuevo);
			nuevo.setSig(raiz);
		}
	}

	// Inciso a) //Se llama inciso a por que no se me ocurrio otro nombre
	static void incisoA(ListaSimpleCircularTelefono A, String nombreX, int nroX) {
		if (!verificar(A.getP(), A.getP(), 0, nroX)) {
			// adicionamos al final ese telefono

			Telefono nuevo = new Telefono();
			nuevo.setNombre(nombreX);
			nuevo.setNro(nroX);
			adi(A.getP(), A.getP(), nuevo);
		} else {
			System.out.println("Ya existe!");
		}
	}

	static void mostrar(nodoTelefono r, nodoTelefono raiz, int Y) {
		if (r.getSig() != raiz) {
			if (r.getX().getNro() == Y) {
				System.out.println(r.getX().getNombre());
			}
			mostrar(r.getSig(), raiz, Y);
		} else {
			if (r.getX().getNro() == Y) {
				System.out.println(r.getX().getNombre());
			}
		}
	}

	static nodoTelefono devolverUltimoNodo(nodoTelefono r, nodoTelefono raiz) {
		if (r.getSig() != raiz) {
			return devolverUltimoNodo(r.getSig(), raiz);
		} else {
			return r;
		}
	}

	static void eliminar(nodoTelefono r, nodoTelefono raiz, nodoTelefono prev, ListaSimpleCircularTelefono A) {

		if (r.getSig() != raiz) {

			int primerDigito = (r.getX().getNro()) / 10000000;
			if (primerDigito == 6) {
				// eliminamos
				if (r == raiz) {

					A.setP(r.getSig());
					nodoTelefono s = r;
					nodoTelefono ultimoNodo = devolverUltimoNodo(s, raiz);
					ultimoNodo.setSig(A.getP());
					r.setSig(null);
					eliminar(A.getP(), A.getP(), A.getP(), A);
				} else {
					prev.setSig(r.getSig());
					r.setSig(null);
					eliminar(prev.getSig(), raiz, prev, A);
				}
			} else {
				prev = r;
				r = r.getSig();
				eliminar(r, raiz, prev, A);
			}
		} else {
			// sabemos que aqui es el final
			// si es el unico nodo
			if (A.getP().getSig() == A.getP()) {
				A.setP(null);
			} else {
				// eliminar lo que hay en el ultimo nodo
				int primerDigito = (r.getX().getNro()) / 10000000;
				if (primerDigito == 6) {
					prev.setSig(r.getSig());
					r.setSig(null);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaSimpleCircularTelefono A = new ListaSimpleCircularTelefono();
		A.adicionar(new Telefono("c1", 60656081));
		A.adicionar(new Telefono("c10", 70656082));
		A.adicionar(new Telefono("c100", 60656083));
		A.adicionar(new Telefono("c2", 70656084));
		A.adicionar(new Telefono("c7", 60656085));

		A.mostrar();
		System.out.println();
		// Inciso a)
		//incisoA(A, "juan", 103);
		// Inciso b)
		//mostrar(A.getP(), A.getP(), 34);

//		A.mostrar();
		// Inciso c)

		eliminar(A.getP(), A.getP(), A.getP(), A);
		A.mostrar();

	}
}
