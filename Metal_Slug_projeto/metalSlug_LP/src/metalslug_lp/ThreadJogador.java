/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Izaquiel
 */
public class ThreadJogador extends Thread {
    public Cenario cenario;
    public Jogador jogador;
    
    ThreadJogador(Cenario C,Jogador J){
        this.cenario=C;
        jogador=J;
    }
    
    @Override
    public void run() {
        while (true) {
            cenario.repaint();
            
            
            
            try {
                sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadInimigo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
