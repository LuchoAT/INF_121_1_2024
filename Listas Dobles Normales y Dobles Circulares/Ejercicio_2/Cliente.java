package Ejercicio_2;

import java.util.Scanner;

public class Cliente {
	private String nombreCliente;
	private int ci;

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

	Cliente() {
		ci = 0;
		nombreCliente = "";
	}

	public Cliente(String nombreCliente, int ci) {
		super();
		this.nombreCliente = nombreCliente;
		this.ci = ci;
	}

	void mostrar() {
		System.out.println("Cliente[Nombre = " + nombreCliente + ", CI: " + ci + "]");
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cliente...");
		System.out.println("Nombre?");
		nombreCliente = sc.nextLine();
		System.out.println("CI?");
		ci = sc.nextInt();
	}
}
