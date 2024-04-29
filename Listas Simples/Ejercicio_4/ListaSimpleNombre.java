package Ejercicio_4;


public class ListaSimpleNombre {
	//Creamos como atributo la direccion
	//Del primer nodo de una lista
	protected nodoNombre p;
	ListaSimpleNombre(){
		//Por defecto una lista esta vacia
		p=null;
	}
	public nodoNombre getP() {
		return p;
	}
	public void setP(nodoNombre p) {
		this.p = p;
	}
}

