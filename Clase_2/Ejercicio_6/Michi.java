package Ejercicio_6;

import java.util.Scanner;

public class Michi {
	private String nombre;
	private int edad;
	private String genero;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	Michi(){
		nombre=genero="";
		edad=0;
	}
	
	Michi(String nombre, int edad, String genero){
		this.nombre=nombre;
		this.edad=edad;
		this.genero=genero;
	}
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Michi...");
		System.out.println("Nombre?");
		this.nombre=sc.nextLine();
		System.out.println("Edad?");
		this.edad=sc.nextInt();
		sc.nextLine();
		System.out.println("Genero?");
		this.genero=sc.nextLine();
	}
	
	
	void mostrar() {
		System.out.println("Michi["+this.nombre+", "+this.edad+", "+this.genero+"]");		
	}	
}
