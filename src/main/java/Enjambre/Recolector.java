
package Enjambre;

public class Recolector extends AgenteBase {

    private int posX, posY;
    private boolean ocupado;//Si ocupado = true, quiere decir que ya recogio el recurso

    private boolean tarea;
    private int obPosX, obPosY;
    
    boolean perdido;
    int movPorPerdido = 10;
    
    public boolean saliendoDeEnjambre;
    public int pasosAfuera;

    public Recolector(int vida, int posX, int posY) {
        super(vida);
        this.posX = posX;
        this.posY = posY;
        this.ocupado = false;
        this.perdido = false;
        this.saliendoDeEnjambre = false;
        this.pasosAfuera = 10;
    }

    public void setPosition(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void setPositionOfObject(int posX, int posY) {
        this.obPosX = posX;
        this.obPosY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
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
}
