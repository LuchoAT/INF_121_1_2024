package Ejercicio_2;

public class ListaSimpleNum {
	//Creamos como atributo la direccion
	//Del primer nodo de una lista
	protected nodoNum p;
	ListaSimpleNum(){
		//Por defecto una lista esta vacia
		p=null;
	}
	public nodoNum getP() {
		return p;
	}
	public void setP(nodoNum p) {
		this.p = p;
	}
}
