package Ejercicio_2;

public class nodoCliente {
	private nodoCliente sig, ant;
	private Cliente x;

	public nodoCliente getSig() {
		return sig;
	}

	public void setSig(nodoCliente sig) {
		this.sig = sig;
	}

	public nodoCliente getAnt() {
		return ant;
	}

	public void setAnt(nodoCliente ant) {
		this.ant = ant;
	}

	public Cliente getX() {
		return x;
	}

	public void setX(Cliente x) {
		this.x = x;
	}

	nodoCliente() {
		sig = ant = null;
	}

}
