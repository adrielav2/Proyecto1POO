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
public class Recurso extends Objetos{
    private int posX;
    private int posY;
    private int posX2;
    private int posY2;
    private int posX3;
    private int posY3;
    private int posX4;
    private int posY4;
    private boolean activo;
    private int[] POSX = new int[4];    
    private int[] POSY = new int[4];
    private int vida;
    

    public Recurso(int posX, int posY, int posX2, int posY2, int posX3, int posY3, int posX4,int posY4) {
        this.posX = posX;
        this.posY = posY;
        this.posX2 = posX2;
        this.posY2 = posY2;
        this.posX3 = posX3;
        this.posY3 = posY3;
        this.posX4 = posX4;
        this.posY4 = posY4;
        this.POSX[0]= posX;
        this.POSX[1]= posX2;
        this.POSX[2]= posX3;
        this.POSX[3]= posX4;
        this.POSY[0]= posY;
        this.POSY[1]= posY2;
        this.POSY[2]= posY3;
        this.POSY[3]= posY4;
        this.activo = true;
        this.vida=10;
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
    
    public int[] getPOSX(){
        return POSX;
    }
        
    public int[] getPOSY(){
        return POSY;
    }
    
    public void quitarVida(){
        this.vida= this.vida-1;
    }
     
    public int getVida(){
        return this.vida;
    }
    
}
