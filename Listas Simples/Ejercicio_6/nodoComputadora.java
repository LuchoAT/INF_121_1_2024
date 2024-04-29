package Ejercicio_6;

public class nodoComputadora {
	private nodoComputadora sig;
	private Computadora x;
	public nodoComputadora() {
		sig=null;
	}
	public nodoComputadora getSig() {
		return sig;
	}
	public void setSig(nodoComputadora sig) {
		this.sig = sig;
	}
	public Computadora getX() {
		return x;
	}
	public void setX(Computadora x) {
		this.x = x;
	}
}
