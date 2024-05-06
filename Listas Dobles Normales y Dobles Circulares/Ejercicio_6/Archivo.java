package Ejercicio_6;

import java.util.Scanner;

public class Archivo {
	private String tipo,fecha;
	double capacidad;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	Archivo(){
		tipo=fecha="";
		capacidad=0;
	}
	public Archivo(String tipo, String fecha, double capacidad) {
		super();
		this.tipo = tipo;
		this.fecha = fecha;
		this.capacidad = capacidad;
	}
	
	
	void mostrar() {
		System.out.println("Archivo[ tipo = "+tipo+", capacidad = "+capacidad+", fecha = "+fecha+"]");
	}
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Archivo...");
		System.out.println("tipo?");
		tipo=sc.nextLine();
		System.out.println("Fecha?");
		fecha=sc.nextLine();
		System.out.println("Capacidad?");
		capacidad=sc.nextDouble();
	}
	
}
