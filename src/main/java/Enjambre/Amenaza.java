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
public class Amenaza extends Objetos {

    private int posX;
    private int posY;
    private boolean activo;

    private int vida;

    public Amenaza(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.activo = true;
        this.vida = 10;
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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public boolean confirmAmenaza(int x, int y)
    {
        return x==this.posX && y==this.posY;
    }
    
    public void quitarVida()
    {
        this.vida--;
    }
    
    public void setNewPosition(int x, int y)
    {
        this.posX = x;
        this.posY = y;
    }
}
