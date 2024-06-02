package Ejercicio10;

public class Principal {
	
	static int calcularNota(nodoExamen r2) {
		if(r2!=null) {
			return calcularNota(r2.getSig())+r2.getX().getNota();
		}else {
			return 0;
		}		
	}
	
	
	static void recorrerEstudiantes(PilaEstudiante A, PilaEstudiante aux) {
		if(!A.esVacia()) {
			Estudiante x=A.eliminar();
			System.out.println("La nota final del estudiante "+x.getNombre()+" es: "+calcularNota(x.getLDNE().getP()));			
			aux.adicionar(x);
			recorrerEstudiantes(A, aux);
		}else {
			A.vaciar(aux);
		}
	}
	
	static void recorrerMaterias(nodoMateria r1) {
		if(r1!=null) {
			//por cada nodo materia:
			//	recorremos la pila rec.
			PilaEstudiante aux=new PilaEstudiante();
			recorrerEstudiantes(r1.getX().getPE(), aux);
			recorrerMaterias(r1.getSig());
		}
	}
	
	
	
	//Inciso b))
	
	static int mayorNota(PilaEstudiante A, PilaEstudiante aux, int mayor) {
		if(!A.esVacia()) {
			//Para cada estudiante
			Estudiante x=A.eliminar();
			int notaFinal=calcularNota(x.getLDNE().getP());
			if(notaFinal>mayor) {
				mayor=notaFinal;
			}			
			aux.adicionar(x);
			return mayorNota(A,aux,mayor);
		}else {
			A.vaciar(aux);	
			return mayor;
		}
	}

	static void mostrarEstudiantes(PilaEstudiante A, PilaEstudiante aux, int notaMax) {
		if(!A.esVacia()) {
			Estudiante x=A.eliminar();
			int nota=calcularNota(x.getLDNE().getP());
			if(nota==notaMax) {
				System.out.println(x.getNombre());
			}
			aux.adicionar(x);
			mostrarEstudiantes(A, aux, notaMax);
		}else {
			A.vaciar(aux);
		}		
	}
	
	static void recMat(nodoMateria r1) {
		if(r1!=null) {
			
			System.out.println("-Los estudiantes con nota maxima de la materia "+r1.getX().getNombre()+" son: ");
			//Para cada materia calculamos la mejor nota
			PilaEstudiante aux=new PilaEstudiante();
			int notaMax=mayorNota(r1.getX().getPE(),aux,0);
			mostrarEstudiantes(r1.getX().getPE(), aux, notaMax);			
			recMat(r1.getSig());
		}		
	}
	
	
	//Inciso c)
	//
	
	static boolean verificarEstudiante(PilaEstudiante A, PilaEstudiante aux, int existe, String X) {
		if(!A.esVacia()) {
			Estudiante x=A.eliminar();
			if(x.getNombre().equals(X)) {
				existe=1;
			}
			return  verificarEstudiante(A, aux, existe, X);			
		}else {
			if(existe==1) {
				return true;
			}else {
				return false;
			}
			
		}		
	}
	
	
	static boolean verificarMat(nodoMateria r1, String X, String Y, int existe) {
		if(r1!=null) {
			if(r1.getX().getNombre().equals(Y)) {
				PilaEstudiante aux=new PilaEstudiante();
				if(verificarEstudiante(r1.getX().getPE(),aux,0,X)) {
					existe=1;
				}
			}
			return verificarMat(r1.getSig(), X, Y, existe);
		}else {
			if(existe==1) {
				return true;
			}else{
				return false;
			}			
		}		
	}
	
	
	
	
	

	public static void main(String[] args) { // TODO Auto-generated method stub
		ListaSimpleNormalMateria A = new ListaSimpleNormalMateria();


		ListaDobleNormalExamen l1 = new ListaDobleNormalExamen();
		l1.adicionarFinal(new Examen(1,30));
		l1.adicionarFinal(new Examen(2,20));
		l1.adicionarFinal(new Examen(3,21));
		ListaDobleNormalExamen l2 = new ListaDobleNormalExamen();
		l2.adicionarFinal(new Examen(1,25));
		l2.adicionarFinal(new Examen(2,35));
		l2.adicionarFinal(new Examen(3,10));
		ListaDobleNormalExamen l3 = new ListaDobleNormalExamen();
		l3.adicionarFinal(new Examen(1,12));
		l3.adicionarFinal(new Examen(2,30));
		l3.adicionarFinal(new Examen(3,35));
		ListaDobleNormalExamen l4 = new ListaDobleNormalExamen();
		l4.adicionarFinal(new Examen(1,20));
		l4.adicionarFinal(new Examen(2,20));
		l4.adicionarFinal(new Examen(3,20));
		
		PilaEstudiante p1=new PilaEstudiante();
		p1.adicionar(new Estudiante("alan",100, l1));
		p1.adicionar(new Estudiante("nestor",101, l2));
		PilaEstudiante p2=new PilaEstudiante();
		p2.adicionar(new Estudiante("diana",104, l3));
		p2.adicionar(new Estudiante("liz",106, l4));		
		
		A.adicionarFinal(new Materia("progra 1","inf-111",p1));
		A.adicionarFinal(new Materia("progra 2","inf-121",p2));

		//A.mostrar();
		//Inciso a)
		//recorrerMaterias(A.getP());
		
		//Inciso b)
		//recMat(A.getP());
	
		//Inciso c)
		if(verificarMat(A.getP(), "nestor", "progra 2", 0)) {
			System.out.println("Existe este estudiante!");
			
		}else {
			System.out.println("NO existe!!");
		}
		
		
	}
}
