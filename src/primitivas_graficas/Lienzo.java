/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivas_graficas;

import Modelos.Circulo;
import Modelos.Cuadrado;
import Modelos.FiguraEstandar;
import Modelos.FiguraGeometrica;
import Modelos.Imagen;
import Modelos.Rectangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author valen
 */
public class Lienzo extends javax.swing.JPanel implements Runnable {

    private LinkedList<FiguraGeometrica> figuras;
    private LinkedList<FiguraGeometrica> asteroides;
    private boolean Jugando;
    int segundo;

    /**
     * Creates new form Lienzo
     */
    public Lienzo() {
        initComponents();
        this.figuras = new LinkedList<>();
        this.asteroides = new LinkedList<>();
        this.Jugando = false;
        this.segundo = 0;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujarFiguras(g);
    }

    public void dibujarFiguras(Graphics g) {
        for (FiguraGeometrica figuraActual : this.getFiguras()) {
            if (figuraActual instanceof Cuadrado) {
                dibujarCuadrado(g, ((Cuadrado) figuraActual));
            } else if (figuraActual instanceof Circulo) {
                dibujarCirculo(g, ((Circulo) figuraActual));
            } else if (figuraActual instanceof Imagen) {
                dibujarImagen(g, ((Imagen) figuraActual));
            } else if (figuraActual instanceof Rectangulo) {
                dibujarRectangulo(g, (Rectangulo) figuraActual);
            }
        }
    }

    public void disparar_laser(Graphics g) {
        int contador = 0;
        FiguraGeometrica laser = buscarLaser();
        while (contador <= 3) {
            dibujarCirculo(g, (Circulo) laser);
            contador++;
        }
    }

    public FiguraGeometrica buscarLaser() {
        FiguraGeometrica laser = null;
        int i = 0;
        while (laser != null) {
            if (this.figuras.get(i).equals("laserCohete")) {
                laser = this.figuras.get(i);
            }
            i++;
        }
        return laser;
    }

    public void dibujar_asteroides(Graphics g) {
        while (this.isJugando()) {
            for (FiguraGeometrica asteroide_actual : this.asteroides) {
                dibujarImagen(g, (Imagen) asteroide_actual);
            }
        }
    }

    public void dispararLaser(Graphics g, Circulo Laser) {
        int contador = 0;
        while (contador <= 3) {
            dibujarCirculo(g, Laser);
            contador++;
            esperar(5);
        }
    }

    public void dibujarRectangulo(Graphics g, Rectangulo elRectangulo) {
        g.setColor(elRectangulo.getColorRelleno());
        g.fillRect(elRectangulo.getX(), elRectangulo.getY(), elRectangulo.getBase(), elRectangulo.getAltura());
        g.setColor(elRectangulo.getBorde());
        g.drawRect(elRectangulo.getX(), elRectangulo.getY(), elRectangulo.getBase(), elRectangulo.getAltura());
    }

    public void dibujarCuadrado(Graphics g, Cuadrado elCuadrado) {
        g.setColor(elCuadrado.getColorRelleno());
        g.fillRect(elCuadrado.getX(), elCuadrado.getY(), elCuadrado.getLado(), elCuadrado.getLado());
        g.setColor(elCuadrado.getBorde());
        g.drawRect(elCuadrado.getX(), elCuadrado.getY(), elCuadrado.getLado(), elCuadrado.getLado());
    }

    public void dibujarCirculo(Graphics g, Circulo elCirculo) {
        g.setColor(elCirculo.getColorRelleno());
        g.fillOval(elCirculo.getX(), elCirculo.getY(), elCirculo.getRadio(), elCirculo.getRadio());
        g.setColor(elCirculo.getBorde());
        g.drawOval(elCirculo.getX(), elCirculo.getY(), elCirculo.getRadio(), elCirculo.getRadio());
    }

    public void dibujarImagen(Graphics g, Imagen laImagen) {
        Toolkit T = Toolkit.getDefaultToolkit();
        Image imagen = T.getImage(laImagen.getRuta());
        g.drawImage(imagen, laImagen.getX(), laImagen.getY(), laImagen.getAncho(), laImagen.getAlto(), this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        while (this.isJugando()) {
            validarDirecciones();
            System.out.println(""+segundo);
            if(segundo %100 == 0){
                System.out.println("generar");
                Imagen asteroide_1 =new Imagen(true, false, true, 200, 0, "src/Imagenes/asteroide.png", 80, 60);
                this.figuras.add(asteroide_1);
            }
            repaint();
            esperar(20);
        }
    }
    public void validarDirecciones(){
        for (FiguraGeometrica Actual : this.getFiguras()) {
            if (Actual instanceof FiguraEstandar) {
                if(Actual.isMaquina()){
//                            if (Actual.isDireccionAdelante()) {
//                                ((FiguraEstandar) Actual).setX(((FiguraEstandar) Actual).getX() + 1);
//                            } else {
//                                ((FiguraEstandar) Actual).setX(((FiguraEstandar) Actual).getX() - 1);
//                            }
                    if (Actual.isDireccionArriba()) {
                        ((FiguraEstandar) Actual).setY(((FiguraEstandar) Actual).getY() + 1);
                    } else {
                        ((FiguraEstandar) Actual).setY(((FiguraEstandar) Actual).getY() - 1);
                    }
                }else{
                    verificarColision(Actual);
                    boolean colision = verificarColision((FiguraEstandar)Actual);
                    System.out.println(colision);
                    if (colision) {
                        this.Jugando = false;
                        JOptionPane.showMessageDialog(this, "Game out");
                    }
                }
                Actual.actualizar_area();
            }   
        }
    }
    public void esperar(int milisegundos) {
        this.segundo++;
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int metodo_random(int valorMin, int valorMax) {
        int NumRandom = ThreadLocalRandom.current().nextInt(valorMin, valorMax);
        return NumRandom;
    }

    public boolean verificarColision(FiguraGeometrica jugador) {
        boolean respuesta = false;
        int i = 0;
        while (i < this.figuras.size() && !respuesta) {
            if (jugador != this.figuras.get(i) && jugador.getArea().intersects(this.figuras.get(i).getArea())) {
                respuesta = true;
            }
            i++;
        }

        return respuesta;
    }

    public void validarFrontera(FiguraEstandar laFigura) {
        if (laFigura.getX() >= 520) {
            laFigura.setDireccionAdelante(false);
        } else if (laFigura.getX() <= 1) {
            laFigura.setDireccionAdelante(true);
        }
    }

    /**
     * @return the asteroides
     */
    public LinkedList<FiguraGeometrica> getAsteroides() {
        return asteroides;
    }

    /**
     * @param asteroides the asteroides to set
     */
    public void setAsteroides(LinkedList<FiguraGeometrica> asteroides) {
        this.asteroides = asteroides;
    }

    /**
     * @return the figuras
     */
    public LinkedList<FiguraGeometrica> getFiguras() {
        return figuras;
    }

    /**
     * @param figuras the figuras to set
     */
    public void setFiguras(LinkedList<FiguraGeometrica> figuras) {
        this.figuras = figuras;
    }

    /**
     * @return the estaJugando
     */
    public boolean isJugando() {
        return Jugando;
    }

    /**
     * @param estaJugando the estaJugando to set
     */
    public void setJugando(boolean estaJugando) {
        this.Jugando = estaJugando;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
