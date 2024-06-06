/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author print
 */
public class nodoMateria {
    private nodoMateria sig;

    public void setSig(nodoMateria sig) {
        this.sig = sig;
    }

    public void setX(Materia x) {
        this.x = x;
    }
    private Materia x;

    public nodoMateria getSig() {
        return sig;
    }

    public Materia getX() {
        return x;
    }

    public nodoMateria() {
        sig=null;
    }
    
}
