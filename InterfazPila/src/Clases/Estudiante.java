package Clases;

import java.io.Serializable;
import java.util.Scanner;

public class Estudiante implements Serializable{
	private String nombre;
	private int CI;
	private int nota1, nota2, nota3;

	//n1[0,35]
	//n2[0,35]
	//n3[0,30]

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int cI) {
		CI = cI;
	}

	public Estudiante() {
		nombre = "";
		CI = nota1 = nota2 = nota3 = 0;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Estudiante...");
		System.out.println("Nombre?");
		this.nombre = sc.nextLine();
		System.out.println("CI'");
		this.CI = sc.nextInt();
		System.out.println("Nota 1?");
		this.nota1 = sc.nextInt();
		System.out.println("Nota 2?");
		this.nota2 = sc.nextInt();
		System.out.println("Nota 3?");
		this.nota3 = sc.nextInt();
	}

	public Estudiante(String nombre, int cI, int nota1, int nota2, int nota3) {
		super();
		this.nombre = nombre;
		CI = cI;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public void mostrar() {
		System.out.println("Estudiante[Nombre = " + this.nombre + ", CI = " + this.CI + ", nota 1 = " + this.nota1
				+ ",  nota 2 = " + this.nota2 + ", " + this.nota3 + "]");
		
	}
}
