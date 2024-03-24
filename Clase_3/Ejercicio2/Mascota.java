package Ejercicio2;
import java.util.Scanner;

public class Mascota {
	private String nombreMascota, tipoMascota, fechaRegistro;
	private int idMascota;
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	
	Mascota(){
		nombreMascota=tipoMascota=fechaRegistro="";
		idMascota=0;
	}
	public Mascota(String nombreMascota, String tipoMascota, String fechaRegistro, int idMascota) {
		super();
		this.nombreMascota = nombreMascota;
		this.tipoMascota = tipoMascota;
		this.fechaRegistro = fechaRegistro;
		this.idMascota = idMascota;
	}
	
	
	void mostrar() {
		System.out.println("Mascota["+nombreMascota+", "+idMascota+", "+tipoMascota+", "+fechaRegistro+"]");
	}
	
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mascota...");
		System.out.println("Nombre?");
		nombreMascota=sc.nextLine();
		System.out.println("idMascota?");
		idMascota=sc.nextInt();
		sc.nextLine();
		System.out.println("tipoMascota?");
		tipoMascota=sc.nextLine();
		System.out.println("fecha?");
		fechaRegistro=sc.nextLine();
	}

}
