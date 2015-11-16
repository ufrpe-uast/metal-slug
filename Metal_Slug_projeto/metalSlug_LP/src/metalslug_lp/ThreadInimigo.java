/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author Izaquiel
 */
public class ThreadInimigo extends Thread {
    public Inimigo inimigo;
    public Cenario cenario;
    private boolean fimThread = false;
    
            
    
    
    ThreadInimigo(final Inimigo inimigoP, Cenario c){
        inimigo=inimigoP;
        cenario=c;
        }
        
            
        @Override
        public void run(){
            while(!fimThread) {
                inimigo.setLocation((int) (inimigo.getX()-1),
                inimigo.getY());  
                inimigo.posicao=inimigo.getX();       
                
                if(inimigo.life==0){
                    inimigo.setIcon(new ImageIcon("src/metalslug_lp/rebels.101.gif"));
                    try {
                    sleep(1000);
                    cenario.repaint();
                    } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadInimigo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    cenario.remove(getInimigo());
                    setFimThread(true);
                    cenario.novoInimigo();
                    cenario.ajusteFundo();
                }
                try {
                    sleep(80);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadInimigo.class.getName()).log(Level.SEVERE, null, ex);
                }  
            }
        }

            private void setFimThread(boolean fimThread) {
                this.fimThread = fimThread;
            }
            
            public boolean isFimThread() {
            return fimThread;
            }

            public Inimigo getInimigo() {
                return inimigo;
            }
            
            public void setBala(Inimigo inimigo) {
            this.inimigo = inimigo;
            }

            
        
} 

