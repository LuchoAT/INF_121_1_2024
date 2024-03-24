package Ejercicio10;

import java.util.Scanner;

public class Servicio {
	private String idServicio, tipoServicio;

	public String getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(String idServicio) {
		this.idServicio = idServicio;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	Servicio() {
		tipoServicio = idServicio = "";
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Servicio...");
		System.out.println("idServicio?");
		idServicio = sc.nextLine();
		System.out.println("tipoServicio?");
		tipoServicio = sc.nextLine();
	}

	void mostrar() {
		System.out.println("Servicio[" + idServicio + ", " + tipoServicio + "]");
	}

}
