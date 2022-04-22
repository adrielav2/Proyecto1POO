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
public class Defensor extends AgenteBase{
    int posX, posY;
    private boolean ocupado;//Si ocupado = true, quiere decir que ya recogio el recurso

    private boolean tarea;
    private int obPosX, obPosY;
    
    boolean perdido;
    int movPorPerdido = 10;
    
    private boolean encontreAmenaza;
    
    public boolean saliendoDeEnjambre;
    public int pasosAfuera;
    
    public Defensor(int vida, int posX, int posY) {
        super(vida);
        this.posX = posX;
        this.posY = posY;
        ocupado = false;
        tarea = false;
        perdido = false;
        encontreAmenaza = false;
        saliendoDeEnjambre = false;
        this.pasosAfuera = 10;
    }
    
    public void setPosition(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }
    
    public int getPosY() {
        return posY;
    }
    
    public void setPositionOfObject(int posX, int posY) {
        this.obPosX = posX;
        this.obPosY = posY;
    }
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getObPosX() {
        return obPosX;
    }

    public int getObPosY() {
        return obPosY;
    }

    public void setTarea(boolean bool) {
        this.tarea = bool;
    }
    
    public boolean isTarea()
    {
        return this.tarea;
    }

    public boolean isAmenaza() {
        return encontreAmenaza;
    }

    public void setAmenaza(boolean encontreAmenaza) {
        this.encontreAmenaza = encontreAmenaza;
    }
    
    
}
