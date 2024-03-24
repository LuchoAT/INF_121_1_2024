package Ejercicio4;

import java.util.Scanner;

public class Carrera {
	private String nombreCarrera,nombreFacultad;
	private int nroEstudiantes;
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public String getNombreFacultad() {
		return nombreFacultad;
	}
	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}
	public int getNroEstudiantes() {
		return nroEstudiantes;
	}
	public void setNroEstudiantes(int nroEstudiantes) {
		this.nroEstudiantes = nroEstudiantes;
	}
	Carrera(){
		nombreCarrera=nombreFacultad="";
		nroEstudiantes=0;
	}
	
	void mostrar() {
		System.out.println("Carrera["+nombreCarrera+", "+nroEstudiantes+", "+nombreFacultad+"]");
	}
	
	void leer() {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Carrera...");
		System.out.println("nombre carrera?");
		nombreCarrera=sc.nextLine();
		System.out.println("nombrefacultad?");
		nombreFacultad=sc.nextLine();
		System.out.println("nroEstudiantes?");
		nroEstudiantes=sc.nextInt();
	}
	
	
	
	
}
