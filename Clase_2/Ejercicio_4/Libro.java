package Ejercicio_4;

import java.util.Scanner;

public class Libro {
	private String titulo;
	private int nroPagina;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNroPagina() {
		return nroPagina;
	}
	public void setNroPagina(int nroPagina) {
		this.nroPagina = nroPagina;
	}
	
	Libro(){
		titulo="";
		nroPagina=0;
	}
	
	Libro(String titulo, int nroPagina){
		this.titulo=titulo;
		this.nroPagina=nroPagina;
	}
	
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Libro...");
		System.out.println("Titulo?");
		this.titulo=sc.nextLine();
		System.out.println("nroPagina?");
		this.nroPagina=sc.nextInt();
	}
	
	void mostrar() {
		System.out.println("Libro["+this.getTitulo()+", "+this.getNroPagina()+"]");
	}	
	
	
}
