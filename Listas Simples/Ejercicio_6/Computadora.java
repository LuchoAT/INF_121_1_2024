package Ejercicio_6;

import java.util.Scanner;

public class Computadora {
	private String marca, modelo;
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	private double precio;

	Computadora() {
		marca = modelo = "";
		precio = 0;
	}

	public Computadora(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Computadora...");
		System.out.println("Marca?");
		marca = sc.nextLine();
		System.out.println("Modelo?");
		modelo = sc.nextLine();
		System.out.println("Precio?");
		precio = sc.nextDouble();
	}

	void mostrar() {
		System.out.println("Computadora[" + marca + ", " + modelo + ", " + precio + "]");
	}

}
