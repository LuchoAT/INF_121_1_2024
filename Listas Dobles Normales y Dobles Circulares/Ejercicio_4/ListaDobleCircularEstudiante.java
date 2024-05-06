package Ejercicio_4;

public class ListaDobleCircularEstudiante extends ListaDobleEstudiante {
	public ListaDobleCircularEstudiante() {
		super();
	}
	
	
	void adicionarFinal(Estudiante x) {
		nodoEstudiante aux=new nodoEstudiante();
		aux.setX(x);
		if(p==null) {
			this.setP(aux);
			getP().setSig(p);
			getP().setAnt(p);
		}else {
			nodoEstudiante ultimoNodo=getP().getAnt();
			//ultimoNodo->aux->getP()
			ultimoNodo.setSig(aux);
			aux.setSig(getP());
			aux.setAnt(ultimoNodo);
			getP().setAnt(aux);
		}		
	}
	
	void llenar(int n) {
		for(int i=0;i<n;i++) {
			Estudiante x=new Estudiante();
			x.leer();
			adicionarFinal(x);
		}
	}
	
	
	
	void mostrar() {
		if(p==null) {
			System.out.println("Lista vacia");
		}else{
			nodoEstudiante r=getP();
			while(r.getSig()!=getP()) {
				r.getX().mostrar();
				r=r.getSig();
			}	
			//mostramos el valor donde se quedo r
			r.getX().mostrar();
		}
	}
	
	int nroNodos() {
		if(p==null) {
			return 0;
		}else {
			int c=0;
			nodoEstudiante r=getP();
			while(r.getSig()!=getP()) {
				c++;
				r=r.getSig();
			}	
			c++;
			return c;
		}
	}
	
}
