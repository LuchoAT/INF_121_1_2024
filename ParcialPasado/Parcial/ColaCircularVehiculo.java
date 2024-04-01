package Parcial;


import java.util.Scanner;

public class ColaCircularVehiculo extends ColaVehiculo{
	ColaCircularVehiculo() {
		super();
	}
	
	public int nroElementos() {
		return (fi - fr + max) % max;
	}
	
	
	public boolean esVacia() {
		if(nroElementos() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElementos() == max-1)
			return true;
		return false;
	}
	
	
	public void adicionar(Vehiculo elem) {
		if(!esLlena()) {
			fi = (fi + 1) % max;
			v[fi] = elem;
		}else {
			System.out.println("cola circular llena!!!");
		}
	}
	public Vehiculo eliminar() {
		Vehiculo elem=new Vehiculo();
		if(!esVacia()) {
			fr = (fr + 1) % max;
			elem = v[fr];
		}else {
			System.out.println("Cola circular vacia!!");
		}
		return elem;
	}
	
	public void vaciar(ColaCircularVehiculo z) {
		while(!z.esVacia()) {
			adicionar(z.eliminar());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Vehiculo x=new Vehiculo();
			x.leer();
			adicionar(x);
		}
	}
	public void mostrar() {
		ColaCircularVehiculo aux = new ColaCircularVehiculo();
		System.out.println("Cola Circular Vehiculo:");
		while(!esVacia()) {
			Vehiculo elem = eliminar();
			elem.mostrar();
			aux.adicionar(elem);
		}
		vaciar(aux);
	}
	
}
