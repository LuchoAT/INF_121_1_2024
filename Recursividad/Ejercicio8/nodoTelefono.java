package Ejercicio8;

public class nodoTelefono {
	private Telefono x;
	private nodoTelefono sig;

	nodoTelefono() {
		sig = null;
	}

	public Telefono getX() {
		return x;
	}

	public void setX(Telefono x) {
		this.x = x;
	}

	public nodoTelefono getSig() {
		return sig;
	}

	public void setSig(nodoTelefono sig) {
		this.sig = sig;
	}
}
