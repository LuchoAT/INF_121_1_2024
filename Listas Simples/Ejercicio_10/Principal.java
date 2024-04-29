package Ejercicio_10;

public class Principal {

	// a. Mostrar todas las tareas vencidas comparando con la fecha X

	// a b -> true a<b false a>=b
	static boolean verFechas(String a, String b) {
		// dd/mm/aa
		int d1, m1, a1, d2, m2, a2;
		d1 = Integer.parseInt(a.substring(0, 2));
		m1 = Integer.parseInt(a.substring(3, 5));
		a1 = Integer.parseInt(a.substring(6, 10));

		d2 = Integer.parseInt(b.substring(0, 2));
		m2 = Integer.parseInt(b.substring(3, 5));
		a2 = Integer.parseInt(b.substring(6, 10));

		// a<b
		if (a1 < a2) {
			return true;
		} else if (a1 > a2) {
			return false;
		} else {
			// a1==a2
			if (m1 < m2) {
				return true;
			} else if (m1 > m2) {
				return false;
			} else {
				if (d1 < d2) {
					return true;
				} else {
					return false;
				}
			}
		}
	}

	static void mostrarFechas(ListaSimpleNormalTarea A, String X) {
		nodoTarea r = A.getP();
		while (r != null) {
			if (verFechas(r.getX().getFechaVencimiento(), X)) {
				r.getX().mostrar();
			}
			r = r.getSig();
		}
	}

	static void insertarFecha(ListaSimpleNormalTarea A, Tarea X) {
		nodoTarea r = A.getP();
		nodoTarea prev = A.getP();
		nodoTarea aux = new nodoTarea();
		aux.setX(X);
		while (r != null) {
			// fecha r> fecha aux
			if (verFechas(aux.getX().getFechaVencimiento(), r.getX().getFechaVencimiento())) {
				aux.setSig(r);
				if (r == A.getP()) {
					A.setP(aux);
				} else {
					prev.setSig(aux);
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

	static void EliminarNombre(ListaSimpleNormalTarea A, String X) {
		nodoTarea prev, r;
		prev = A.getP();
		r = A.getP();
		while (r != null) {
			if (r.getX().getNombreTarea().equals(X)) {
				// elimino el nodo r de la lista
				if (r == A.getP()) {
					A.setP(r.getSig());
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

	static void dividir(ListaSimpleNormalTarea A, ListaSimpleNormalTarea B, String X) {
		// mover las fechas que sean mayores a X
		// a<b
		nodoTarea r = A.getP();
		nodoTarea prev = A.getP();
		// todas las fechas iguales a X se van a B
		while (r != null) {
			if (r.getX().getFechaVencimiento().equals(X)) {
				if (r == A.getP()) {
					A.setP(r.getSig());
					r.setSig(null);
					B.adicionarFinal(r.getX());
					r = A.getP();
				} else {
					prev.setSig(r.getSig());
					r.setSig(null);
					B.adicionarFinal(r.getX());
					r = prev.getSig();
				}
			} else {
				prev = r;
				r = r.getSig();
			}
		}

		r = A.getP();
		prev = A.getP();
		//eliminar todas las fechas menores a X
		while (r != null) {
			//a<b
			if (verFechas(r.getX().getFechaVencimiento(), X)) {
				if (r == A.getP()) {
					A.setP(r.getSig());
					r.setSig(null);
					r = A.getP();
				} else {
					prev.setSig(r.getSig());
					r.setSig(null);
					r = prev.getSig();
				}
			} else {
				prev = r;
				r = r.getSig();
			}
		}

	}

	public static void main(String[] args) {

		// X="09/10/2023"

		ListaSimpleNormalTarea A = new ListaSimpleNormalTarea();
		A.adicionarFinal(new Tarea("T1", "nose1", "12/11/2024"));
		A.adicionarFinal(new Tarea("T2", "nose10", "12/11/2025"));
		A.adicionarFinal(new Tarea("T3", "nose10", "12/11/2026"));
		A.adicionarFinal(new Tarea("T4", "nose10", "12/11/2026"));
		A.adicionarFinal(new Tarea("T5", "nose1000", "12/12/2028"));
		A.adicionarFinal(new Tarea("T6", "nose10000", "12/11/2029"));
		A.adicionarFinal(new Tarea("T7", "nose10000", "08/10/2030"));

//		A.mostrar();
		// mostrarFechas(A,"09/10/2026");
		// insertarFecha(A,new Tarea("Tarea nueva","d1","11/12/1999"));
		//A.mostrar();
		//EliminarNombre(A, "T4");
		//A.mostrar();
		ListaSimpleNormalTarea B=new ListaSimpleNormalTarea();
		dividir(A,B,"12/11/2026");
		A.mostrar();
		B.mostrar();
		
	}

}
