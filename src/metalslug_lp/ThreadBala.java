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
    
    private boolean fimThread = false;
    private Bala bala;
    private Cenario cenario;

    ThreadBala(Bala balaP,  Cenario cenario) {
        bala = balaP;
        this.cenario = cenario;
    }

    @Override
    public void run() {
        if(cenario.jogador.getSentido() == 'd') {
            while (!fimThread) {
                getBala().setLocation((int) (getBala().getX() + 1), getBala().getY());

                cenario.repaint();

                try {
                    sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadInimigo.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (getBala().getX() < -25 || getBala().getX() > 640) {
                    cenario.remove(getBala());
                    setFimThread(true);
                }
            }
        }
        
        if(cenario.jogador.getSentido() == 'e') {
            while (!fimThread) {
                getBala().setLocation((int) (getBala().getX() - 1), getBala().getY());

                cenario.repaint();
    
                try {
                    sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadInimigo.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (getBala().getX() < -25 || getBala().getX() > 640) {
                    cenario.remove(getBala());
                    setFimThread(true);
                }
            }
        }

    }

    public Bala getBala() {
        return bala;
    }

    public void setBala(Bala bala) {
        this.bala = bala;
    }

    public boolean isFimThread() {
        return fimThread;
    }

    public void setFimThread(boolean fimThread) {
        this.fimThread = fimThread;
    }
    
}
