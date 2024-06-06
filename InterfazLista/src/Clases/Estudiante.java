/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author print
 */
public class Estudiante {
       private String nombre;
       private int ci;

    public String getNombre() {
        return nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Estudiante(String nombre, int ci) {
        this.nombre = nombre;
        this.ci = ci;
    }
       
    
}
