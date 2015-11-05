/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dapine
 */
public class ThreadBala extends Thread {
    
    Bala bala;
    
    ThreadBala(final Bala balaP) {
        bala = balaP;
        
        new Thread() {
        @Override
        public void run(){
            while(true) {
                bala.setLocation((int) (bala.getX()+1), bala.getY());  
                System.out.println("%ola");                
                try {
                    sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadInimigo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

           }
        }.start();
    }
    
}
