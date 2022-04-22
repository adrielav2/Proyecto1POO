
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enjambre;

/**
 *
 * @author Ana
 */
public class Obstaculo extends Objetos{
    private int posX;
    private int posY;
    private boolean activo;
    
    public Obstaculo(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.activo = true;
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
    
}