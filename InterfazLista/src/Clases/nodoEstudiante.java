/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author print
 */
public class nodoEstudiante {
    private nodoEstudiante sig;
    private Estudiante x;

    public nodoEstudiante getSig() {
        return sig;
    }

    public Estudiante getX() {
        return x;
    }

    public void setSig(nodoEstudiante sig) {
        this.sig = sig;
    }

    public void setX(Estudiante x) {
        this.x = x;
    }
    public nodoEstudiante(){
        sig=null;
    }
}
