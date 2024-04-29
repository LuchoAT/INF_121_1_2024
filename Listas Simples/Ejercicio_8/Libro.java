package Ejercicio_8;

import java.util.Scanner;

public class Libro {
	private String titulo, autor, genero;
	private int anioPublicacion;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}



	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	Libro() {
		titulo = "";
		autor = "";
		genero = "";
		anioPublicacion = 0;
	}

	public Libro(String titulo, String autor, String genero, int anioPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anioPublicacion = anioPublicacion;
	}

	void mostrar() {
		System.out.println("Libro[" + genero + ", " + anioPublicacion + ", " + titulo + ", " + autor + "]");
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Libro...");
		System.out.println("Titulo?");
		titulo = sc.nextLine();
		System.out.println("Autor?");
		autor = sc.nextLine();
		System.out.println("Genero?");
		genero = sc.nextLine();
		System.out.println("anio publicacion?");
		anioPublicacion = sc.nextInt();
	}
}
