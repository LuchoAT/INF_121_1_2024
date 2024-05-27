package Ejercicio4;

import java.util.Scanner;

public class Principal {
	
	
	static void mostrarMayor(int M[][], int i, int j, int mayor, int N) {
		if(i<N) {
			//podemos seguir llamando?
			if(j<N) {
				//M[i][j]
				//i=2
				//j=4
				if(M[i][j]>mayor) {
					mayor=M[i][j];
				}
				mostrarMayor(M,i,j+1,mayor,N);
			}else {
				//como j ya no cumple nos vamos
				//a la sig fila
				System.out.println("El mayor de la fila "+i+" es "+mayor);
				mayor=0;
				mostrarMayor(M,i+1,0,mayor,N);
			}
		}
	}
		
	
	static void mostrarDiagonal(int M[][], int i, int N) {
		if(i<N) {
			System.out.println(M[i][i]);
			mostrarDiagonal(M,i+1,N);
		}		
	}
	
	static void intercambiar(int M[][], int i1,int j1, int i2, int j2, int N) {
		if(i1<N) {
			int aux=M[i1][j1];
			M[i1][j1]=M[i2][j2];
			M[i2][j2]=aux;
			intercambiar(M,i1+1,j1, i2,j2+1,N);
		}		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M[][]=new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				M[i][j]=sc.nextInt();
			}
		}
		//Inciso a)
		mostrarMayor(M,0,0,0,N);
		//Inciso b)
		mostrarDiagonal(M, 0, N);
		//Inciso c)
		int i=2;
		intercambiar(M,i,0,0,i,N);
		for(int k=0;k<N;k++) {
			for(int l=0;l<N;l++) {
				System.out.print(M[k][l]+" ");
			}
			System.out.println();
		}
	
	}

}
