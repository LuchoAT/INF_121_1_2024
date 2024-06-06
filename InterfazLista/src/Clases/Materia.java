/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author print
 */
public class Materia {
    private String nombreMateria,sigla;
    private ListaSimpleNormalCalificacion LSC;

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getSigla() {
        return sigla;
    }

    public ListaSimpleCalificacion getLSC() {
        return LSC;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setLSC(ListaSimpleNormalCalificacion LSC) {
        this.LSC = LSC;
    }

    public Materia(String nombreMateria, String sigla, ListaSimpleNormalCalificacion LSC) {
        this.nombreMateria = nombreMateria;
        this.sigla = sigla;
        this.LSC = LSC;
    }
    
    public Materia() {
       nombreMateria=sigla="";
       LSC=new ListaSimpleNormalCalificacion();
    }
    
    
}
