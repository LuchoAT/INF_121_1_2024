package Ejercicio_4;

public class nodoEstudiante {
	private nodoEstudiante sig, ant;
	private Estudiante x;

	nodoEstudiante() {
		sig = ant = null;
	}

	public nodoEstudiante getSig() {
		return sig;
	}

	public void setSig(nodoEstudiante sig) {
		this.sig = sig;
	}

	public nodoEstudiante getAnt() {
		return ant;
	}

	public void setAnt(nodoEstudiante ant) {
		this.ant = ant;
	}

	public Estudiante getX() {
		return x;
	}

	public void setX(Estudiante x) {
		this.x = x;
	}
}
