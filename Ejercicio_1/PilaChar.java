package Ejercicio_1;
import java.util.Scanner;

public class PilaChar extends VectorChar{
	private int tope;
	PilaChar(){
		tope=-1;
	}
	
	boolean esVacia() {
		return tope==-1;
	}
	boolean esLlena() {
		return tope==max-1;
	}
	
	void adicionar(char x) {
		if(!esLlena()) {
			tope++;
			v[tope]=x;
		}else {
			System.out.println("Pila llena!");
		}
	}
	
	char eliminar() {
		char x=' ';
		if(!esVacia()) {
			x=v[tope];
			tope--;
		}else {
			System.out.println("Pila vacia!");
		}
		return x;
	}
	
	
	void llenar(int n) {
		for(int i=1;i<=n;i++) {
			//adicionar() n-veces
			Scanner sc=new Scanner(System.in);
			//a b c
			String x=sc.nextLine();
			//lo volvemos char
			char che=x.charAt(0);
			adicionar(che);
		}		
	}
	
	void vaciar(PilaChar aux) {
		while(!aux.esVacia()) {
			adicionar(aux.eliminar());
		}		
	}
	
	void mostrar() {
		System.out.println("Pila Chars:");
		PilaChar aux=new PilaChar();
		while(!esVacia()) {
			char ch=eliminar();
			System.out.println(ch);
			aux.adicionar(ch);
		}
		vaciar(aux);		
	}
	
	int nroElem() {
		return tope+1;
	}
	

}
