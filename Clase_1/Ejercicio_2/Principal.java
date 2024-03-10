package Ejercicio_2;

import java.util.Scanner;

public class Principal {

	//a)Mostrar aprobados
	static void mostrarAprobados(PilaPractica A) {
		PilaPractica auxA=new PilaPractica();
		while(!A.esVacia()) {
			Practica x=A.eliminar();
			if(x.getNota()>=51) {
				x.mostrar();
			}
			auxA.adicionar(x);			
		}
		A.vaciar(auxA);
	}
	
	
	//b) Verificar
	
	static boolean verificarEstudiante(PilaPractica A, String X) {
		int existe=0;
		PilaPractica auxA=new PilaPractica();
		while(!A.esVacia()) {
			Practica x=A.eliminar();
			if(x.getNombre().equals(X)) {
				existe=1;
			}
		}
		A.vaciar(auxA);
		//existe = 1 retornamos true
		//existe = 0 retornamos false
		return (existe==1);
	}
	
	
	//c)
	static double promedio(PilaPractica A, int k) {
		int S=0,cnt=0;
		PilaPractica auxA=new PilaPractica();
		while(!A.esVacia()) {
			Practica x=A.eliminar();
			if(x.getNroPractica()==k) {
				S=S+x.getNota();
				cnt++;
			}
			auxA.adicionar(x);
		}
		A.vaciar(auxA);
		if(cnt>0) {
			double res=(double)S/(double)cnt;
			return res;
		}else {
			return -1;
		}		
	}
	
	//d) Ordenar las practicas ascendentemente  por la nota
	//
	
	//1. Creamos una funcion que nos devuelva 
	//cual es la nota mas GRANDE en la pila A
	
	static int notaMayor(PilaPractica A) {
		int mayor=-1000;
		PilaPractica auxA=new PilaPractica();
		while(!A.esVacia()) {
			Practica x=A.eliminar();
			if(x.getNota()>mayor) {
				mayor=x.getNota();
			}
			auxA.adicionar(x);
		}
		A.vaciar(auxA);
		return mayor;
	}
	
	
	//2. Poco a poco quitar las practicas
	//con mas nota de la pila A y mandarlas a 
	//ord
	
	
	static void ordenar(PilaPractica A) {
		PilaPractica auxA,ord;
		auxA=new PilaPractica();
		ord=new PilaPractica();
		while(!A.esVacia()) {
			int nota=notaMayor(A);
			//movemos a ord todos los valores
			//iguales a nota
			while(!A.esVacia()) {
				Practica x=A.eliminar();
				if(x.getNota()==nota) {
					//x tiene una nota igual
					//al valor de la variable 
					//nota
					ord.adicionar(x);
				}else {
					auxA.adicionar(x);
				}				
			}
			A.vaciar(auxA);
		}
		A.vaciar(ord);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PilaPractica A=new PilaPractica();
		//int n=sc.nextInt();
		//A.llenar(n);
		//A.mostrar();
		
		//
		//mostrarAprobados(A);
		
		
		/*if(verificarEstudiante(A, "Miguel")) {
			System.out.println("Si existe!!!");
		}else {
			System.out.println("No existe ni una practica con ese nombre!!");
		}*/
		
		
		//System.out.println(promedio(A,1));
	
		Practica p1,p2,p3,p4,p5;
		p1=new Practica(45,"e1",1);
		p2=new Practica(100,"e2",2);
		p3=new Practica(1,"e3",3);
		p4=new Practica(0,"e4",1);
		p5=new Practica(50,"e5",2);
		
		A.adicionar(p1);
		A.adicionar(p2);
		A.adicionar(p3);
		A.adicionar(p4);
		A.adicionar(p5);

		A.mostrar();
		
		ordenar(A);
		
		A.mostrar();
	}
}
