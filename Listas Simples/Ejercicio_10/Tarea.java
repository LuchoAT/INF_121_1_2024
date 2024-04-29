package Ejercicio_10;

import java.util.Scanner;

public class Tarea {
	private String nombreTarea, descripcion, fechaVencimiento;

	public String getNombreTarea() {
		return nombreTarea;
	}

	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	Tarea() {
		nombreTarea = "";
		fechaVencimiento = "";
		descripcion = "";
	}

	public Tarea(String nombreTarea, String descripcion, String fechaVencimiento) {
		super();
		this.nombreTarea = nombreTarea;
		this.descripcion = descripcion;
		this.fechaVencimiento = fechaVencimiento;
	}

	void mostrar() {
		System.out.println("Tarea[" + nombreTarea + ", " + descripcion + ", " + fechaVencimiento + "]");
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tarea...");
		System.out.println("Nombre tarea?");
		nombreTarea = sc.nextLine();
		System.out.println("Descripcion?");
		descripcion = sc.nextLine();
		System.out.println("Fecha vencimiento?");
		fechaVencimiento = sc.nextLine();
	}

}
