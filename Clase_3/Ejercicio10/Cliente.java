package Ejercicio10;

import java.util.Scanner;

public class Cliente {
	private String nombreCliente;
	private int ci, edad;

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	Cliente() {
		nombreCliente = "";
		edad = ci = 0;
	}

	void mostrar() {
		System.out.println("Cliente[" + nombreCliente + ", " + edad + ", " + ci + "]");
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cliente...");
		System.out.println("Nombre?");
		nombreCliente = sc.nextLine();
		System.out.println("ci?");
		ci = sc.nextInt();
		System.out.println("edad?");
		edad = sc.nextInt();

	}

}
