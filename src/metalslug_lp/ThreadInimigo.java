/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Izaquiel
 */
public class ThreadInimigo extends Thread {
    Inimigo inimigo;
    
    ThreadInimigo(final Inimigo inimigoP){
        inimigo=inimigoP;
        new Thread(){
        
            
        @Override
        public void run(){
            while(true) {
                inimigo.setLocation((int) (inimigo.getX()-1),
                inimigo.getY());  
                //System.out.println("%ola");                
                try {
                    sleep(80);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadInimigo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
           }
        }.start();
    
    }
}
