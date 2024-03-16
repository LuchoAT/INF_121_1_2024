package Ejercicio_4;

import java.util.Scanner;

public class Principal {

	static void eliminarVocImp(ColaSimpleLibro A) {
		int n = A.nroElementos();
		for (int i = 0; i < n; i++) {
			Libro x = A.eliminar();
			// if(!(condicion1 || condicion2))
			if (!((x.getNroPagina() % 2 == 1) || (x.getTitulo().charAt(0) == 'A') || (x.getTitulo().charAt(0) == 'E')
					|| (x.getTitulo().charAt(0) == 'I') || (x.getTitulo().charAt(0) == 'O')
					|| (x.getTitulo().charAt(0) == 'U'))) {
				A.adicionar(x);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ColaSimpleLibro A = new ColaSimpleLibro();
		A.llenar(sc.nextInt());
		A.mostrar();
		eliminarVocImp(A);
		A.mostrar();
	}

}
