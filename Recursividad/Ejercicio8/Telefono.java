package Ejercicio8;

import java.util.Scanner;

public class Telefono {
	private String nombre;
	private int nro;

	public Telefono(String nombre, int nro) {
		super();
		this.nombre = nombre;
		this.nro = nro;
	}

	Telefono() {
		nombre = "";
		nro = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre?");
		nombre = sc.nextLine();
		System.out.println("nro?");
		nro = sc.nextInt();
	}

	void mostrar() {
		System.out.println("Telefono[" + nro + ", " + nombre + "]");
	}

}
