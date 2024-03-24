package Ejercicio8;

import java.util.Scanner;

public class Principal {

	// Inciso a)
	static int contarAprobados(MP_PilaNota A, int i) {
		int cnt = 0;
		PilaNota aux = new PilaNota();
		while (!A.esVacia(i)) {
			Nota x = A.eliminar(i);
			if (x.getNotaFinal() >= 51) {
				cnt++;
			}
			aux.adicionar(x);
		}
		A.vaciar(i, aux);
		return cnt;
	}

	static void mostrarAprobadosReprobados(MP_PilaNota A) {
		int maxAprobados = 0, maxReprobados = 0;
		for (int i = 0; i < A.getN(); i++) {
			int cantidadAprobados = contarAprobados(A, i);
			int cantidadReprobados = A.nroElem(i) - cantidadAprobados;

			if (cantidadAprobados > maxAprobados) {
				maxAprobados = cantidadAprobados;
			}

			if (cantidadReprobados > maxReprobados) {
				maxReprobados = cantidadReprobados;
			}

		}

		System.out.println("La(s) Pilas con maxAprobados son:");

		for (int i = 0; i < A.getN(); i++) {
			int cantidadAprobados = contarAprobados(A, i);
			if (cantidadAprobados == maxAprobados) {
				A.mostrar(i);
			}
		}

		System.out.println("La(s) Pilas con maxReprobados son:");
		for (int i = 0; i < A.getN(); i++) {
			int cantidadAprobados = contarAprobados(A, i);
			int cantidadReprobados = A.nroElem(i) - cantidadAprobados;
			if (cantidadReprobados == maxReprobados) {
				A.mostrar(i);
			}
		}
	}

	static void mostrarProm(MP_PilaNota A) {
		int suma = 0;
		int cnt = 0;

		for (int i = 0; i < A.getN(); i++) {
			PilaNota aux = new PilaNota();
			while (!A.esVacia(i)) {
				Nota x = A.eliminar(i);
				if (x.getNotaFinal() >= 51) {
					suma += x.getNotaFinal();
					cnt++;
				}
				aux.adicionar(x);
			}
			A.vaciar(i, aux);
		}

		if (cnt > 0) {
			double promedio = (double) suma / (double) cnt;
			System.out.println("El promedio es: " + promedio);
		} else {
			System.out.println("No existen aprobados!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MP_PilaNota A = new MP_PilaNota();
		A.llenar(sc.nextInt());
		A.mostrar();

		// Inciso a)
//		mostrarAprobadosReprobados(A);
		
		//Inciso b)
		mostrarProm(A);
		
	}
}
