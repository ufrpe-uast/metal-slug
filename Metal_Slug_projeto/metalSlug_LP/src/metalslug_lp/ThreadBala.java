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
    public char direcao;
    

    ThreadBala( Bala balaP,  Cenario cenario,char direcao) {
        bala = balaP;
        this.cenario = cenario;
        this.direcao=direcao;
    }

    @Override
    public void run() {
        
        while (!fimThread) {
            
            if(direcao=='d'){
            getBala().setLocation((int) (getBala().getX() + 1), getBala().getY());
            this.bala.posicao=getBala().getX();
            }
            else if(direcao=='e'){
            getBala().setLocation((int) (getBala().getX() - 1), getBala().getY());
            this.bala.posicao=getBala().getX();
            }
            try {
                sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadInimigo.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (getBala().getX() >= 600) {
                finalBala();
            }
            
            if(cenario.inimigo.posicao==this.bala.posicao){
                cenario.inimigo.life-=50;
                finalBala();
                
            }
        }
        cenario.repaint();
    }
    
    public void finalBala(){
        cenario.remove(getBala());
        setFimThread(true);
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
