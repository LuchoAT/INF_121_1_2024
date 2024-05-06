package Ejercicio_2;

public class nodoAsiento {
	private nodoAsiento sig, ant;
	private Asiento x;

	nodoAsiento() {
		sig = ant = null;
	}

	public nodoAsiento getSig() {
		return sig;
	}

	public void setSig(nodoAsiento sig) {
		this.sig = sig;
	}

	public nodoAsiento getAnt() {
		return ant;
	}

	public void setAnt(nodoAsiento ant) {
		this.ant = ant;
	}

	public Asiento getX() {
		return x;
	}

	public void setX(Asiento x) {
		this.x = x;
	}
}
