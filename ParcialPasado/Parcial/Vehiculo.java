package Parcial;

import java.util.Scanner;

public class Vehiculo {
	private String conductor, placa;
	private PilaCarga pc;

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public PilaCarga getPc() {
		return pc;
	}

	public void setPc(PilaCarga pc) {
		this.pc = pc;
	}

	Vehiculo() {
		conductor = placa = "";
		pc = new PilaCarga();
	}

	Vehiculo(String conductor, String placa, PilaCarga pc) {
		this.conductor = conductor;
		this.placa = placa;
		this.pc = pc;
	}

	void mostrar() {
		System.out.println("Vehiculo[" + conductor + ", " + placa + ", ");
		pc.mostrar();
		System.out.println("]");
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vehiculo...");
		System.out.println("Conductor?");
		conductor = sc.nextLine();
		System.out.println("Placa?");
		placa = sc.nextLine();
		System.out.println("Cuantas cargas?");
		int n = sc.nextInt();
		pc.llenar(n);
	}

}
