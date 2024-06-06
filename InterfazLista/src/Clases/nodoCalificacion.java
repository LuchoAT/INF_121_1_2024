/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author print
 */
public class nodoCalificacion {
    private nodoCalificacion sig;
    private Calificacion x;

    public nodoCalificacion getSig() {
        return sig;
    }

    public Calificacion getX() {
        return x;
    }

    public void setSig(nodoCalificacion sig) {
        this.sig = sig;
    }

    public void setX(Calificacion x) {
        this.x = x;
    }
    public nodoCalificacion(){
        sig=null;
    }
}
