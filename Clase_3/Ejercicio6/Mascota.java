package Ejercicio6;

import java.util.Scanner;

public class Mascota {
	private String nombreMascota, sexo, tipo;
	private int edad;

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	Mascota() {
		nombreMascota = sexo = tipo = "";
		edad = 0;
	}

	public Mascota(String nombreMascota, String sexo, String tipo, int edad) {
		super();
		this.nombreMascota = nombreMascota;
		this.sexo = sexo;
		this.tipo = tipo;
		this.edad = edad;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mascota...");
		System.out.println("Nombre?");
		nombreMascota = sc.nextLine();
		System.out.println("Tipo?");
		tipo = sc.nextLine();
		System.out.println("sexo?");
		sexo = sc.nextLine();
		System.out.println("Edad?");
		edad = sc.nextInt();
	}

	void mostrar() {
		System.out.println("Mascota[" + nombreMascota + ", " + edad + ", " + tipo + ", " + sexo + "]");
	}
}
