package Ejercicio6;

import java.util.Scanner;

public class Libro {
	private String titulo,genero;
	private int nroPag;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getNroPag() {
		return nroPag;
	}
	public void setNroPag(int nroPag) {
		this.nroPag = nroPag;
	}
	
	Libro(){
		titulo="";
		genero="";
		nroPag=0;
	}
	public Libro(String titulo, String genero, int nroPag) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.nroPag = nroPag;
	}
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Libro....");
		System.out.println("Titulo?");
		titulo=sc.nextLine();
		System.out.println("Genero?");
		genero=sc.nextLine();
		System.out.println("nroPaginas?");
		nroPag=sc.nextInt();
	}
	void mostrar() {
		System.out.println("Libro["+titulo+", "+genero+", "+nroPag+"]");	
	}
	
}
