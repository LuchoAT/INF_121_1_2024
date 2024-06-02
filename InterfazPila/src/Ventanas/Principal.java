/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author print
 */
public class Principal extends javax.swing.JFrame {
    
    private PilaEstudiante A=new PilaEstudiante();

    public PilaEstudiante getA() {
        return A;
    }

    public void setA(PilaEstudiante A) {
        this.A = A;
    }
    
    
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla_interfaz = new javax.swing.JTable();
        botonMostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoCI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoCalcular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonCalcular = new javax.swing.JButton();
        botonAdicionar = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        titulo.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Pila de Estudiantes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(690, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 780, 60));

        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel1.setText("Cargar Estudiantes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel2.setText("Mostrar Estudiantes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jScrollPane1.setViewportView(pantalla_interfaz);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 410, 200));

        botonMostrar.setText("Mostrar");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabel3.setText("Introducir el CI del estudiante a eliminar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        campoCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCIActionPerformed(evt);
            }
        });
        getContentPane().add(campoCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, 30));

        jLabel4.setText("intro CI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("SimSun-ExtB", 3, 18)); // NOI18N
        jLabel5.setText("Mostrar nota final");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        campoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(campoCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 30));

        jLabel6.setText("Intro CI");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(botonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        botonAdicionar.setText("Adicionar");
        botonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo2.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        // TODO add your handling code here:
        A.llenar();
        JOptionPane.showMessageDialog(null, "Llenado exitoso!");
    }//GEN-LAST:event_botonCargarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        // TODO add your handling code here:
        String titulos[]={"Nombre","CI","Nota 1","Nota 2","Nota 3"};
        DefaultTableModel pantalla=new DefaultTableModel(null,titulos);
        PilaEstudiante aux=new PilaEstudiante();
        while(!A.esVacia()){
            Estudiante x=A.eliminar();            
            String fila[]={x.getNombre(),Integer.toString(x.getCI()),Integer.toString(x.getNota1()),Integer.toString(x.getNota2()),Integer.toString(x.getNota3())};
            pantalla.addRow(fila);
            aux.adicionar(x);
        }
        A.vaciar(aux);
        pantalla_interfaz.setModel(pantalla);        
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void campoCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCIActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        try {
            int CIX=Integer.parseInt(campoCI.getText());
            PilaEstudiante aux=new PilaEstudiante();
            int existe=0;
            while(!A.esVacia()){
                Estudiante x=A.eliminar();
                if(x.getCI()==CIX){
                    //eliminamos x
                    existe=1;
                }else{
                    aux.adicionar(x);
                }             
            }
            A.vaciar(aux);
            if(existe==1){
                JOptionPane.showMessageDialog(null, "Estudiante eliminado");            
            }else{
                JOptionPane.showMessageDialog(null, "Estudiante no encontrado!");            
            }         
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Insertar datos validos!!");
        }
        campoCI.setText("");
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void campoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCalcularActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        // TODO add your handling code here:
        
          try {
            int CIX=Integer.parseInt(campoCalcular.getText());
            PilaEstudiante aux=new PilaEstudiante();
            int SUMA=0;
            String nombre="";
            int existe=0;
            while(!A.esVacia()){
                Estudiante x=A.eliminar();
                if(x.getCI()==CIX){
                    //eliminamos x
                    SUMA=x.getNota1()+x.getNota2()+x.getNota3();
                    nombre=x.getNombre();
                    existe=1;
                }
                aux.adicionar(x);           
            }
            A.vaciar(aux);
            if(existe==1){
                if(SUMA>=51){
                    JOptionPane.showMessageDialog(null, "Estudiante: "+nombre+", NotaFinal:  "+SUMA+", Resultado = APROBO");                            
                }else{
                    JOptionPane.showMessageDialog(null, "Estudiante: "+nombre+", NotaFinal:  "+SUMA+", Resultado = REPROBO");                            
                }
            }else{
                JOptionPane.showMessageDialog(null, "El Estudiante no Existe!");            
            }         
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Insertar datos validos!!");
        }
        campoCalcular.setText("");           
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void botonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdicionarActionPerformed
        // TODO add your handling code here:
        Adicionar v2=new Adicionar(this);
        v2.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botonAdicionarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton botonAdicionar;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoCI;
    private javax.swing.JTextField campoCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pantalla_interfaz;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
