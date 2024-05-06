package Ejercicio_4;

import java.util.Scanner;

public class Estudiante{
	private String nombre;
	private double nota;
	private int ci;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	
	Estudiante(){
		nombre="";
		nota=0;
		ci=0;
		
	}
	public Estudiante(String nombre, double nota, int ci) {
		super();
		this.nombre = nombre;
		this.nota = nota;
		this.ci = ci;
	}
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Estudiante...");
		System.out.println("Nombre?");
		nombre=sc.nextLine();
		System.out.println("Ci?");
		ci=sc.nextInt();
		System.out.println("nota?");
		nota=sc.nextDouble();
	}
	
	void mostrar() {
		System.out.println("Estudiante["+nombre+", "+ci+", "+nota+"]");
	}
	

}
