package Ejercicio_8;

import java.util.Scanner;

public class Evaluacion {
	private int ci, nota;

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	Evaluacion(){
		ci=nota=0;
	}
	
	Evaluacion(int ci, int nota){
		this.ci=ci;
		this.nota=nota;
	}
	
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Evaluacion...");
		System.out.println("CI?");
		this.ci=sc.nextInt();
		System.out.println("Nota?");
		this.nota=sc.nextInt();
	}
	
	void mostrar() {
		System.out.println("Evaluacion["+this.nota+", CI="+this.ci+"]");
	}
	
}
