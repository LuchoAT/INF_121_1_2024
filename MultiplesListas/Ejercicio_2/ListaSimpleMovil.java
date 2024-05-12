package Ejercicio_2;


public class ListaSimpleMovil {
	//Creamos como atributo la direccion
	//Del primer nodo de una lista
	protected nodoMovil p;
	ListaSimpleMovil(){
		//Por defecto una lista esta vacia
		p=null;
	}
	public nodoMovil getP() {
		return p;
	}
	public void setP(nodoMovil p) {
		this.p = p;
	}
}
