/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enjambre;

import java.util.ArrayList;

/**
 *
 * @author Ana
 */
public class Recurso extends Objetos {

    protected int posX;
    protected int posY;
    protected int posX2;
    protected int posY2;
    protected int posX3;
    protected int posY3;
    protected int posX4;
    protected int posY4;
    protected boolean activo;
    protected int vida;

    public Recurso(int posX, int posY, int posX2, int posY2, int posX3, int posY3, int posX4, int posY4) {
        this.posX = posX;
        this.posY = posY;
        this.posX2 = posX2;
        this.posY2 = posY2;
        this.posX3 = posX3;
        this.posY3 = posY3;
        this.posX4 = posX4;
        this.posY4 = posY4;
        this.activo = true;
        this.vida = 4;
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public boolean isActivo() {
        return activo;
    }

    @Override
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void quitarVida() {
        this.vida = this.vida - 1;
    }

    public int getVida() {
        return this.vida;
    }

    public void setNewPosition(int x, int y, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.posX = x;
        this.posY = y;
        this.posX2 = x2;
        this.posY2 = y2;
        this.posX3 = x3;
        this.posY3 = y3;
        this.posX4 = x4;
        this.posY4 = y4;
    }

    public boolean isTheObject(int x, int y) {
        if (x == posX && y == posY) {
            return true;
        } else if (x == posX2 && y == posY2) {
            return true;
        } else if (x == posX3 && y == posY3) {
            return true;
        } else if (x == posX4 && y == posY4) {

        } else {
            return false;
        }
        return false;
    }
}
