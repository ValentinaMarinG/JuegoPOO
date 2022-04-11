/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.Color;

/**
 *
 * @author valen
 */
public class Imagen extends FiguraEstandar{
    private String ruta;
    private int ancho;
    private int alto;

    public Imagen() {
        super(false, false, false, 0, 0);
    }

    public Imagen(boolean direccionArriba, boolean direccionAdelante, int x, int y, String ruta, int ancho, int alto) {
        super(null, null, direccionArriba, direccionAdelante,false, x, y);
        this.ruta = ruta;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Imagen(boolean direccionArriba, boolean direccionAdelante, boolean maquina, int x, int y, String ruta, int ancho, int alto) {
        super(null, null, direccionArriba, direccionAdelante, maquina, x, y);
        this.ruta = ruta;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
}
