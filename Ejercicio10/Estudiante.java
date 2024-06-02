package Ejercicio10;

import java.util.Scanner;

public class Estudiante {
	private String nombre;
	private int ci;
	private ListaDobleNormalExamen LDNE;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public ListaDobleNormalExamen getLDNE() {
		return LDNE;
	}

	public void setLDNE(ListaDobleNormalExamen lDNE) {
		LDNE = lDNE;
	}

	Estudiante() {
		nombre = "";
		ci = 0;
		LDNE = new ListaDobleNormalExamen();
	}

	public Estudiante(String nombre, int ci, ListaDobleNormalExamen lDNE) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		LDNE = lDNE;
	}

	void mostrar() {
		System.out.println("Estudiante[" + nombre + ", " + ci + ", ");
		LDNE.mostrar();
		System.out.println("]");
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Estudiante...");
		System.out.println("nombre?");
		nombre = sc.nextLine();
		System.out.println("CI?");
		ci = sc.nextInt();
		LDNE.llenarFinal(3);
	}
}
