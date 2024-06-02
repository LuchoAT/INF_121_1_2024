package Ejercicio10;

import java.util.Scanner;

public class Examen {
	private int nroEvaluacion, nota;

	public int getNroEvaluacion() {
		return nroEvaluacion;
	}

	public void setNroEvaluacion(int nroEvaluacion) {
		this.nroEvaluacion = nroEvaluacion;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	Examen(){
		nota=nroEvaluacion=0;
	}

	public Examen(int nroEvaluacion, int nota) {
		super();
		this.nroEvaluacion = nroEvaluacion;
		this.nota = nota;
	}
	
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nroEvaluacion?");
		nroEvaluacion=sc.nextInt();
		System.out.println("nota?");
		nota=sc.nextInt();
	}
	
	
	void mostrar() {
		System.out.println("Examen["+nroEvaluacion+", "+nota+"]");
	}
	
	
}
