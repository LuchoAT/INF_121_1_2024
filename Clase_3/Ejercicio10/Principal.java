package Ejercicio10;

import java.util.Scanner;

public class Principal {

	// inciso a)
	static void mostrarCliente(ColaSimpleCliente A, MP_PilaServicio B) {
		int n = A.nroElementos();
		for (int i = 0; i < n; i++) {
			Cliente x = A.eliminar();
			int existeConsulta = 0;
			PilaServicio aux = new PilaServicio();
			while (!B.esVacia(i)) {
				Servicio y = B.eliminar(i);
				if (y.getTipoServicio().equals("Consulta")) {
					existeConsulta = 1;
				}
				aux.adicionar(y);
			}
			B.vaciar(i, aux);
			if (existeConsulta == 1) {
				x.mostrar();
			}
			A.adicionar(x);
		}
	}

	// inciso b)
	static void mostrarClientesMasDeposito(ColaSimpleCliente A, MP_PilaServicio B) {
		int maxServicio = 0;
		int n = A.nroElementos();
		for (int i = 0; i < n; i++) {
			if (B.nroElem(i) > maxServicio) {
				maxServicio = B.nroElem(i);
			}
		}

		for (int i = 0; i < n; i++) {
			Cliente x = A.eliminar();
			if (B.nroElem(i) == maxServicio) {
				x.mostrar();
			}
			A.adicionar(x);
		}
	}

	static boolean verificarCI(ColaSimpleCliente A, MP_PilaServicio B, int X) {
		int check = 0;
		int n = A.nroElementos();
		for (int i = 0; i < n; i++) {
			Cliente x = A.eliminar();
			if (x.getCi() == X) {
				PilaServicio aux = new PilaServicio();
				while (!B.esVacia(i)) {
					Servicio y = B.eliminar(i);
					if (y.getTipoServicio().equals("Deposito")) {
						check = 1;
					}
					aux.adicionar(y);
				}
				B.vaciar(i, aux);
			}
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
		ColaSimpleCliente A = new ColaSimpleCliente();
		MP_PilaServicio B = new MP_PilaServicio();

		int n = sc.nextInt();
		A.llenar(n);
		B.llenar(n);

		A.mostrar();
		B.mostrar();

		// System.out.println("Inciso a)");
		// mostrarCliente(A, B);
		//System.out.println("Inciso b)");
		//mostrarClientesMasDeposito(A, B);

		if(verificarCI(A, B, 123)) {
			System.out.println("Si tiene un Deposito!!");
		}else {
			System.out.println("NO");
		}
		
	}
}
