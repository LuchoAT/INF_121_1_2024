package Ejercicio8;

import java.util.Scanner;

public class Nota {
	private int notaFinal;
	private String nombre;

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	Nota() {
		notaFinal = 0;
		nombre = "";
	}

	void mostrar() {
		System.out.println("Nota[nombre = " + this.getNombre() + ", nota = " + this.getNotaFinal() + "]");
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota...");
		System.out.println("Nombre?");
		nombre = sc.nextLine();
		System.out.println("NotaFinal?");
		notaFinal = sc.nextInt();
	}

}
