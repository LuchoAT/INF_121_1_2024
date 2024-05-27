package Ejercicio2;

import java.util.Scanner;

public class Principal {

	// v. iterativa

	static String invertirIt(String x) {
		String c = "";// "acumulador"
		for (int i = 0; i < x.length(); i++) {
			c = x.charAt(i) + c;
		}
		return c;// el valor a devolver
	}

	// v. recursiva
	static String invertirRec(String x, int i) {
		// caso base
		if (i == x.length()) {
			// debemos detenernos
			return "";
		} else {
			// caso recursivo
			// antes de llamarnos tomaremos el caracter
			return invertirRec(x, i + 1) + x.charAt(i);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.println(invertirRec(x, 0));
	}

}
