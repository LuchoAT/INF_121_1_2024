package Ejercicio_1;
import java.util.Scanner;

public class Principal {
	
	static void moverVocalConsonante(PilaChar A) {
		PilaChar voc,con;
		voc=new PilaChar();
		con=new PilaChar();
		while(!A.esVacia()) {
			char x=A.eliminar();
			if(x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U') {
				voc.adicionar(x);
			}else {
				con.adicionar(x);
			}
		}	
		A.vaciar(con);
		A.vaciar(voc);
	}
	
	
	
	static void eliminarRep(PilaChar A) {
		PilaChar aux1,valUnic;
		aux1=new PilaChar();
		valUnic=new PilaChar();
		while(!A.esVacia()) {
			char v1=A.eliminar();
			int cnt=0;
			//quitamos un elemento
			while(!A.esVacia()) {
				char v2=A.eliminar();
				if(v1==v2) {
					cnt++;
				}				
				aux1.adicionar(v2);
			}
			if(cnt==0) {
				//no hay mas elementos
				//v1 se guarda?
				valUnic.adicionar(v1);
				A.vaciar(aux1);
			}else {
				//ignoramos todo lo igual a v1
				while(!aux1.esVacia()) {
					char ch=aux1.eliminar();
					if(ch!=v1) {
						A.adicionar(ch);
					}
				}
			}
		}
		A.vaciar(valUnic);
	}
	
	
	static void eliminarAp(PilaChar A, PilaChar B) {
		PilaChar auxA,auxB;
		auxA=new PilaChar();
		auxB=new PilaChar();
		
		//Recorremos los valores que hay 
		//en A
		while(!A.esVacia()) {
			char v1=A.eliminar();
			int cnt=0;
			//Contaremos cuantos valores
			//en B son iguales a la variable v1
			while(!B.esVacia()) {
				char v2=B.eliminar();
				if(v1==v2) {
					cnt++;
				}
				auxB.adicionar(v2);
			}
			B.vaciar(auxB);
			if(cnt==0) {
				auxA.adicionar(v1);
			}
		}
		A.vaciar(auxA);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PilaChar A=new PilaChar();
		PilaChar B=new PilaChar();
		int n=sc.nextInt();
		sc.nextLine();
		A.llenar(n);
		A.mostrar();
		
		int m=sc.nextInt();
		B.llenar(m);
		B.mostrar();
		
		/*
		//Inciso a)
		moverVocalConsonante(A);
		A.mostrar();
		
		//Inciso b)
		eliminarRep(A);
		A.mostrar();
		*/
		
		System.out.println("Inciso c)");
		//Inciso c)
		eliminarAp(A,B);
		A.mostrar();
		B.mostrar();
		
		
	}
}

/*
	int 
	String cad nextLine()
	String cad nextLine()
	String cad nextLine()
	



*/
