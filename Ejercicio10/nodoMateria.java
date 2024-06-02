package Ejercicio10;

public class nodoMateria {
	private Materia x;
	private nodoMateria sig;

	nodoMateria() {
		sig = null;
	}

	public Materia getX() {
		return x;
	}

	public void setX(Materia x) {
		this.x = x;
	}

	public nodoMateria getSig() {
		return sig;
	}

	public void setSig(nodoMateria sig) {
		this.sig = sig;
	}
}
