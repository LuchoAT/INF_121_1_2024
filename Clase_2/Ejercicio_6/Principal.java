package Ejercicio_6;

import java.util.Scanner;

public class Principal {
	
	//ordenar por edad ascendentemente
	static int menorEdad(ColaCircularMichi A) {
		int menor=10000;
		int n=A.nroElem();
		for(int i=0;i<n;i++) {
			Michi x=A.eliminar();
			if(x.getEdad()<menor) {
				menor=x.getEdad();
			}
			A.adicionar(x);
		}
		return menor;
	}
	
	
	static void ordenar(ColaCircularMichi A) {
		ColaCircularMichi ord=new ColaCircularMichi();
		while(!A.esVacia()) {
			int menor=menorEdad(A);
			int n=A.nroElem();
			for(int i=0;i<n;i++) {
				Michi x=A.eliminar();
				if(x.getEdad()==menor) {
					ord.adicionar(x);
				}else {
					A.adicionar(x);
				}				
			}		
		}	
		A.vaciar(ord);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ColaCircularMichi A=new ColaCircularMichi();
		A.llenar(sc.nextInt());
		A.mostrar();
		ordenar(A);
		A.mostrar();
	}

}
