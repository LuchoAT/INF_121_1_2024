package Ejercicio8;

public class ListaSimpleCircularTelefono extends ListaSimpleTelefono{

	ListaSimpleCircularTelefono() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	void adicionar(Telefono x) {
		nodoTelefono nuevoNodo=new nodoTelefono();
		nuevoNodo.setX(x);
		if(p==null) {
			this.setP(nuevoNodo);
			this.getP().setSig(nuevoNodo);
		}else {
			nodoTelefono r=this.getP();
			while(r.getSig()!=this.getP()) {
				r=r.getSig();
			}
			r.setSig(nuevoNodo);
			nuevoNodo.setSig(this.getP());			
		}
	}
	
	void mostrar() {
		if(getP()==null) {
			System.out.println("Lista vacia!");
		}else {
			nodoTelefono r=this.getP();
			while(r.getSig()!=this.getP()) {
				r.getX().mostrar();
				r=r.getSig();
			}
			r.getX().mostrar();		
		}
		
	}
	
	
	
	
}
