/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Treads;

import Enjambre.Tablero;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ana
 */
public class threadTime extends Thread{
    private boolean isRunning = true;
    private int time = 5;
    int x, y, selection;
    Tablero refPantalla;

    public threadTime(Tablero refPantalla) {
        this.refPantalla = refPantalla;
        this.x=0;
        this.y=0;
        this.selection = 0;
    }
    
    
    public void run()
    {
        while(isRunning)
        {
            try {
                changeColor();
                sleep(time);
            } catch (InterruptedException ex) {
                return;
            }
            System.out.println("Todo anda bien");
        }
    }
    
    private void changeColor()
    {
        
        if(x>49)
        {
            y++;
            x=0;
        }
        if(y==50)
        {
            x=0;
            y=0;
            if(selection == 1)
                selection = 0;
            else
                selection = 1;
        }
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        refPantalla.setInBotonesColor(x, y, selection);
        x++;
    }
}
