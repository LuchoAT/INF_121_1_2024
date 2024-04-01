package Parcial;

import java.util.Scanner;

public class Carga {
	private String tipoCarga;
	private double valorBS, pesoKG;

	// Constructores:
	// 1) Valores por default
	Carga() {
		tipoCarga = "";
		valorBS = pesoKG = 0;
	}

	// 2) Valores enviados desde el Principal
	Carga(String tipoCarga, double valorBS, double pesoKG) {
		this.tipoCarga = tipoCarga;
		this.valorBS = valorBS;
		this.pesoKG = pesoKG;
	}

	/*
	 * Nota: , this se refiere al objeto actual en el que se está trabajando, y se
	 * utiliza para evitar la ambigüedad entre los parametros y los atributos de la
	 * clase. Ejemplo: this.tipoCarga=tipoCarga
	 */

	public String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	public double getValorBS() {
		return valorBS;
	}

	public void setValorBS(double valorBS) {
		this.valorBS = valorBS;
	}

	public double getPesoKG() {
		return pesoKG;
	}

	public void setPesoKG(double pesoKG) {
		this.pesoKG = pesoKG;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Carga...");
		System.out.println("tipoCarga?");
		tipoCarga = sc.nextLine();
		System.out.println("ValorBS?");
		valorBS = sc.nextDouble();
		System.out.println("PesoKG?");
		pesoKG = sc.nextDouble();
	}

	void mostrar() {
		System.out.println("Carga[" + tipoCarga + ", valor = " + valorBS + ", peso = " + pesoKG + "]");
	}

}
