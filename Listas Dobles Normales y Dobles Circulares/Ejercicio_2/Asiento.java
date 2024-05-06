package Ejercicio_2;

import java.util.Scanner;

public class Asiento {
	private int columna;
	private String fila;
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	
	Asiento(){
		columna=0;
		fila="";
	}
	public Asiento(int columna, String fila) {
		super();
		this.columna = columna;
		this.fila = fila;
	}
	
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Asiento...");
		System.out.println("Fila?");
		fila=sc.nextLine();
		System.out.println("Columna?");
		columna=sc.nextInt();
	}
	
	void mostrar() {
		System.out.println("Asiento[ Fila  = "+fila+", Columna = "+columna+"]");
	}

}
