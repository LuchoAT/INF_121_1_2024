package Ejercicio10;

import java.util.Scanner;

public class Materia {
	private String nombre,sigla;
	private PilaEstudiante PE;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public PilaEstudiante getPE() {
		return PE;
	}
	public void setPE(PilaEstudiante pE) {
		PE = pE;
	}
	
	
	Materia(){
		nombre=sigla="";
		PE=new PilaEstudiante();
	}
	
	
	public Materia(String nombre, String sigla, PilaEstudiante pE) {
		super();
		this.nombre = nombre;
		this.sigla = sigla;
		PE = pE;
	}
	void mostrar() {
		System.out.println("Materia["+nombre+", "+sigla+", ");
		PE.mostrar();
		System.out.println("]");
	}
	
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Materia...");
		System.out.println("nombre?");
		nombre=sc.nextLine();
		System.out.println("sigla?");
		sigla=sc.nextLine();
		System.out.println("Cuantos estudiantes?");
		int c=sc.nextInt();
		PE.llenar(c);		
	}
	
	
}
