/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author print
 */
public class Principal {
        
    
        //
    
    
        //
    
    
        //
    
    
	public static void main(String[] args) {
		ArbolBinarioNormalPersona A=new ArbolBinarioNormalPersona();
                nodoPersona raiz=new nodoPersona();
                A.setRaiz(raiz);
                A.crear(A.getRaiz());
                A.preOrden(A.getRaiz());
                
                
	}
}
