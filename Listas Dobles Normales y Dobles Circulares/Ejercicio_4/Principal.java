package Ejercicio_4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDobleCircularEstudiante A=new ListaDobleCircularEstudiante();
		A.adicionarFinal(new Estudiante("n1",1,1));
		A.adicionarFinal(new Estudiante("n2",2,2));
		A.adicionarFinal(new Estudiante("n3",3,3));
		A.adicionarFinal(new Estudiante("n4",4,4));
		A.adicionarFinal(new Estudiante("n5",5,5));
		
		int n=A.nroNodos();
		nodoEstudiante r=A.getP();
		for(int i=0;i<n;i++) {
			// r.ant r r.sig
			System.out.println(r.getAnt().getX().getNota()+", "+r.getX().getNota()+", "+r.getSig().getX().getNota());			
			r=r.getSig();
		}	
	}

}
