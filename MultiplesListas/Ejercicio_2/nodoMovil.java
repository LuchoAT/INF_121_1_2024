package Ejercicio_2;


public class nodoMovil {
	//el valor que almacena el nodo
	private Movil x;
	//la direccion a un nodo siguiente
	private nodoMovil sig;
	
	

	
	public Movil getX() {
		return x;
	}

	public void setX(Movil x) {
		this.x = x;
	}

	public nodoMovil getSig() {
		return sig;
	}

	public void setSig(nodoMovil sig) {
		this.sig = sig;
	}

	nodoMovil(){
		sig=null;
	}
	
}
