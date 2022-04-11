/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author valen
 */
public abstract class FiguraGeometrica {
    private Color borde;
    private Color colorRelleno;
    private boolean direccionArriba;
    private boolean direccionAdelante;
    private boolean maquina;
    private Rectangle area;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(Color borde, Color colorRelleno, boolean direccionArriba, boolean direccionAdelante, boolean maquina) {
        this.borde = borde;
        this.colorRelleno = colorRelleno;
        this.direccionArriba = direccionArriba;
        this.direccionAdelante = direccionAdelante;
        this.maquina = maquina;
        this.area = null;
    }

    public abstract void actualizar_area();
    
    /**
     * @return the borde
     */
    public Color getBorde() {
        return borde;
    }

    /**
     * @param borde the borde to set
     */
    public void setBorde(Color borde) {
        this.borde = borde;
    }

    /**
     * @return the colorRelleno
     */
    public Color getColorRelleno() {
        return colorRelleno;
    }

    /**
     * @param colorRelleno the colorRelleno to set
     */
    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    /**
     * @return the direccionArriba
     */
    public boolean isDireccionArriba() {
        return direccionArriba;
    }

    /**
     * @param direccionArriba the direccionArriba to set
     */
    public void setDireccionArriba(boolean direccionArriba) {
        this.direccionArriba = direccionArriba;
    }

    /**
     * @return the direccionAdelante
     */
    public boolean isDireccionAdelante() {
        return direccionAdelante;
    }

    /**
     * @param direccionAdelante the direccionAdelante to set
     */
    public void setDireccionAdelante(boolean direccionAdelante) {
        this.direccionAdelante = direccionAdelante;
    }

    /**
     * @return the maquina
     */
    public boolean isMaquina() {
        return maquina;
    }

    /**
     * @param maquina the maquina to set
     */
    public void setMaquina(boolean maquina) {
        this.maquina = maquina;
    }

    /**
     * @return the area
     */
    public Rectangle getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(Rectangle area) {
        this.area = area;
    }
    
    
}
