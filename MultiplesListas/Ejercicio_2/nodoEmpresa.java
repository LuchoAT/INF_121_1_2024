package Ejercicio_2;


public class nodoEmpresa {
	//el valor que almacena el nodo
	private Empresa x;
	//la direccion a un nodo siguiente
	private nodoEmpresa sig;
	
	

	
	
	public Empresa getX() {
		return x;
	}

	public void setX(Empresa x) {
		this.x = x;
	}

	public nodoEmpresa getSig() {
		return sig;
	}

	public void setSig(nodoEmpresa sig) {
		this.sig = sig;
	}

	nodoEmpresa(){
		sig=null;
	}
	
}
