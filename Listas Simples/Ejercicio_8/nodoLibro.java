package Ejercicio_8;

public class nodoLibro {
	private nodoLibro sig;
	private Libro x;

	public nodoLibro getSig() {
		return sig;
	}

	public void setSig(nodoLibro sig) {
		this.sig = sig;
	}

	public Libro getX() {
		return x;
	}

	public void setX(Libro x) {
		this.x = x;
	}

	public nodoLibro() {
		// TODO Auto-generated constructor stub
		sig = null;
	}
}
