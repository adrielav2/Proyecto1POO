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
public class AgenteBase {
    private int vida;
    private boolean recursoRecolectado;
    
    public AgenteBase(int vida)
    {
        this.vida = vida;
        this.recursoRecolectado = false;
    }
    
    public int buscarEnemigo()
    {
        return -1;
    }
}