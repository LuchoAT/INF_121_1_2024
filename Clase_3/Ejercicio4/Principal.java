package Ejercicio4;

import java.util.Scanner;

public class Principal {
	
	//inciso a)
	void mostrarMaxEstudiantes(MP_PilaCarrera A) {
		int mayor=0;
		for(int i=0;i<A.getN();i++) {
			PilaCarrera aux=new PilaCarrera();
			while(!A.esVacia(i)) {
				Carrera x=A.eliminar(i);
				if(x.getNroEstudiantes()>mayor) {
					mayor=x.getNroEstudiantes();
				}
				aux.adicionar(x);
			}
			A.vaciar(i, aux);
		}	
		
		for(int i=0;i<A.getN();i++) {
			PilaCarrera aux=new PilaCarrera();
			while(!A.esVacia(i)) {
				Carrera x=A.eliminar(i);
				if(x.getNroEstudiantes()==mayor) {
					System.out.println(x.getNombreCarrera());
				}
				aux.adicionar(x);
			}
			A.vaciar(i, aux);
		}
		
	}
	
	static void eliminarFacu(MP_PilaCarrera A, String X) {
		 for(int i=0;i<A.getN();i++) {
			 PilaCarrera aux=new PilaCarrera();
			 while(!A.esVacia(i)) {
				 Carrera x=A.eliminar(i);
				 if(!x.getNombreFacultad().equals(X)) {
					 aux.adicionar(x);
				 }				 
			 }
			 A.vaciar(i, aux);
		 }
		 
		 
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MP_PilaCarrera A=new MP_PilaCarrera();
		A.llenar(4);
		A.mostrar();
		
	}

}
