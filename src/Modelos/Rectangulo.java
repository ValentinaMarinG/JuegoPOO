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
public class Rectangulo extends FiguraEstandar{
    private int base;
    private int altura;

    public Rectangulo() {
        super(false, false, false, 0, 0);
    }

    public Rectangulo(Color borde, Color colorRelleno, boolean direccionArriba, boolean direccionAdelante, boolean maquina, int x, int y, int base, int altura) {
        super(borde, colorRelleno, direccionArriba, direccionAdelante, maquina, x, y);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(Color borde, Color colorRelleno, boolean direccionArriba, boolean direccionAdelante, boolean maquina, int base, int altura) {
        super(borde, colorRelleno, direccionArriba, direccionAdelante, maquina, 0, 0);
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
