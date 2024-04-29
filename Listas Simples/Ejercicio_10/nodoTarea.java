package Ejercicio_10;

public class nodoTarea {
	private nodoTarea sig;
	private Tarea x;
	public nodoTarea getSig() {
		return sig;
	}
	public void setSig(nodoTarea sig) {
		this.sig = sig;
	}
	public Tarea getX() {
		return x;
	}
	public void setX(Tarea x) {
		this.x = x;
	}
	nodoTarea(){
		sig=null;
	}
	
}
