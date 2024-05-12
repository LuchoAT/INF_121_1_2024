package Ejercicio_2;


public class ListaSimpleEmpresa {
	//Creamos como atributo la direccion
	//Del primer nodo de una lista
	protected nodoEmpresa p;
	ListaSimpleEmpresa(){
		//Por defecto una lista esta vacia
		p=null;
	}
	public nodoEmpresa getP() {
		return p;
	}
	public void setP(nodoEmpresa p) {
		this.p = p;
	}
}
