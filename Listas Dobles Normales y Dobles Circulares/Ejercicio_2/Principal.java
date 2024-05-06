package Ejercicio_2;

public class Principal {

	// a) verificar

	static boolean verificarAsiento(ListaDobleNormalAsiento A, String x, int y) {
		int check = 0;
		nodoAsiento r = A.getP();
		while (r != null) {
			if (r.getX().getFila().equals(x) && r.getX().getColumna() == y) {
				check = 1;
			}
			r = r.getSig();
		}

		// se cumple que el asiento esta disponible
		// si no esta siendo usado por algun cliente
		// check=0

		if (check == 0) {
			return true;
		} else {
			return false;
		}

	}
	
	
	//inciso b)
	static void cambiarAsiento(ListaDobleNormalAsiento A, ListaDobleNormalCliente B, String X) {
		//recorremos la lista de clientes
		nodoCliente r1=B.getP();
		nodoAsiento r2=A.getP();
		while(r1!=null) {
			//pregunto si existe el cliente con ese nombre
			//asumiendo que todos los nombres seran diferentes
			if(r1.getX().getNombreCliente().equals(X)) {
				//debemos ver si podemos cambiar su asiento
				//a una columna anterior
				//obtenemos los valores del asiento de r
				String fila=r2.getX().getFila();
				int columna=r2.getX().getColumna();
				if(verificarAsiento(A,fila,columna-1) && columna-1>=1) {
					//le cambiamos de asiento al cliente 
					r2.getX().setColumna(columna-1);
				}	
			}
			r1=r1.getSig();
			r2=r2.getSig();
		}		
	}
	

	public static void main(String[] args) {
		ListaDobleNormalAsiento A = new ListaDobleNormalAsiento();
		ListaDobleNormalCliente B = new ListaDobleNormalCliente();

		// 4
		A.adicionarFinal(new Asiento(1, "A"));
		A.adicionarFinal(new Asiento(6, "G"));
		A.adicionarFinal(new Asiento(7, "B"));
		A.adicionarFinal(new Asiento(2, "A"));

		B.adicionarFinal(new Cliente("C1", 100));
		B.adicionarFinal(new Cliente("C2", 105));
		B.adicionarFinal(new Cliente("C3", 102));
		B.adicionarFinal(new Cliente("C4", 108));

		A.mostrar();
		B.mostrar();
		
		//inciso a)
		if(verificarAsiento(A, "G", 7)) {
			System.out.println("Libre!");
		}else {
			System.out.println("No libre!");
		}
		
		
		//inciso b)
		cambiarAsiento(A,B,"C4");
		A.mostrar();
		B.mostrar();
		
	}

}
