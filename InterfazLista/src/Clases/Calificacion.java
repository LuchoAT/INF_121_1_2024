/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author print
 */
public class Calificacion {
    private int nota,ci;

    public int getNota() {
        return nota;
    }

    public int getCi() {
        return ci;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Calificacion(int nota, int ci) {
        this.nota = nota;
        this.ci = ci;
    }
    public Calificacion() {
      nota=ci=0;
    }
    
    
}
