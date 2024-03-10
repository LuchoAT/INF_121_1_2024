package Ejercicio_2;

import java.util.Scanner;

public class Practica {
	private int nota, nroPractica;
	private String nombre;
	
	//constructor 1: datos por default
	Practica(){
		nota=nroPractica=0;
		nombre="";
	}
	
	//contructor 2: datos por parametro desde el principal
	Practica(int nota, String nombre, int nroPractica){
		this.nota=nota;
		this.nombre=nombre;
		this.nroPractica=nroPractica;
	}
	

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getNroPractica() {
		return nroPractica;
	}

	public void setNroPractica(int nroPractica) {
		this.nroPractica = nroPractica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Practica...");
		System.out.println("nota?");
		nota=sc.nextInt();
		sc.nextLine();
		System.out.println("nombre?");
		nombre=sc.nextLine();
		System.out.println("nro Practica?");
		nroPractica=sc.nextInt();
	}
	
	
	void mostrar() {
		System.out.println("Practica["+this.nombre+", "+this.getNota()+", "+this.getNroPractica()+"]");
	}	
}
