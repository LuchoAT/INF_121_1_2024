package Ejercicio_6;

public class Principal {

	static double promedioArchivos(ListaDobleNormalArchivo A, String X) {
		nodoArchivo r = A.getP();
		int nroEle = 0;
		double S = 0;
		while (r != null) {
			if (r.getX().getTipo().equals(X)) {
				nroEle++;
				S += r.getX().getCapacidad();
			}
			r = r.getSig();
		}

		if (nroEle == 0) {
			return -1;
		} else {
			double promedio = (double) S / (double) nroEle;
			return promedio;
		}
	}

	static boolean verificar(ListaDobleNormalArchivo A, String X) {
		int check = 0;
		nodoArchivo r = A.getP();
		while (r != null) {
			// if(condicion1,
			if (r.getX().getTipo().equals(X) && r.getX().getCapacidad() > 50) {
				check = 1;
			}
			r = r.getSig();
		}
		if(check==1) {
			return true;
		}else {
			return false;
		}
	}
	
	//inciso c)

	static void eliminarAnio(ListaDobleNormalArchivo A) {
		nodoArchivo r=A.getP();
		while(r!=null) {
			if(r.getX().getFecha()=="2020") {
				//elimino r de la lista
				if(r==A.getP()) {
					A.setP(r.getSig());
					r.setSig(null);
					if(A.getP()!=null) {
						A.getP().setAnt(null);
					}
					r=A.getP();
				}else {
					nodoArchivo prev=r.getAnt();
					prev.setSig(r.getSig());
					if(r.getSig()!=null) {
						r.getSig().setAnt(prev);
					}
					r.setSig(null);
					r.setAnt(null);
					r=prev.getSig();
				}				
			}else {
				r=r.getSig();
			}
		}	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDobleNormalArchivo A = new ListaDobleNormalArchivo();
		A.adicionarFinal(new Archivo("txt", "2023", 12.34));
		A.adicionarFinal(new Archivo("txt", "2020", 12.34));
		A.adicionarFinal(new Archivo("txt", "2020", 12.34));
		A.adicionarFinal(new Archivo("txt", "2023", 12.34));

		A.mostrar();

		/*// Inciso a)
		System.out.println(promedioArchivos(A, "txt"));
	
		//Inciso b)
		if(verificar(A,"txt")) {
			System.out.println("Existe!");
		}else {
			System.out.println("NO!");
		}*/
		
		//Inciso c)
		eliminarAnio(A);
		A.mostrar();
	
	}
	

}
