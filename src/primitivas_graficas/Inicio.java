/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivas_graficas;

import Modelos.Circulo;
import Modelos.Cuadrado;
import Modelos.Imagen;
import Modelos.Rectangulo;
import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author valen
 */
public class Inicio extends javax.swing.JFrame {
        Imagen player;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.player=new Imagen(false, false, false, 200, 500, "src/Imagenes/transbordador-espacial.png", 50, 70);
        this.lienzo1.getFiguras().add(this.player);
        
        Imagen asteroide_1 =new Imagen(true, false, true, 200, 0, "src/Imagenes/asteroide.png", 80, 60);
        this.lienzo1.getFiguras().add(asteroide_1);
        
        Imagen asteroide_2 =new Imagen(true, false, true, 300, 0, "src/Imagenes/asteroide (1).png", 90, 90);
        this.lienzo1.getFiguras().add(asteroide_2);
        
        Imagen asteroide_3 =new Imagen(true, false, true, 250, 0, "src/Imagenes/asteroide (2).png", 80, 90);
        this.lienzo1.getFiguras().add(asteroide_3);
        
        Imagen asteroide_4 =new Imagen(true, false, true, 100, 0, "src/Imagenes/asteroide (3).png", 80, 80);
        this.lienzo1.getFiguras().add(asteroide_4);
        
        Imagen meteorito =new Imagen(true, false, true, 400, 0, "src/Imagenes/meteorito.png", 80, 80);
        this.lienzo1.getFiguras().add(meteorito);
        
        //Circulo laserCohete = new Circulo(Color.ORANGE, Color.YELLOW, false, false, true, this.player.getX()+22, this.player.getY(), 5);
        //this.lienzo1.getFiguras().add(laserCohete);
        
//        for (int i = 0; i < 10; i++) {
//            int random = (int) Math.ceil(Math.random()*25);
//            System.out.println(random);
//        }
        
//        for (int i = 0; i < 10; i++) {
//            int random = ThreadLocalRandom.current().nextInt(0, 10);
//            System.out.println(random);
//        }
        
        Thread proceso = new Thread(this.lienzo1);
        this.lienzo1.setJugando(true);
        proceso.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo1 = new primitivas_graficas.Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lienzo1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        this.setFocusable(true);
        if(evt.getKeyChar() == 'w'){
            //this.player.setY(this.player.getY()-20);
        }else if(evt.getKeyChar() == 'a'){
            this.player.setX(this.player.getX()-20);
        }else if(evt.getKeyChar() == 's'){
            //this.player.setY(this.player.getY()+20);
        }else if(evt.getKeyChar() == 'd'){
            this.player.setX(this.player.getX()+20);
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private primitivas_graficas.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables
}
