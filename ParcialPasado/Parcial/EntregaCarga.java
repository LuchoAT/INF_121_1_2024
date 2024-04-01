package Parcial;

import java.util.Scanner;

public class EntregaCarga {
	private String cliente, pais;
	private MC_ColaSimpleVehiculo mc;

	EntregaCarga() {
		cliente = pais = "";
		mc=new MC_ColaSimpleVehiculo();
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public MC_ColaSimpleVehiculo getMc() {
		return mc;
	}

	public void setMc(MC_ColaSimpleVehiculo mc) {
		this.mc = mc;
	}

	EntregaCarga(String cliente, String pais, MC_ColaSimpleVehiculo mc) {
		this.cliente = cliente;
		this.pais = pais;
		this.mc = mc;
	}

	void mostrar() {
		System.out.println("EntregaCarga[" + cliente + ", " + pais + ", ");
		mc.mostrar();
		System.out.println("]\n");
	}
	
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("EntregaCarga...");
		System.out.println("Cliente?");
		cliente=sc.nextLine();
		System.out.println("Pais?");
		pais=sc.nextLine();
		System.out.println("Cuantas colas de vehiculos?");
		int n=sc.nextInt();
		mc.llenar(n);
	}
	


}
