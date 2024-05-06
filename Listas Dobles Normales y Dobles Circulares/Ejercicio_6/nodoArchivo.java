package Ejercicio_6;

public class nodoArchivo {
	private nodoArchivo sig, ant;
	private Archivo x;

	nodoArchivo() {
		sig = ant = null;
	}

	public nodoArchivo getSig() {
		return sig;
	}

	public void setSig(nodoArchivo sig) {
		this.sig = sig;
	}

	public nodoArchivo getAnt() {
		return ant;
	}

	public void setAnt(nodoArchivo ant) {
		this.ant = ant;
	}

	public Archivo getX() {
		return x;
	}

	public void setX(Archivo x) {
		this.x = x;
	}
}
