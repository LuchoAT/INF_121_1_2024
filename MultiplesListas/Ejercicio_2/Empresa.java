package Ejercicio_2;
import java.util.Scanner;

public class Empresa {
	private String nombreEmpresa;
	private int nroMoviles;
	private ListaSimpleNormalMovil LSNM;
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public int getNroMoviles() {
		return nroMoviles;
	}
	public void setNroMoviles(int nroMoviles) {
		this.nroMoviles = nroMoviles;
	}
	public ListaSimpleNormalMovil getLSNM() {
		return LSNM;
	}
	public void setLSNM(ListaSimpleNormalMovil lSNM) {
		LSNM = lSNM;
	}
	
	
	Empresa(){
		nombreEmpresa="";
		nroMoviles=0;
		LSNM=new ListaSimpleNormalMovil();		
	}
	
	
	void leer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Empresa...");
		System.out.println("Nombre?");
		nombreEmpresa=sc.nextLine();
		System.out.println("nroMoviles?");
		nroMoviles=sc.nextInt();
		LSNM.llenarFinal(nroMoviles);	
	}
	
	void mostrar() {
		System.out.println("Empresa[Nombre = "+nombreEmpresa+", nroMoviles = "+nroMoviles+",  ");
		LSNM.mostrar();
		System.out.println("]\n");
	}
	
}
