package Ejercicio_4;

public class nodoNombre {
	// el valor que almacena el nodo
	private String x;
	// la direccion a un nodo siguiente
	private nodoNombre sig;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public nodoNombre getSig() {
		return sig;
	}

	public void setSig(nodoNombre sig) {
		this.sig = sig;
	}

	nodoNombre() {
		sig = null;
	}

}
