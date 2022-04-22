
package Treads;

import Enjambre.Tablero;

/**
 *
 * @author david
 */
public class ThreadPlay extends Thread {
    private boolean isRunning = true;
    private Tablero refPantalla;
    
    public ThreadPlay(Tablero refPantalla){
        this.refPantalla = refPantalla;
    }
    
    public void run()
    {
        while(isRunning){
            try {
                sleep(500);
                refPantalla.playOneTime();
            } catch (InterruptedException ex) {
                return;
            }
        }
        refPantalla.enabledBtns();
    }
    
    public void stopThread()
    {
        this.isRunning = false;
    }
}
