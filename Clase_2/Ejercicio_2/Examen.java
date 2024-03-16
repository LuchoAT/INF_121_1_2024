package Ejercicio_2;

import java.util.Scanner;

public class Examen {
	private String nombreEstudiante, siglaMateria;
	private double nota;

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getSiglaMateria() {
		return siglaMateria;
	}

	public void setSiglaMateria(String siglaMateria) {
		this.siglaMateria = siglaMateria;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	
	Examen(){
		nombreEstudiante=siglaMateria="";
		nota=0;
	}
	
	
	Examen(String nombreEstudiante, String siglaMateria, double nota){
		this.nombreEstudiante=nombreEstudiante;
		this.siglaMateria=siglaMateria;
		this.nota=nota;
	}
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Examen...");
		System.out.println("nombreEstudiante?");
		this.nombreEstudiante=sc.nextLine();
		System.out.println("sigla materia?");
		this.siglaMateria=sc.nextLine();
		System.out.println("nota?");
		this.nota=sc.nextDouble();		
	}
	
	
	void mostrar() {
		System.out.println("Examen["+this.nombreEstudiante+", "+this.siglaMateria+", "+this.nota+"]");		
	}	
}
