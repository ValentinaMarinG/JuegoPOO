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
public class Circulo extends FiguraEstandar{
    private int radio;

    public Circulo() {
        super(false, false, false, 0, 0);
    }

    public Circulo(Color borde, Color colorRelleno, boolean direccionArriba, boolean direccionAdelante, boolean maquina, int x, int y, int radio) {
        super(borde, colorRelleno, direccionArriba, direccionAdelante, maquina, x, y);
        this.radio = radio;
        actualizar_area();
    }

    @Override
    public void actualizar_area() {
        Rectangle area = new Rectangle(this.getX(), this.getY(), 2*radio, 2*radio);
        this.setArea(area);
    }
    
    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
}
