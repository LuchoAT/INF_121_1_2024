package Ejercicio_2;

public class Principal {

	// a) adicionar una nueva empresa
	static void adicionarNueva(ListaSimpleNormalEmpresa A) {
		Empresa nuevaEmpresa = new Empresa();
		nuevaEmpresa.leer();
		A.adicionarFinal(nuevaEmpresa);
	}

	// b) Insertar un nuevo vehiculo en la empresa X
	static void insertarVehiculo(ListaSimpleNormalEmpresa A, String X) {
		// Recorremos la lista de empresas
		nodoEmpresa r1 = A.getP();
		while (r1 != null) {
			if (r1.getX().getNombreEmpresa().equals(X)) {
				// creamos el vehiculo
				Movil nuevoM = new Movil();
				nuevoM.leer();
				nodoMovil nuevoNodo = new nodoMovil();
				nuevoNodo.setX(nuevoM);
				// Ponemos nuevoNodo donde le corresponda

				// Como recorremos ?

				nodoMovil prev, r2;
				prev = r2 = r1.getX().getLSNM().getP();

				while (r2 != null) {
					if (r2.getX().getNroPlaca() > nuevoNodo.getX().getNroPlaca()) {
						// preguntamos si nuevoNodo es el nuevoPrimernodo
						if (r2 == r1.getX().getLSNM().getP()) {
							nuevoNodo.setSig(r2);
							r1.getX().getLSNM().setP(nuevoNodo);
						} else {
							// prev->nuevoNodo->r2
							prev.setSig(nuevoNodo);
							nuevoNodo.setSig(r2);
						}
						r2 = null;
					} else {
						prev = r2;
						r2 = r2.getSig();
					}
				}
				if (nuevoNodo.getSig() == null) {
					// nunca se conecto a r2
					// por lo tanto deberia ser el ultimo nodo
					prev.setSig(nuevoNodo);
				}
			}
			r1 = r1.getSig();
		}
	}

	static void eliPrimerOcupado(ListaSimpleNormalEmpresa A, String X) {
		nodoEmpresa r1 = A.getP();
		while (r1 != null) {
			if (r1.getX().getNombreEmpresa().equals(X)) {
				// recorremos la lista de moviles de r1
				nodoMovil r2, prev;
				r2 = prev = r1.getX().getLSNM().getP();
				// recorremos los moviles
				while (r2 != null) {
					if (r2.getX().isLibre_Ocupado() == false) {
						// eliminamos r2 de la lista
						if (r2 == r1.getX().getLSNM().getP()) {
							// la nueva cabeza sera el sig de r2
							r1.getX().getLSNM().setP(r2.getSig());
							r2.setSig(null);
						} else {
							prev.setSig(r2.getSig());
							r2.setSig(null);
						}
						r2 = null;
					} else {
						prev = r2;
						r2 = r2.getSig();
					}
				}

			}
			r1 = r1.getSig();
		}
	}

	// Inciso d)

	static boolean existeCapacidadMayor(Empresa e, int w) {
		int check = 0;
		nodoMovil r = e.getLSNM().getP();
		while (r != null) {
			if (r.getX().getCapacidad() > w) {
				check = 1;
			}
			r = r.getSig();
		}
		if (check == 1) {
			return true;
		} else {
			return false;
		}
	}

	static void mostrarEmpresa(ListaSimpleNormalEmpresa A, int w) {
		nodoEmpresa r = A.getP();
		while (r != null) {
			// pregunto para cada empresa si cumple la condicion
			if (existeCapacidadMayor(r.getX(), w)) {
				System.out.println(r.getX().getNombreEmpresa());
				nodoMovil r2 = r.getX().getLSNM().getP();
				while (r2 != null) {
					if (r2.getX().getCapacidad() > w) {
						System.out.println(r2.getX().getNroPlaca());
					}
					r2 = r2.getSig();
				}
			}
			r = r.getSig();
		}
	}

	public static void main(String[] args) {

		ListaSimpleNormalEmpresa A = new ListaSimpleNormalEmpresa();
		A.llenarFinal(1);
		A.mostrar();

		// Inciso a)
		/// adicionarNueva(A);

		// Inciso b)
//		insertarVehiculo(A, "cosmos");
		// A.mostrar();

		// Inciso c)
		eliPrimerOcupado(A, "cosmos");
		A.mostrar();
	}

}
