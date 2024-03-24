package Ejercicio2;


import java.util.Scanner;

public class ColaCircularPilaMascota extends ColaPilaMascota{
	ColaCircularPilaMascota() {
		super();
	}
	
	public int nroElem() {
		return (fi - fr + max) % max;
	}
	
	
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == max-1)
			return true;
		return false;
	}
	
	
	public void adicionar(PilaMascota elem) {
		if(!esLlena()) {
			fi = (fi + 1) % max;
			v[fi] = elem;
		}else {
			System.out.println("cola circular llena!!!");
		}
	}
	public PilaMascota eliminar() {
		PilaMascota elem=new PilaMascota();
		if(!esVacia()) {
			fr = (fr + 1) % max;
			elem = v[fr];
		}else {
			System.out.println("Cola circular vacia!!");
		}
		return elem;
	}
	
	public void vaciar(ColaCircularPilaMascota z) {
		while(!z.esVacia()) {
			adicionar(z.eliminar());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			PilaMascota x=new PilaMascota();
			System.out.println("intro cuantas mascotas");
			int k=sc.nextInt();
			x.llenar(k);
			adicionar(x);
		}
	}
	public void mostrar() {
		ColaCircularPilaMascota aux = new ColaCircularPilaMascota();
		System.out.println("Cola Circular PilaMascota:");
		while(!esVacia()) {
			PilaMascota elem = eliminar();
			elem.mostrar();
			aux.adicionar(elem);
		}
		vaciar(aux);
	}
	
}
