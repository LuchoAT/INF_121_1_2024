package Ejercicio_2;
import java.util.Scanner;

public class Movil {
	private boolean libre_Ocupado;
	private int nroPlaca;
	private int capacidad;
	public boolean isLibre_Ocupado() {
		return libre_Ocupado;
	}
	public void setLibre_Ocupado(boolean libre_Ocupado) {
		this.libre_Ocupado = libre_Ocupado;
	}
	public int getNroPlaca() {
		return nroPlaca;
	}
	public void setNroPlaca(int nroPlaca) {
		this.nroPlaca = nroPlaca;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	Movil(){
		libre_Ocupado=false;
		nroPlaca=0;
		capacidad=0;
	}
	public Movil(boolean libre_Ocupado, int nroPlaca, int capacidad) {
		super();
		this.libre_Ocupado = libre_Ocupado;
		this.nroPlaca = nroPlaca;
		this.capacidad = capacidad;
	}
	
	
	void mostrar() {
		System.out.println("Movil["+libre_Ocupado+", "+nroPlaca+", "+capacidad+"]");	
	}
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Movil...");
		System.out.println("nroPlaca?");
		nroPlaca=sc.nextInt();
		System.out.println("capacidad?");
		capacidad=sc.nextInt();
		sc.nextLine();
		System.out.println("libre?(si/no)");
		String resp=sc.nextLine();
		if(resp.equals("si")) {
			libre_Ocupado=true;
		}else {
			libre_Ocupado=false;			
		}	
	}
	
	
	
	
	
}
