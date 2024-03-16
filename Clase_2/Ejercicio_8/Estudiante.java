package Ejercicio_8;

import java.util.Scanner;

public class Estudiante {
	private String nombre;
	private int ci;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	Estudiante(){
		nombre="";
		ci=0;
	}
	
	Estudiante(String nombre, int ci){
		this.nombre=nombre;
		this.ci=ci;
	}
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Estudiante...");
		System.out.println("nombre?");
		this.nombre=sc.nextLine();
		System.out.println("ci?");
		this.ci=sc.nextInt();
	}
	
	void mostrar() {
		System.out.println("Estudiante["+this.nombre+", "+this.ci+"]");		
	}
	
	
}
