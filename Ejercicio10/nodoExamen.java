package Ejercicio10;

public class nodoExamen {
	private nodoExamen sig, ant;
	private Examen x;

	nodoExamen() {
		sig = ant = null;
	}

	public nodoExamen getSig() {
		return sig;
	}

	public void setSig(nodoExamen sig) {
		this.sig = sig;
	}

	public nodoExamen getAnt() {
		return ant;
	}

	public void setAnt(nodoExamen ant) {
		this.ant = ant;
	}

	public Examen getX() {
		return x;
	}

	public void setX(Examen x) {
		this.x = x;
	}
}
