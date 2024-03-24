package Ejercicio2;
import java.util.Scanner;

public class Principal {
	// mover gatos a la primera pila

	static void moverGatos(ColaCircularPilaMascota A) {
		PilaMascota gatos = new PilaMascota();
		int n = A.nroElem();
		for (int i = 0; i < n; i++) {
			PilaMascota x = A.eliminar();
			PilaMascota aux = new PilaMascota();
			while (!x.esVacia()) {
				Mascota y = x.eliminar();
				if (y.getTipoMascota().equals("Gato")) {
					gatos.adicionar(y);
				} else {
					aux.adicionar(y);
				}
			}
			x.vaciar(aux);
			A.adicionar(x);
		}

		// Movemos los gatos a la primera pila
		PilaMascota primeraPila = A.eliminar();
		primeraPila.vaciar(gatos);
		A.adicionar(primeraPila);
		// ponemos las demas pilas atras para respetar el orden
		for (int i = 0; i < n - 1; i++) {
			PilaMascota x = A.eliminar();
			A.adicionar(x);
		}
	}

	// Inciso b)
	static void eliminarMascota(ColaCircularPilaMascota A, String X, String Y) {
		int m = A.nroElem();
		for (int i = 0; i < m; i++) {
			PilaMascota aux = new PilaMascota();
			PilaMascota x = A.eliminar();
			while (!x.esVacia()) {
				Mascota y = x.eliminar();
				if (!(y.getNombreMascota().equals(X) && y.getFechaRegistro().equals(Y))) {
					aux.adicionar(y);
				}
			}
			x.vaciar(aux);
			A.adicionar(x);
		}
	}

	static boolean verificar(ColaCircularPilaMascota A) {
		int check = 0;
		int m = A.nroElem();
		for (int i = 0; i < m; i++) {
			PilaMascota aux = new PilaMascota();
			PilaMascota x = A.eliminar();
			while (!x.esVacia()) {
				Mascota y = x.eliminar();
				if (y.getTipoMascota().equals("Perro") && y.getNombreMascota().equals("Odair")) {
					check = 1;
				}
				aux.adicionar(y);
			}
			x.vaciar(aux);
			A.adicionar(x);
		}
		if (check == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ColaCircularPilaMascota A = new ColaCircularPilaMascota();

		// 4 pilas
		PilaMascota p1 = new PilaMascota();
		p1.adicionar(new Mascota("g1", "Gato", "19/11/2020", 123));
		p1.adicionar(new Mascota("Odair", "Perro", "12/04/2023", 123));
		p1.adicionar(new Mascota("g3", "Perro", "19/11/2020", 123));
		PilaMascota p2 = new PilaMascota();
		p2.adicionar(new Mascota("f1", "Gato", "19/11/2020", 123));
		p2.adicionar(new Mascota("f2", "Gato", "19/11/2020", 123));
		p2.adicionar(new Mascota("f3", "Perro", "19/11/2020", 123));
		p2.adicionar(new Mascota("f4", "Gato", "19/11/2020", 123));
		p2.adicionar(new Mascota("f5", "Gato", "19/11/2020", 123));
		p2.adicionar(new Mascota("f6", "Perro", "19/11/2020", 123));
		PilaMascota p3 = new PilaMascota();
		p3.adicionar(new Mascota("a1", "Gato", "19/11/2020", 123));
		p3.adicionar(new Mascota("a2", "Perro", "19/11/2020", 123));

		A.adicionar(p1);
		A.adicionar(p2);
		A.adicionar(p3);
		A.mostrar();

		// Inciso a)
		System.out.println("Inciso a)----");
		moverGatos(A);
		A.mostrar();

		// Inciso b)
		System.out.println("Inciso b)----");
		eliminarMascota(A, "g3", "12/04/2023");
		A.mostrar();

		//Inciso c)
		System.out.println("Inciso c)----");

		if(verificar(A)) {
			System.out.println("Si existe ese perro");
		}else {
			System.out.println("No existe ese perro");
		}
	}

}
