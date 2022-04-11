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
public class Cuadrado extends FiguraEstandar{
    private int lado;

    public Cuadrado() {
        super(false, false, false, 0, 0);
    }

    public Cuadrado(Color borde, Color colorRelleno, boolean direccionArriba, boolean direccionAdelante, boolean maquina, int x, int y, int lado) {
        super(borde, colorRelleno, direccionArriba, direccionAdelante, maquina, x, y);
        this.lado = lado;
    }

    @Override
    public void actualizar_area() {
        Rectangle area = new Rectangle(this.getX(), this.getY(), lado, lado);
        this.setArea(area);
    }
    
    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }
    
}
