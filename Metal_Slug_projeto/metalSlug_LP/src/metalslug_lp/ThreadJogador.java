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
import javax.swing.JOptionPane;

/**
 *
 * @author Izaquiel
 */
public class ThreadJogador extends Thread {
    public Cenario cenario;
    public Jogador jogador;
    private boolean fimThread = false;
    
    ThreadJogador(Cenario C,Jogador J){
        this.cenario=C;
        jogador=J;
    }
    
    @Override
    public void run() {
        while(!fimThread) {
            cenario.repaint();
            if(jogador.life==0){
                    jogador.setIcon(new ImageIcon("src/metalslug_lp/rebels.101.gif"));
                    try {
                    sleep(1000);
                    cenario.repaint();
                    } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadInimigo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    cenario.remove(getJogador());
                    setFimThread(true);
                    cenario.novoInimigo();
                    cenario.removeAll();
                    cenario.repaint();
                    JOptionPane.showMessageDialog(null, jogador.nome+", você matou "+jogador.pontos+" inimigos");
                    System.exit(0);
            }
        }
    }
    
    private void setFimThread(boolean fimThread) {
                this.fimThread = fimThread;
            }
            
            public boolean isFimThread() {
            return fimThread;
            }

            public Jogador getJogador() {
                return jogador;
            }
            
            public void setBala(Jogador jogador) {
            this.jogador = jogador;
            }
}
