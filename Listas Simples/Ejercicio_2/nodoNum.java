package Ejercicio_2;

public class nodoNum {
	//el valor que almacena el nodo
	private int x;
	//la direccion a un nodo siguiente
	private nodoNum sig;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public nodoNum getSig() {
		return sig;
	}

	public void setSig(nodoNum sig) {
		this.sig = sig;
	}

	nodoNum(){
		sig=null;
	}
	
}
